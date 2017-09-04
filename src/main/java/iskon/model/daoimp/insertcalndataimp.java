package iskon.model.daoimp;

import iskon.beans.vaishnavcalender;
import iskon.model.daointer.insertdataincalendar;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class insertcalndataimp implements insertdataincalendar {
    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession(){
        return sessionFactory.openSession();
    }
     @Transactional
    public String insertdata(String date, String festivalname) {
        Session session=getSession();
        vaishnavcalender vc=new vaishnavcalender();
        try
        {
            session.beginTransaction();
            vc.setDate(date);
            vc.setFetstivename(festivalname);
            session.save(vc);
            session.getTransaction().commit();
            System.out.println("data saved");
            return "radhe radhe";

        }catch (Exception e)
        {
return "hare krishna";
        }
    }
}
