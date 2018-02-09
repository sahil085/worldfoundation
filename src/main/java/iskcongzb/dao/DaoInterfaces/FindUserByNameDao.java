package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface FindUserByNameDao {
    User getUser(String uname);
}
