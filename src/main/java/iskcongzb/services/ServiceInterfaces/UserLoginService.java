package iskcongzb.services.ServiceInterfaces;

import iskcongzb.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserLoginService {
    User getAuthenticate(User user);
}
