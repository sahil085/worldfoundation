package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.RequestForBookDistributionDao;
import iskcongzb.domain.RequestForBookDistribution;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestForBookDistributionDaoImp implements RequestForBookDistributionDao{
    @Autowired
    SessionFactory sessionFactory;
    public boolean makeRequest(RequestForBookDistribution requestForBookDistribution) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            session.save(requestForBookDistribution);
            session.getTransaction().commit();
            return true;

        }catch (Exception e)
        {
            System.out.println("Req For BookDistributoon Error"+e);
            return false;
        }finally {
            session.close();
        }

    }
}
