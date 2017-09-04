package iskon.controller;

import iskon.beans.User;
import iskon.model.Serviceinter.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController
{
    @Autowired
    LoginService loginService;
@RequestMapping(value = "/login",method = RequestMethod.POST)
public ModelAndView Authenticate(@ModelAttribute User user, HttpSession session) {
    List<User> userList=loginService.Authenticate(user);
if(userList.isEmpty())
{
    ModelAndView modelAndView=new ModelAndView("login");
    modelAndView.addObject("msg","invalid credentials");
    return modelAndView;
}
else
{
    for(User user1:userList)
    {
        session.setAttribute("username",user1.getFullname());
    }
    ModelAndView modelAndView=new ModelAndView("HariNaameKirtan");
    modelAndView.addObject("user",userList);
    session.setAttribute("useremialid",user.getEmail());
    session.setAttribute("usersession",userList);
    return modelAndView;
}
}

}
