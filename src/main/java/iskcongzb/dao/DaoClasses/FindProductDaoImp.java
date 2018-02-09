package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.FindProductDao;
import iskcongzb.domain.ProductDetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindProductDaoImp implements FindProductDao {
    @Autowired
    SessionFactory sessionFactory;

    public ProductDetails getProductById(int id) {
        Session session= sessionFactory.openSession();
        try {
            Query query = session.createQuery("from ProductDetails where id=:id");
            query.setParameter("id", id);
            return (ProductDetails)query.uniqueResult();
        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            session.close();
        }

    }

    public List<ProductDetails> getAllProducts() {
        Session session=sessionFactory.openSession();
        try
        {
            Query query=session.createQuery("from ProductDetails ");
            return query.list();
        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            session.close();
        }
    }
}
