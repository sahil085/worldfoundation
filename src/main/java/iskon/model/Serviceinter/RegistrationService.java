package iskon.model.Serviceinter;

import iskon.beans.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public interface RegistrationService {
public String register(User user);
}
