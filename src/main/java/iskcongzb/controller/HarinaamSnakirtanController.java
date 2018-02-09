package iskcongzb.controller;

import iskcongzb.domain.HarinaamSankirtan;

import iskcongzb.services.ServiceInterfaces.HarinaamSankirtanBookingService;
import iskcongzb.services.ServiceInterfaces.HarinaamSankirtanRequestListForApprovalService;
import iskcongzb.services.ServiceInterfaces.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.RememberMeAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class HarinaamSnakirtanController {

    @Autowired
    HarinaamSankirtanBookingService harinaamSankirtanBookingService;
    @Autowired
    HarinaamSankirtanRequestListForApprovalService harinaamSankirtanRequestListForApprovalService;
    @Autowired
    UserLoginService userLoginService;
    private boolean isRememberMeAuthenticated() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            return false;
        }

        return RememberMeAuthenticationToken.class.isAssignableFrom(authentication.getClass());
    }
    @RequestMapping(value = "/rathyatra",method = RequestMethod.GET)
    public String trial()
    {
        return "trial";
    }
    @RequestMapping(value = "/bookharinaamsankirtan", method = RequestMethod.POST)
    public String getFormdata(Model model, HttpServletRequest request, @ModelAttribute HarinaamSankirtan harinaamSankirtan,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> list = bindingResult.getAllErrors();
            for (ObjectError objectError : list) {
                System.out.println(objectError.getDefaultMessage());
            }
            model.addAttribute("msg", " Please Try Again ");
            return "HarinaamSankirtanBookingConfirmation";
        } else {
            harinaamSankirtanBookingService.bookHarinaamSankirtan(harinaamSankirtan);
            model.addAttribute("msg", "Your Request Has Been Sent To " + harinaamSankirtan.getHsAdmin() + " For Approval, You Will Get Acknowledgement Soon...! ");
            return "HarinaamSankirtanBookingConfirmation";
        }

    }

    @RequestMapping(value = "/harinaamsankirtanpage", method = RequestMethod.GET)
    public String harinaam() {
        return "Harinaamsankirtanpage";
    }

    @RequestMapping(value = "/harinaamsankirtanbookingpage", method = RequestMethod.GET)
    public String gotoHarinaamSankirtanBookingPage() {
        return "HarinaamSankirtanBookingPage";
    }

    @RequestMapping(value = "/haarinaamAdminPage", method = RequestMethod.GET)
    public ModelAndView gotToHArinaam() {
        List<HarinaamSankirtan> harinaamSankirtanList = harinaamSankirtanRequestListForApprovalService.getListOfAllRequest();
        if (!harinaamSankirtanList.isEmpty()) {
            ModelAndView modelAndView = new ModelAndView("HarinaamAdminViewerPage");
//           modelAndView.addObject("requestlist",harinaamSankirtanList);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("HarinaamAdminViewerPage");
//           modelAndView.addObject("message","No Request Yet");
            return modelAndView;
        }
    }

    @RequestMapping(value = "/harinaamAdminPagePagination", method = RequestMethod.GET)
    public @ResponseBody
    String gotoAdminPage(ModelAndView modelAndView, HttpServletRequest request) {
        String approvedRequest = harinaamSankirtanRequestListForApprovalService.getListOfAllPendingRequest(
                Integer.parseInt(request.getParameter("index")));
        return approvedRequest;

    }

    @RequestMapping(value = "/harinaamSankirtanRequestApprove", method = RequestMethod.GET)
    public @ResponseBody
    String approveRequest(@RequestParam("id") int id) {
        return harinaamSankirtanBookingService.aaceptHarinaamRequest(id);
    }

    @RequestMapping(value = "/harinaamSankirtanRequestDecline", method = RequestMethod.GET)
    public @ResponseBody String declineRequest(@RequestParam("id") int id) {
        return harinaamSankirtanBookingService.declineHarinaamRequest(id);
    }
//    @RequestMapping(value = "/findTemple",method = RequestMethod.POST)
//    public List<Temple> getTempleList()
//    {
//
//    }


    /**
     * Check if user is login by remember me cookie, refer
     * org.springframework.security.authentication.AuthenticationTrustResolverImpl
     */

    /**
     * save targetURL in session
     */

}