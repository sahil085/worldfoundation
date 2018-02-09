package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.RequestForBookDistribution;
import org.springframework.stereotype.Component;

@Component
public interface RequestForBookDistributionDao {
    boolean makeRequest(RequestForBookDistribution requestForBookDistribution);
}
