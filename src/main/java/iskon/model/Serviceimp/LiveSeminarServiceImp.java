package iskon.model.Serviceimp;

import iskon.model.Serviceinter.LiveSeminarService;
import iskon.model.daointer.LiveSeminarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiveSeminarServiceImp implements LiveSeminarService {
    @Autowired
    LiveSeminarDao liveSeminarDao;
    public String askQuestion(String Question) {
   return liveSeminarDao.askQuestion(Question);
    }
}
