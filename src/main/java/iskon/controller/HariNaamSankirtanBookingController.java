package iskon.controller;

import iskon.beans.HariNaamsankirtan;
import iskon.model.Serviceinter.HariNaamSankirtanService;
import iskon.model.Serviceinter.HariNaamsankirtanRequestListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HariNaamSankirtanBookingController {
    @Autowired
    HariNaamSankirtanService hariNaamSankirtanService;
    @Autowired
    HariNaamsankirtanRequestListService hariNaamsankirtanRequestListService;
    @RequestMapping(value = "/bookkirtan",method = RequestMethod.POST)
    public @ResponseBody String bookKirtan(@ModelAttribute HariNaamsankirtan hariNaamsankirtan, HttpSession session)
    {
        hariNaamsankirtan.setEmailOfUser(session.getAttribute("useremialid").toString());
        return hariNaamSankirtanService.bookHariNaamSankirtan(hariNaamsankirtan);
    }
    @RequestMapping(value = "/viewkirtanrequest",method = RequestMethod.GET)
    public ModelAndView getListOfKirtan(HttpSession session)
    {

        List<HariNaamsankirtan> hariNaamsankirtanList=hariNaamsankirtanRequestListService.getListOfRequestedKirtan(session.getAttribute("username").toString());
    if(hariNaamsankirtanList.isEmpty())
    {
        ModelAndView modelAndView=new ModelAndView("HariNaamSankirtanRequestList");
        modelAndView.addObject("msg"," No Request yet");
        return modelAndView;
    }
    else {
        ModelAndView modelAndView=new ModelAndView("HariNaamSankirtanRequestList");
        modelAndView.addObject("kirtanlist",hariNaamsankirtanList);
        return modelAndView;
    }
    }
    @RequestMapping(value = "/sendacknowledgement",method = RequestMethod.POST)
    public @ResponseBody String sendAcknowledgement(@RequestParam("id") String id) throws MessagingException {
return hariNaamSankirtanService.sendAcknowledgementToClient(id);
    }
}
