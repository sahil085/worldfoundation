package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.UserLoginDao;
import iskcongzb.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserLoginDaoImp implements UserLoginDao {
    @Autowired
    SessionFactory sessionFactory;

    public User getAuthenticate(User user) {
        Session session=sessionFactory.openSession();
        try
        {
            Query query=session.createQuery("from User where email=:email and password=:password");
            query.setParameter("email",user.getEmail());
            query.setParameter("password",user.getPassword());
            return (User)query.uniqueResult();
        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            session.close();
        }
    }
}
