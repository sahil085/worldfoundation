package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.RequestForPersonalClass;
import org.springframework.stereotype.Component;

@Component
public interface RequestForPersonalClassDao {
    boolean createRequest(RequestForPersonalClass requestForPersonalClass);
}
