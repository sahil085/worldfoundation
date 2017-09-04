package iskon.model.daoimp;

import iskon.beans.User;
import iskon.model.daointer.RegistrationDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RegistrationDaoImp implements RegistrationDao {
    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }
    @Transactional
    public String register(User user) {
        Session session=getSession();
        try
        {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            return "registered successfully";

        }catch (Exception e)
        {
            System.out.println(e);
            return "OOPS..!! try again";
        }
        finally {
            session.close();
        }
    }


}
