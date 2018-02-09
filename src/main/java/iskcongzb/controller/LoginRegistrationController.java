package iskcongzb.controller;

import com.sun.org.apache.regexp.internal.RE;
import iskcongzb.Configuration.CustomSuccessHandler;
import iskcongzb.domain.User;
import iskcongzb.services.ServiceInterfaces.UserLoginService;
import iskcongzb.services.ServiceInterfaces.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginRegistrationController {
    @Autowired
    UserRegistrationService userRegistrationService;
    @Autowired
    UserLoginService userLoginService;
    @Autowired
    CustomSuccessHandler customSuccessHandler;
    @RequestMapping(value = "/loginRegistrationPage",method = RequestMethod.GET)
    public String gotoLoginRegistrationPage()
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            String url=customSuccessHandler.determineTargetUrl(auth);
            return "redirect:http://localhost:8090"+url;
        }else {
            return "LoginRegister";
        }
    }

    @RequestMapping(value = "/registrationprocess",method = RequestMethod.POST)
    public String getRegistered(@ModelAttribute User user, Model model, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "LoginRegister";
        }
        String message=userRegistrationService.getRegistered(user);
        model.addAttribute("message",message);
        if(message.equals("Registered Successfully"))
        {
            return "adminPage";
        }
        else{
            return "errorMessagePage";
        }

    }

    @RequestMapping(value = "/loginProcess",method = RequestMethod.GET)
    public String userAuthentication(@ModelAttribute User user, Model model, HttpSession session)
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {


            String url=customSuccessHandler.determineTargetUrl(auth);
            return "redirect:http://localhost:8090"+url;
        }else {
            return "LoginRegister";
        }
    }
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/loginRegistrationPage?logout";
    }
    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("message", getPrincipal());
        return "accessDenied";
    }
    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }

}
