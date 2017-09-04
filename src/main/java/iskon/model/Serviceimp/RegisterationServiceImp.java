package iskon.model.Serviceimp;

import iskon.beans.User;
import iskon.model.Serviceinter.RegistrationService;
import iskon.model.daointer.RegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterationServiceImp implements RegistrationService{
    @Autowired
    RegistrationDao registrationDao;
    public String register(User user) {

        return registrationDao.register(user);
    }
}
