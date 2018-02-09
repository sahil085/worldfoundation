package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.RequestForPersonalClassDao;
import iskcongzb.domain.RequestForPersonalClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestForPersonalClassDaoImp implements RequestForPersonalClassDao {
    @Autowired
    SessionFactory sessionFactory;

    public boolean createRequest(RequestForPersonalClass requestForPersonalClass) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            session.save(requestForPersonalClass);
            session.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            System.out.println("error in RequestForPersonalClass "+e);
            return false;

        }finally {
            session.close();
        }
    }
}
