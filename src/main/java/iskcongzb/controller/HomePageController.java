package iskcongzb.controller;

import iskcongzb.domain.User;
import iskcongzb.services.ServiceInterfaces.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {
    @Autowired
    User user;
    @Autowired
    UserRegistrationService userRegistrationService;
    @RequestMapping(value = "/")
    public String gotoHomePage()
    {
        user.setState("Asd");
        user.setAddress("asdd");
        user.setAdminType("USER");
        user.setDeeksha("yes");
        user.setEmail("q@q.com");
        user.setFirstName("asasd");
        user.setLastName("asdasd");
        user.setPassword("123");
        user.setMobileNumber("1231231233");
        user.setRoundsChanting(2);
        user.setUserName("efeeaq");
        userRegistrationService.getRegistered(user);


        user.setState("Asd");
        user.setAddress("asdsd");
        user.setAdminType("Preaching");
        user.setDeeksha("yes");
        user.setEmail("as@s.com");
        user.setFirstName("asasdsss");
        user.setLastName("asdasds");
        user.setPassword("123");
        user.setMobileNumber("1231231243");
        user.setRoundsChanting(2);
        user.setUserName("efeea");
        userRegistrationService.getRegistered(user);
        return "RKS";
    }
    @RequestMapping(value = "/pgRedirect",method = RequestMethod.GET)
    public String redit()
    {
        return "pgRedirect";
    }
    @RequestMapping(value = "/pgResponse.jsp")
    public String rr()
    {
        return "pgResponse.jsp";
    }

}
