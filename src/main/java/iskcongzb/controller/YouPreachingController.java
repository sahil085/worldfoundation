package iskcongzb.controller;

import iskcongzb.dao.DaoInterfaces.*;
import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.User;
import iskcongzb.domain.UserFormRegistration;
import iskcongzb.services.ServiceInterfaces.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class YouPreachingController {
@Autowired
    CreateLectureDao createLectureDao;
@Autowired
    ListOfCreatedLecturesDao listOfCreatedLecturesDao;
@Autowired
    JoinLectureDao joinLectureDao;
@Autowired
    FindUserByNameDao findUserByNameDao;
@Autowired
    CreateCourseDao createCourseDao;
@Autowired
LectureOperations lectureOperations;

    @ModelAttribute("UserRegistraion")
    public UserFormRegistration populatePojos() {
        // Don't forget to initialize the pojos list or else it won't work
        UserFormRegistration userFormRegistration= new UserFormRegistration();
   List<User> user=new ArrayList<User>();
        for(int i=0; i<2; i++) {
            user.add(new User());
        }
        userFormRegistration.setUser(user);
        return userFormRegistration;
    }
@Autowired
CourseListOnPreacherPanel courseListOnPreacherPanel;
    @RequestMapping(value = "/pp",method = RequestMethod.GET)
    public String gotoPreachingAdminpanel(HttpServletRequest request,HttpSession session
    ,Model model)
    {
        User user;
        if(session.getAttribute("userdetails")==null) {
             session.setAttribute("userdetails", findUserByNameDao.getUser(request.getUserPrincipal().getName()));
            user = (User) session.getAttribute("userdetails");
            model.addAttribute("upcominglectures",listOfCreatedLecturesDao.getListOfUpComingLectures());
            model.addAttribute("courselist",courseListOnPreacherPanel.getCourseList(user.getUserName()));
            model.addAttribute("LecturesList",lectureOperations.getLectureList(user));;
        }else {
            user = (User) session.getAttribute("userdetails");
            model.addAttribute("upcominglectures",listOfCreatedLecturesDao.getListOfUpComingLectures());
            model.addAttribute("courselist",courseListOnPreacherPanel.getCourseList(user.getUserName()));
            model.addAttribute("LecturesList",lectureOperations.getLectureList(user));;
        }
        System.out.println();

        return "PreacherPanel";
    }
    @RequestMapping(value = "/getcountofstudents",method = RequestMethod.GET)
    public @ResponseBody Long getCountOfStudents(@RequestParam("lid") int id)
    {
        return courseListOnPreacherPanel.getNumberOfStudents(id);
    }
    @RequestMapping(value = "/CreateLecturePage",method = RequestMethod.GET)
    public String createLecturePage()
    {
        return "PreacherPanelToCreateLecture";
    }

    @RequestMapping(value = "/CreateCoursePage",method = RequestMethod.GET)
    public String createCourse()
    {
        return "CreateCourseAdminPage";
    }
    @Autowired
    CourseOperations courseOperations;
    @RequestMapping(value = "/UpdateCourseDetailsPage",method = RequestMethod.GET)
    public String updateCourseDetailsPage(@RequestParam("cname") String cname,HttpSession session,Model model)
    {
        User user=(User)session.getAttribute("userdetails");
        model.addAttribute("CourseInfo",courseOperations.getCourseDetailsByName(cname,user));
       return "PrecherPanelToUpdateCouurseInfo";
    }
    @RequestMapping(value = "/UpdateCourseDetailsInfoProcess",method = RequestMethod.POST)
    public String updateCourseDetailsProcess(@ModelAttribute CreateCourse course,Model model)
    {
        model.addAttribute("updatestatus",courseOperations.updateCourseinfo(course));
        return "PrecherPanelToUpdateCouurseInfo";
    }
    @Autowired
    FetchCourseNameDao fetchCourseNameDao;
    @RequestMapping(value = "/fetchCourseName",method = RequestMethod.GET)
    public @ResponseBody List<CreateCourse> getCourseName(HttpSession session,@RequestParam("term") String cname)
    {
        User user=(User)session.getAttribute("userdetails");
        System.out.println(user.getUserName()+"controllerrrr");
        return fetchCourseNameDao.getCourseName(cname,user);
    }
    @RequestMapping(value = "/fetchLectureName",method = RequestMethod.GET)
    public @ResponseBody List<CreateLecture> getLectureTittle(@RequestParam("term") String lname)
    {
        return lectureOperations.getlectureNames(lname);
    }
    @RequestMapping(value = "/ViewLectureDetailsPage",method = RequestMethod.GET)
    public String viewLecturePageForUser(@RequestParam("lname") String lname,Model model)
    {
        model.addAttribute("LectureDetails",lectureOperations.getLectureDetailsByName(lname));
        return "IYFLecturePageForUser";
    }
    @RequestMapping(value = "/CreateCourseProcess",method = RequestMethod.POST)
    public String CreateCourse(@ModelAttribute CreateCourse createCourse,Model model,HttpSession session)
    {
        User user=(User)session.getAttribute("userdetails");
        if(createCourseDao.createCourse(createCourse,user))
        {
            model.addAttribute("createcoursemsg","course created Successfully");
            return "CreateCourseAdminPage";

        }else {
            model.addAttribute("createlecturemsg","Error in Creating Course");
            return "CreateCourseAdminPage";
        }
    }
    @RequestMapping(value = "/CreateLectureProcess",method = RequestMethod.POST)
    public String createLecture( @ModelAttribute CreateLecture lecture,BindingResult bindingResult, Model model, HttpSession session)
    {
        if(bindingResult.hasErrors())
        {
           List<ObjectError> list= bindingResult.getAllErrors();
           for(ObjectError objectError:list)
           {
               System.out.println(objectError.getObjectName()+" "+objectError.getDefaultMessage());
           }
        }else {
            User user = (User) session.getAttribute("userdetails");
            if (createLectureDao.createLecture(lecture, user)) {
                model.addAttribute("createlecturemsg", "Lecture created Successfully");
            } else {
                model.addAttribute("createlecturemsg", "Lecture creation error");

            }
        }
        return "redirect:pp";
    }

    @RequestMapping(value = "/iyfpage",method = RequestMethod.GET)
    public String gotoIyfPage(Model model, HttpServletRequest request,HttpSession session)
    {
       session.setAttribute("userdetails",findUserByNameDao.getUser(request.getUserPrincipal().getName()));
        User user= (User) session.getAttribute("userdetails");
        model.addAttribute("upcominglectures",listOfCreatedLecturesDao.getListOfUpComingLectures());
        model.addAttribute("JoinedLectureList",listOfCreatedLecturesDao.getJoinedLecture(user));

        return "IyfIndexpage";
    }
   @Autowired
   MarkAttendanceInIyfClassDao markAttendanceInIyfClassDao;
    @RequestMapping(value = "/joinlecture",method = RequestMethod.GET)
    public @ResponseBody String joinLecture(@RequestParam("id") int lectureid, HttpSession session)
    {
        User user= (User) session.getAttribute("userdetails");
        markAttendanceInIyfClassDao.markUserAsAbsent(listOfCreatedLecturesDao.getLectureById(lectureid),user);
       return joinLectureDao.joinALecture(listOfCreatedLecturesDao.getLectureById(lectureid), user);
    }

    @RequestMapping(value = "/UpdatelectureinfoPage",method = RequestMethod.GET)
    public String updateLectureInfo(@RequestParam("lid") int lid,HttpSession session,Model model)
    {
        session.setAttribute("lecid",lid);
       model.addAttribute("lecturedetails",lectureOperations.getLectureById(lid));
        return "PanelToupdateLectureInfo";

    }
    @Autowired
    UpdateLectureInfoDao updateLectureInfoDao;
    @RequestMapping(value = "/UpdateLectureInfoProcess",method = RequestMethod.POST)
    public String updateLectureInfo(@ModelAttribute CreateLecture lecture, HttpSession session
     ,Model model)
    {
        int lecid=Integer.parseInt(session.getAttribute("lecid").toString());
        if(updateLectureInfoDao.updateLectureInfo(lecture,lecid))
        {
            model.addAttribute("updateLectureInfo","Lecture Details updated SuccessFully");
        }else {
            model.addAttribute("updateLectureInfo","Lecture Details updation Error");
        }
        return "PanelToupdateLectureInfo";

    }


    @RequestMapping(value = "/setHangoutUrl",method = RequestMethod.POST)
    public @ResponseBody String setHangouturl(@RequestParam("lid") int lid,
                                              @RequestParam("url") String Url)
    {
        return updateLectureInfoDao.setHangoutUrl(Url,lid);
    }
    @RequestMapping(value = "/SetWhiteBoardUrl",method = RequestMethod.POST)
    public @ResponseBody String setWhiteBoardUrl(@RequestParam("lid") int lid,
                                                 @RequestParam("url") String Url)
    {
  return   updateLectureInfoDao.setWhiteBoardUrl(Url,lid);
    }


@RequestMapping(value = "/PreacherPanelLiveClass",method = RequestMethod.POST)
    public String gotoLiveClass(@RequestParam("lid") int lid,Model model,HttpSession session)
{
    User user= (User) session.getAttribute("userdetails");
     lectureOperations.updateLiveStatusOfLecture(lid);
    model.addAttribute("Attendance",markAttendanceInIyfClassDao.markUserAsPresent(listOfCreatedLecturesDao.getLectureById(lid),user));
   model.addAttribute("LiveLectureDetails",listOfCreatedLecturesDao.getLectureById(lid));

    return "PreacherPanelLiveClass";
}

@RequestMapping(value = "/EndLecture",method = RequestMethod.GET)
public String HomePageIYF(@RequestParam("lid") int lid,RedirectAttributes redirectAttributes)
{
    redirectAttributes.addFlashAttribute("LiveLectureStatus",lectureOperations.endLecture(lid));
    return "redirect:pp";
}
@RequestMapping(value = "/PreacherPanelCoursePage",method = RequestMethod.GET)
public String gotoCoursePage(@RequestParam("cname") String cname,Model model)
{
    model.addAttribute("courselist",courseListOnPreacherPanel.getCourseDetailsByName(cname));
return "PreacherPanelCoursePage";
}
@RequestMapping(value = "/DeleteLecture",method = RequestMethod.GET)
   public @ResponseBody String deleteLecture(@RequestParam("lid") int lid)
{
return lectureOperations.deleteLectureById(lid);
}
@RequestMapping(value = "/RegisterUserForIyf",method = RequestMethod.GET)
    public String RegistrationPage()
{
    return "PreacherPanelForUserRegistration";
}
@RequestMapping(value = "/registrationprocessForIyf",method = RequestMethod.POST)
    public @ResponseBody  String RegistrationProcess(@ModelAttribute User user)
{
  return   userRegistrationService.getRegistered(user);
}

@RequestMapping(value = "/BulkRegistrationPage",method = RequestMethod.GET)
    public String bulkRegisterationPage()
{
    return "PreacherPanelBulkRegistration";
}
    @Autowired
    UserRegistrationService userRegistrationService;
    @RequestMapping(value = "/bulkRegister",method = RequestMethod.POST)
    public @ResponseBody String RegisterUsers(@ModelAttribute("UserRegistraion") UserFormRegistration userFormRegistration)
    {
        List<User> userList= userFormRegistration.getUser();
        try {
            for (User user : userList) {
                user.setAdminType("USER");
                userRegistrationService.getRegistered(user);
            }
            return "registered successfully";
        }catch (Exception e)
        {
            return "Unsuccessfull";
        }



    }

    @RequestMapping(value = "/DeleteCourse",method = RequestMethod.GET)
    public @ResponseBody String deleteCourse(@RequestParam("cid") int cid)
    {
       return courseOperations.deleteCourseById(cid);
    }

    @RequestMapping(value = "/PreacherPanelSingleLecture",method = RequestMethod.GET)
    public String preacherPanleSingleLecture(@RequestParam("lname") String lname,Model model)
    {
        model.addAttribute("SingleLectureDetails",lectureOperations.getSingleLectureByName(lname));
        model.addAttribute("upcominglectures",listOfCreatedLecturesDao.getListOfUpComingLectures());

        return "PreacherPanelSingleLectureDetails";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}


