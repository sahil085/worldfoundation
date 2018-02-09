package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.AddProductForBookDistributionDao;
import iskcongzb.domain.ProductDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddProductForBookDistributionDaoImp implements AddProductForBookDistributionDao{
    @Autowired
    SessionFactory sessionFactory;

    public boolean addProducts(ProductDetails productDetails) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            session.save(productDetails);
            session.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            System.out.println(e);
            return false;
        }finally {
            session.close();
        }
    }
}
