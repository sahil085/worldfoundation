package iskon.model.Serviceinter;

import iskon.beans.HariNaamsankirtan;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

@Component
public interface HariNaamSankirtanService {
     String bookHariNaamSankirtan(HariNaamsankirtan hariNaamsankirtan);
     String sendAcknowledgementToClient(String id) throws MessagingException;
}
