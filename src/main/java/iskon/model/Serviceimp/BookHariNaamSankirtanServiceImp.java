package iskon.model.Serviceimp;

import iskon.beans.HariNaamsankirtan;
import iskon.model.Serviceinter.HariNaamSankirtanService;
import iskon.model.daointer.BookHariNaamSankirtanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class BookHariNaamSankirtanServiceImp implements HariNaamSankirtanService {
    @Autowired
    BookHariNaamSankirtanDao bookHariNaamSankirtanDao;

    public String bookHariNaamSankirtan(HariNaamsankirtan hariNaamsankirtan) {
        return bookHariNaamSankirtanDao.bookkirtan(hariNaamsankirtan);

    }

    public String sendAcknowledgementToClient(String id) throws MessagingException {
        String clientmailid = id.substring(id.indexOf("##") + 1, id.length());
        String host = "localhost";
        final String user = "vermasahil269@gmail.com";//change accordingly
        final String password = "sahil@21";//change accordingly

        //change accordingly

        //Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user, password);
                    }
                });

        //Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(clientmailid));
            message.setSubject("HariNaamSankirtan");

            message.setText(" your request for harinaamkirtan is approved ");

            //send the message
            Transport.send(message);
            return bookHariNaamSankirtanDao.sendAcknowledgement(Integer.parseInt(id.substring(0, id.indexOf("##"))));

        } catch (Exception e) {
            System.out.println(e);
            return "error";
        }
    }
}
