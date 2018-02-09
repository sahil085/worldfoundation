package iskcongzb.services.ServiceClasses;

import iskcongzb.dao.DaoInterfaces.UserRegistartionDao;
import iskcongzb.domain.User;
import iskcongzb.services.ServiceInterfaces.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImp implements UserRegistrationService {
@Autowired
    UserRegistartionDao userRegistartionDao;
    public String getRegistered(User user) {
        return userRegistartionDao.getRegistered(user);
    }
}
