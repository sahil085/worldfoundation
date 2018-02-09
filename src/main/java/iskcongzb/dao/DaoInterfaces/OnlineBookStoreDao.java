package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.ProductDetails;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OnlineBookStoreDao {
    List<ProductDetails> getAllProducts();
    byte[] getBookImage(int pid);
}
