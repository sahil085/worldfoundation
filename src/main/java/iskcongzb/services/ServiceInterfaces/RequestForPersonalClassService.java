package iskcongzb.services.ServiceInterfaces;

import iskcongzb.domain.RequestForPersonalClass;
import org.springframework.stereotype.Service;

@Service
public interface RequestForPersonalClassService {
    String sendRequestToIyfAdmin(RequestForPersonalClass personalClass);
}
