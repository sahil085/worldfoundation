package iskon.model.daointer;

import iskon.beans.HariNaamsankirtan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HariNaamsankirtanRequestListDao {
    List<HariNaamsankirtan> getListOfRequestedKirtan(String hsadminName);

}
