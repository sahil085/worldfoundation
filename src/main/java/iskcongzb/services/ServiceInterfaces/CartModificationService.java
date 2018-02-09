package iskcongzb.services.ServiceInterfaces;

import iskcongzb.domain.ProductDetails;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public interface CartModificationService {
    String doModificationInCart(HttpSession session,int pid);
}

