package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.ProductDetails;
import org.springframework.stereotype.Component;

@Component
public interface AddProductForBookDistributionDao {
    boolean addProducts(ProductDetails productDetails);
}
