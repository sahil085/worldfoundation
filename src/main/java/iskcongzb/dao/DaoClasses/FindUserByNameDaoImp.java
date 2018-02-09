package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.FindUserByNameDao;
import iskcongzb.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindUserByNameDaoImp implements FindUserByNameDao {
    @Autowired
    SessionFactory sessionFactory;
    public User getUser(String uname) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from User where userName=:name";
            Query query=session.createQuery(q);
            query.setParameter("name",uname);
            return (User) query.uniqueResult();
        }catch (Exception e)
        {
            return null;
        }finally {
            session.close();
        }
    }
}
