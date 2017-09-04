package iskon.model.daoimp;

import iskon.beans.HariNaamsankirtan;
import iskon.model.daointer.HariNaamsankirtanRequestListDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HariNaamsankirtanRequestListDaoImp implements HariNaamsankirtanRequestListDao {
    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession(){
        return sessionFactory.openSession();
    }
    public List<HariNaamsankirtan> getListOfRequestedKirtan(String hsadminName) {
        Session session=getSession();
                try
                {
                    String q="from HariNaamsankirtan where Hsadmin=:hsadminname and approvedstatus=:status";
                    Query query=session.createQuery(q);
                    query.setString("hsadminname",hsadminName);
                    query.setInteger("status",0);
                    return query.list();
                }catch (Exception e)
                {
    return null;
                }
                finally {
            session.close();
                }
    }
}
