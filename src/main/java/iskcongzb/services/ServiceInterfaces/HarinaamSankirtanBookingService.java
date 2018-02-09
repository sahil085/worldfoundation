package iskcongzb.services.ServiceInterfaces;

import iskcongzb.domain.HarinaamSankirtan;
import org.springframework.stereotype.Service;

@Service
public interface HarinaamSankirtanBookingService {
    HarinaamSankirtan bookHarinaamSankirtan(HarinaamSankirtan harinaamSankirtan) ;
    String aaceptHarinaamRequest(int id);
    String declineHarinaamRequest(int id);
}
