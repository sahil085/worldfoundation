package iskon.model.Serviceimp;

import iskon.beans.User;
import iskon.model.Serviceinter.LoginService;
import iskon.model.daointer.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginServiceImp implements LoginService{
    @Autowired
    LoginDao loginDao;
    public List<User> Authenticate(User user) {
return loginDao.Authenticate(user);
    }
}
