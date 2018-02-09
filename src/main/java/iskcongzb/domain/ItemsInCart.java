package iskcongzb.domain;

import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
public class ItemsInCart {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     int id;
     @Column(nullable = false)
     @OneToMany
     List<ProductDetails> productDetails;
     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public List<ProductDetails> getProductDetails() {
          return productDetails;
     }

     public void setProductDetails(List<ProductDetails> productDetails) {
          this.productDetails = productDetails;
     }


}
