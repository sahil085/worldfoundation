package iskcongzb.services.ServiceClasses;

import iskcongzb.dao.DaoInterfaces.UserLoginDao;
import iskcongzb.domain.User;
import iskcongzb.services.ServiceInterfaces.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImp implements UserLoginService {
    @Autowired
    UserLoginDao userLoginDao;
    public User getAuthenticate(User user) {
        return userLoginDao.getAuthenticate(user);
    }
}
