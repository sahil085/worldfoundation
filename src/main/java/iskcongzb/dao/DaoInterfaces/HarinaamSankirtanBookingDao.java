package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.HarinaamSankirtan;
import org.springframework.stereotype.Component;

@Component
public interface HarinaamSankirtanBookingDao {
    HarinaamSankirtan bookHarinaamSankirtan(HarinaamSankirtan harinaamSankirtan);
    String  acceptHarinaamSankirtanRequest(int id);
    String declineHaarinaamSankirtanRequest(int id);
}
