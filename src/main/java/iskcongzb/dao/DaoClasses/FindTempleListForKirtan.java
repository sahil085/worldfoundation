//package iskcongzb.dao.DaoClasses;
//
//import iskcongzb.domain.Temple;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class FindTempleListForKirtan {
//    @Autowired
//    SessionFactory sessionFactory;
//    public List<Temple> getTemplelist(String templeName)
//    {
//        List<Temple> templeList=new ArrayList<Temple>();
//        Session session=sessionFactory.openSession();
//        try
//        {
//            Query query=session.createQuery("from Temple where templeName=:tname");
//            query.setParameter("tname",templeName+"%");
//            return query.list();
//        }catch (Exception e)
//        {
//            System.out.println(e);
//            return null;
//        }
//        finally {
//            session.close();
//        }
//    }
//}
