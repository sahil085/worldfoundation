package iskon.model.daoimp;

import iskon.beans.User;
import iskon.model.daointer.LoginDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginDaoImp implements LoginDao{
    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession(){
        return sessionFactory.openSession();
    }
    public User Authenticate(User user) {
        Session session=getSession();
        try{
            String q="from User where email=:email and password=:password";
            Query query=session.createQuery(q);
            query.setString("email",user.getEmail());
            query.setString("password",user.getPassword());
            return query.uniqueResult();
        }catch (Exception e)
        {
            return null;
        }
    }
}
