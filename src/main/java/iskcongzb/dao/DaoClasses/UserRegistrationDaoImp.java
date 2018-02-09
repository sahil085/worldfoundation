package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.UserRegistartionDao;
import iskcongzb.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationDaoImp implements UserRegistartionDao {
    @Autowired
    SessionFactory sessionFactory;
    public String getRegistered(User user) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            user.setState("Active");
            session.save(user);
            session.getTransaction().commit();
            return "Registered Successfully";

        }catch (Exception e)
        {
            System.out.println(e);
            return "Please Try Again After Sometime";
        }finally {
            session.close();
        }
    }
}
