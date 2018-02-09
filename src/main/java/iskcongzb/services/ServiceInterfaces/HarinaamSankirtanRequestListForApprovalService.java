package iskcongzb.services.ServiceInterfaces;

import iskcongzb.domain.HarinaamSankirtan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HarinaamSankirtanRequestListForApprovalService {
    String getListOfAllPendingRequest(int index);
    List<HarinaamSankirtan> getListOfAllRequest();
}
