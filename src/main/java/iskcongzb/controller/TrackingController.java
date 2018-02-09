package iskcongzb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TrackingController {
  String p;
    @RequestMapping(value = "/TrackingParameters",method = RequestMethod.GET)
    public void getLocation(@RequestParam("pid") int yatraId, @RequestParam("Longi") double longitude
            , @RequestParam("Latti") double Lattitude)
    {
        System.out.println("Tracking info "+longitude+"$$ "+Lattitude);
         p=longitude+"^"+Lattitude;
    }
    @RequestMapping(value = "/location",method = RequestMethod.GET)
    public @ResponseBody String get()
    {
     return p;
    }

}
