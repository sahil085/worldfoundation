package iskon.model.daointer;

import iskon.beans.User;
import org.springframework.stereotype.Component;

@Component
public interface RegistrationDao {
    public String register(User user);
}
