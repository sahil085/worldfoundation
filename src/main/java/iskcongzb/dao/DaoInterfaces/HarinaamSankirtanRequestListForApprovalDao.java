package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.HarinaamSankirtan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HarinaamSankirtanRequestListForApprovalDao {
    List<HarinaamSankirtan> getAllPendingRequest(int index);
    List<HarinaamSankirtan> getAllPendingRequestList();
}
