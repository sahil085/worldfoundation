package iskon.model.daoimp;

import iskon.beans.LiveSeminar;
import iskon.model.daointer.LiveSeminarDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LiveSeminarDaoImp implements LiveSeminarDao {
    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession(){
        return sessionFactory.openSession();
    }
    @Transactional
    public String askQuestion(String qtn) {
        Session session=getSession();
        try
        {
            session.beginTransaction();
            LiveSeminar liveSeminar=new LiveSeminar();
            liveSeminar.setSimilarity(0);
            liveSeminar.setQtn(qtn);
            session.save(liveSeminar);
            session.getTransaction().commit();
            return "Question Submited successfully";

        }catch (Exception e)
        {
            System.out.println(e);
            return "OOPS..! some error occured try again";
        }finally {
            session.close();
        }
    }
}
