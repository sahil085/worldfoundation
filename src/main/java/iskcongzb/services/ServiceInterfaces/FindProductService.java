package iskcongzb.services.ServiceInterfaces;

import iskcongzb.domain.ProductDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FindProductService {
      ProductDetails getProductById(int id);
      List<ProductDetails> getAllProducts();
}
