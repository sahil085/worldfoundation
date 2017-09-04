package iskon.model.Serviceimp;

import iskon.beans.HariNaamsankirtan;
import iskon.model.Serviceinter.HariNaamsankirtanRequestListService;
import iskon.model.daointer.HariNaamsankirtanRequestListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HariNaamsankirtanRequestListServiceImp implements HariNaamsankirtanRequestListService {
    @Autowired
    HariNaamsankirtanRequestListDao hariNaamsankirtanRequestListDao;
    public List<HariNaamsankirtan> getListOfRequestedKirtan(String hsadminName) {
        return hariNaamsankirtanRequestListDao.getListOfRequestedKirtan(hsadminName);
    }
}
