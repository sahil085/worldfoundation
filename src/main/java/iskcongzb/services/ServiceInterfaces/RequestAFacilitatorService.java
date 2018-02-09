package iskcongzb.services.ServiceInterfaces;

import iskcongzb.domain.RequestAFacilitator;
import org.springframework.stereotype.Service;

@Service
public interface RequestAFacilitatorService {
    String MakeRequest(RequestAFacilitator requestAFacilitator);
}
