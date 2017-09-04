package iskon.controller;

import iskon.beans.LiveSeminar;
import iskon.model.Serviceinter.LiveSeminarService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LiveSeminarController {
    @Autowired
    LiveSeminarService liveSeminarService;
    @Autowired
    SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession(){
        return sessionFactory.openSession();
    }
    @RequestMapping(value = "/askqtn",method = RequestMethod.POST)
    public @ResponseBody String askQuestion(@RequestParam("qtn") String qtn)
    {
    return liveSeminarService.askQuestion(qtn);
    }
   @RequestMapping(value = "/qtnasked",method = RequestMethod.GET)
    public void getQtns(HttpServletResponse response) throws IOException {
       PrintWriter out=response.getWriter();
       Session session=getSession();
       out.write("<table border='1' style='border:2px solid black;border-radius:2px;margin-left:5%;text-allign:centre;'>");
       out.write("<thead><th>Sno.</th><th>Qtns</th></thead>");
       out.write("<tbody>");
       try
       {
           Query query=session.createQuery("from LiveSeminar");
           ModelAndView modelAndView=new ModelAndView("LiveSeminarQtnsAsked");
           List<LiveSeminar> liveSeminars=query.list();

           for(LiveSeminar liveSeminar:liveSeminars)
           {
               out.write("<tr><td>"+liveSeminar.getId()+"</td><td>"+liveSeminar.getQtn()+"</td></tr>");
           }
           out.write("<tbody>");
           out.write("</table>");
       }catch (Exception e)
       {
           System.out.println(e);
       }finally {
           session.close();
       }
   }
   @RequestMapping(value = "/liveseminar",method = RequestMethod.GET)
   public String showliveseminarpage()
   {
       return "LiveSminar";
   }

}
