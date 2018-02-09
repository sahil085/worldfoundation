package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.HarinaamSankirtanBookingDao;
import iskcongzb.domain.HarinaamSankirtan;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.awt.LightweightFrame;

import java.awt.*;
import java.util.List;

@Component
public class HarinaamSankirtanBookingDaoImp implements HarinaamSankirtanBookingDao {
    @Autowired
    SessionFactory sessionFactory;

    public HarinaamSankirtan bookHarinaamSankirtan(HarinaamSankirtan harinaamSankirtan) {
        Session session=sessionFactory.openSession();
        try
        {
            Transaction tx=session.beginTransaction();
            session.save(harinaamSankirtan);
         tx.commit();
            return harinaamSankirtan;

        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            session.close();
        }
    }

    public String acceptHarinaamSankirtanRequest(int id) {
        Session session=sessionFactory.openSession();
        try
        {
            Query query=session.createQuery("update HarinaamSankirtan set approvedStatus=:status where id=:id");
            query.setParameter("status",true);
            query.setParameter("id",id);
            query.executeUpdate();
            query=session.createQuery("select eMail from HarinaamSankirtan where id =:id");
            query.setParameter("id",id);
            return query.uniqueResult().toString();

        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
        finally {
            session.close();
        }

    }

    public String declineHaarinaamSankirtanRequest(int id) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            Query  query=session.createQuery("delete from HarinaamSankirtan where id=:id");
            query.setParameter("id",id);
            query.executeUpdate();
            session.getTransaction().commit();

            return "Request Deleted";
        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            session.close();
        }
    }
}
