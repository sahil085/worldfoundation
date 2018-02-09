package iskcongzb.domain;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Component
@Entity
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
    @Column(unique = true,nullable = false)
   private String bookName;
    @Column(nullable = false)
   private String authorName;
    @Column(nullable = false)
    @Lob()
    byte bookImage[];
    @Column(nullable = false)
    int quantity;
    @Column(nullable = false)
    boolean inStock;
    @Column(nullable = false)
    float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public byte[] getBookImage() {
        return bookImage;
    }

    public void setBookImage(byte[] bookImage) {
        this.bookImage = bookImage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
