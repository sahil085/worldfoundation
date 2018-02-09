package iskcongzb.services.ServiceInterfaces;

import iskcongzb.domain.RequestForBookDistribution;
import org.springframework.stereotype.Service;

@Service
public interface RequestForBookDistributionService {
    String makeRequest(RequestForBookDistribution requestForBookDistribution);
}
