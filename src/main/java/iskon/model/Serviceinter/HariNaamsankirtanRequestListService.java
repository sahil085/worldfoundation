package iskon.model.Serviceinter;

import iskon.beans.HariNaamsankirtan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HariNaamsankirtanRequestListService {
    List<HariNaamsankirtan> getListOfRequestedKirtan(String hsadminName);
}
