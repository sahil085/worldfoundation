package iskon.model.daointer;

import iskon.beans.User;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Component
public interface LoginDao {
public User Authenticate(User user);
}
