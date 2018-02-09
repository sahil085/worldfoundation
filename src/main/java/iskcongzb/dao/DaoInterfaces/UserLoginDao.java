package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface UserLoginDao {
    User getAuthenticate(User user);
}
