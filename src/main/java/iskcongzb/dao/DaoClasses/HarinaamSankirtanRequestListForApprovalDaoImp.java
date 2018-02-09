package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.HarinaamSankirtanRequestListForApprovalDao;
import iskcongzb.domain.HarinaamSankirtan;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HarinaamSankirtanRequestListForApprovalDaoImp implements HarinaamSankirtanRequestListForApprovalDao {
    @Autowired
    SessionFactory sessionFactory;
    public List<HarinaamSankirtan> getAllPendingRequest(int index) {
        Session session=sessionFactory.openSession();
        try
        {
            Query query=session.createQuery("from HarinaamSankirtan where approvedStatus=:status");
            query.setParameter("status",false);
            query.setFirstResult(2 * (index - 1));
            query.setMaxResults(2);
            return query.list();

        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            session.close();
        }
    }

    public List<HarinaamSankirtan> getAllPendingRequestList() {
        Session session=sessionFactory.openSession();
        try
        {
            Query query=session.createQuery("from HarinaamSankirtan where approvedStatus=:status");
            query.setParameter("status",false);
            query.setMaxResults(2);
            return query.list();
        }catch (Exception e)
        {
            System.out.println(e);
            session.close();
            return null;
        }finally {
            session.close();
        }
    }
}
