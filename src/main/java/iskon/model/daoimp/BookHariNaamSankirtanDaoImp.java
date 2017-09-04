package iskon.model.daoimp;

import iskon.beans.HariNaamsankirtan;
import iskon.model.daointer.BookHariNaamSankirtanDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookHariNaamSankirtanDaoImp implements BookHariNaamSankirtanDao{
    @Autowired
    SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession(){
        return sessionFactory.openSession();
    }
    public String bookkirtan(HariNaamsankirtan hariNaamsankirtan) {
        Session session=getSession();
        try
        {
            hariNaamsankirtan.setApprovedstatus(0);
            session.beginTransaction();
            session.save(hariNaamsankirtan);
            session.getTransaction().commit();
            return "booking request send successfully";
        }catch (Exception e)
        {
            return "OOPS..!! try again";
        }
        finally {
            session.close();
        }
    }

    public String sendAcknowledgement(int id) {
        Session session=getSession();
        try
        {
            String q="update HariNaamsankirtan set approvedstatus=:status where id=:id";
            Query query=session.createQuery(q);
            query.setInteger("status",1);
            query.setInteger("id",id);
            if(query.executeUpdate()>0)
            {
                return "send successfully";
            }
            else
            {
                return "error";
            }
        }catch (Exception e)
        {
return "error";
        }
        finally {
            session.close();
        }
    }
//   int main()
//   {
//      BookHariNaamSankirtanDaoImp m;
//   }
}
