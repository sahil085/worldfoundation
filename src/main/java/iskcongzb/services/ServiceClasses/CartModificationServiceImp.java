package iskcongzb.services.ServiceClasses;

import iskcongzb.domain.ProductDetails;
import iskcongzb.services.ServiceInterfaces.CartModificationService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class CartModificationServiceImp implements CartModificationService {
    public String doModificationInCart(HttpSession session,int pid) {
        int TotalPrice = 0;
        List<ProductDetails> list = (List<ProductDetails>) session.getAttribute("cart");
        for (ProductDetails productDetails : list) {
            if (productDetails.getId() == pid) {
                list.remove(productDetails);
                break;
            }
        }
        session.setAttribute("cart", list);
        StringBuilder builder = new StringBuilder("<p class=\"text-muted\">You currently have" + list.size() + "item(s) in your cart.</p>\n");
        for (ProductDetails productDetails : list) {
            builder.append("<div class=\"table-responsive\">\n" +
                    "                            <table class=\"table\">\n" +
                    "                                <thead>\n" +
                    "                                <tr>\n" +
                    "                                    <th colspan=\"2\">Product</th>\n" +
                    "                                    <th>Quantity</th>\n" +
                    "                                    <th>Unit price</th>\n" +
                    "                                     " +
                    "                                    <th colspan=\"2\">Total</th>\n" +
                    "                                </tr>\n" +
                    "                                </thead>\n" +
                    "                                <tbody>\n" +
                    "                                <tr>\n" +
                    "                                    <td>\n" +
                    "                                        <a href=\"#\">\n" +
                    "                                            <img src=\"img/detailsquare.jpg\" alt=\"White Blouse Armani\">\n" +
                    "                                        </a>\n" +
                    "                                    </td>\n" +
                    "                                    <td>" + productDetails.getBookName() +
                    "                                    </td>\n" +
                    "                                    <td>\n" +
                    "                                        <input type=\"number\" value=\"2\" min='1' max=" + productDetails.getQuantity() + " class=\"form-control\">\n" +
                    "                                    </td>\n" +
                    "                                    <td>" + productDetails.getPrice() + "</td>\n" +
                    "                                   " +
                    "                                    <td>" + productDetails.getPrice() + "</td>\n" +
                    "                                    <td><a href=\"#\"><span class=\"glyphicon glyphicon-trash\"></span></a>\n" +
                    "                                    </td>\n" +
                    "                                </tr>\n" +
                    "                             " +
                    "                                </tbody>\n");
            TotalPrice += productDetails.getPrice();
        }

        builder.append("+\n" +
                "                    \"                                <tfoot>\\n\" +\n" +
                "                    \"                                <tr>\\n\" +\n" +
                "                    \"                                    <th colspan=\\\"5\\\">Total</th>\\n\" +\n" +
                "                    \"                                    <th class='totalPrice' colspan='2'>" + TotalPrice + "</th>\\n\" +\n" +
                "                    \"                                </tr>\\n\" +\n" +
                "                    \"                                </tfoot>\\n\" +\n" +
                "                    \"                            </table>\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"                        </div>\"");
        return builder.toString();
    }
}
