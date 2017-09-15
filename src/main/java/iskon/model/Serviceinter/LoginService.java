package iskon.model.Serviceinter;

import iskon.beans.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LoginService {

    public User Authenticate(User user);
}
