package iskcongzb.controller;

import iskcongzb.dao.DaoInterfaces.*;
import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.LectureAtCollege;
import iskcongzb.domain.RequestForPersonalClass;
import iskcongzb.domain.User;
import iskcongzb.services.ServiceInterfaces.RequestForPersonalClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IYFUserController {
    @Autowired
    LectureAtCollegeOperations lectureAtCollegeOperations;
   @Autowired
    CourseOperations courseOperations;

    @RequestMapping(value = "/ArrangeLectureAtCollegePage",method = RequestMethod.GET)
            public String gotoLectureRequestPage()
    {

        return "ArrangeLectureAtCollege";

    }
    @RequestMapping(value = "/LectureRequestForCollegeProcess",method = RequestMethod.POST)
    public @ResponseBody String createRequestForLecture(@ModelAttribute LectureAtCollege lectureAtCollege,
                                                        HttpSession session, @RequestParam("CourseName") String cname)
    {
        User user = (User) session.getAttribute("userdetails");
        lectureAtCollege.setUser(user);
        lectureAtCollege.setCourse(courseOperations.getCourseObjectByName(cname));
        return lectureAtCollegeOperations.createRequest(lectureAtCollege);

    }

    @RequestMapping(value = "/fetchcoursenameforcollege",method = RequestMethod.GET)
    public @ResponseBody List<CreateCourse> findCourseName(@RequestParam("term") String cname)
    {
        return courseOperations.getCourseDetailsByName(cname);
    }
    @RequestMapping(value = "/RequestForPersonalClassPage",method = RequestMethod.GET)
    public String RequestPage()
    {
        return "IYFRequestPersonalClass";
    }
    @Autowired
    RequestForPersonalClassService requestForPersonalClassService;

    @RequestMapping(value = "/RequestForPersonalClassProcess",method = RequestMethod.POST)
    public @ResponseBody String createRequest(@ModelAttribute RequestForPersonalClass personalClass,HttpSession session)
    {
        User user = (User) session.getAttribute("userdetails");
        personalClass.setUser(user);
     return requestForPersonalClassService.sendRequestToIyfAdmin(personalClass);

    }
    @Autowired
    LectureOperations lectureOperations;
    @Autowired
    ListOfCreatedLecturesDao listOfCreatedLecturesDao;
    @RequestMapping(value = "/IyfSinglelectureDetails",method = RequestMethod.GET)
    public String iyfSingleLecturePage(@RequestParam("lname") String lname,Model model)
    {
        model.addAttribute("upcominglectures",listOfCreatedLecturesDao.getListOfUpComingLectures());
        model.addAttribute("SingleLectureDetails",lectureOperations.getSingleLectureByName(lname));
return "IYFViewSingleLectureDetails";
    }
    @Autowired
    MarkAttendanceInIyfClassDao markAttendanceInIyfClassDao;
    @RequestMapping(value = "/gotoLiveClass",method = RequestMethod.POST)
    public String gotoLiveClass(@RequestParam("lid") int lid,Model model,HttpSession session)
    {
        User user= (User) session.getAttribute("userdetails");
        model.addAttribute("Attendance",markAttendanceInIyfClassDao.markUserAsPresent(listOfCreatedLecturesDao.getLectureById(lid),user));
        model.addAttribute("LiveLectureDetails",listOfCreatedLecturesDao.getLectureById(lid));

        return "LiveIFYClass";
    }
}
