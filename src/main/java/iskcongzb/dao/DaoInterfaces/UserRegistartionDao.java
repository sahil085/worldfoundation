package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface UserRegistartionDao {
    String getRegistered(User user);
}
