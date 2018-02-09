package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.OnlineBookStoreDao;
import iskcongzb.domain.ProductDetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OnlineBookStoreDaoImp implements OnlineBookStoreDao {
    @Autowired
    SessionFactory sessionFactory;
    public List<ProductDetails> getAllProducts() {
        Session session=sessionFactory.openSession();
        try
        {
            String query="from ProductDetails where inStock=:stock";
            Query query1=session.createQuery(query);
            query1.setParameter("stock",true);

            return query1.list();

        }catch (Exception e)
        {
            System.out.println("error in online book store dao"+e);

            return null;
        }finally {
            session.close();
        }
    }

    public byte[] getBookImage(int pid) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="select bookImage from ProductDetails where id=:pid";
            Query query=session.createQuery(q);
            query.setParameter("pid",pid);
            return (byte[]) query.uniqueResult();

        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            session.close();
        }
    }
}
