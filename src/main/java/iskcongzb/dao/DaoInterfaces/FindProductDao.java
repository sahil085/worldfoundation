package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.ProductDetails;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FindProductDao {
    ProductDetails getProductById(int id);
    List<ProductDetails> getAllProducts();
}
