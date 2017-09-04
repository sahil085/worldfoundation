package iskon.controller;
import iskon.model.daointer.insertdataincalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;

@Controller
public class calendercontoller {
    @Autowired
    insertdataincalendar insertdataincalendar;
   @RequestMapping(value = "/insertintocalender")
    public @ResponseBody String harekrishn(@RequestParam("date") String date, @RequestParam("festival") String festivalname) throws IOException {
    return insertdataincalendar.insertdata(date,festivalname);
    }
    @RequestMapping(value = "/calendarpage")
    public String calnderpage()
    {
    return "calender";
    }
    }
