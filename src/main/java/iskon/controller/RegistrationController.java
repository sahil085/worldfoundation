package iskon.controller;

import iskon.beans.User;
import iskon.model.Serviceinter.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;
@RequestMapping(value = "/register",method = RequestMethod.POST)
    public @ResponseBody String getRegistered(@ModelAttribute User user, @RequestParam("pic") MultipartFile fileUpload) throws IOException {
    if ((fileUpload != null && !fileUpload.isEmpty())) {

            user.setPhoto(fileUpload.getBytes());
        }

    return registrationService.register(user);
}


}
