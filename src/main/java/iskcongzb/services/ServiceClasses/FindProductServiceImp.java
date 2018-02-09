package iskcongzb.services.ServiceClasses;

import iskcongzb.dao.DaoInterfaces.FindProductDao;
import iskcongzb.domain.ProductDetails;
import iskcongzb.services.ServiceInterfaces.FindProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindProductServiceImp implements FindProductService {
      @Autowired
      FindProductDao findProductDao;

    public ProductDetails getProductById(int id) {
    return findProductDao.getProductById(id);
    }

    public List<ProductDetails> getAllProducts() {
        return findProductDao.getAllProducts();
    }
}
