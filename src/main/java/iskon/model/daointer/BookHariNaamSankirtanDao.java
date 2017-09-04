package iskon.model.daointer;

import iskon.beans.HariNaamsankirtan;
import org.springframework.stereotype.Component;

@Component
public interface BookHariNaamSankirtanDao {
    String bookkirtan(HariNaamsankirtan hariNaamsankirtan);
    String sendAcknowledgement(int id);
}
