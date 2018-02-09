package iskcongzb.services.ServiceClasses;

import iskcongzb.dao.DaoInterfaces.HarinaamSankirtanBookingDao;
import iskcongzb.domain.HarinaamSankirtan;
import iskcongzb.services.ServiceInterfaces.HarinaamSankirtanBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class HarinaamSankirtanBookingServiveImp implements HarinaamSankirtanBookingService {
    @Autowired
    HarinaamSankirtanBookingDao harinaamSankirtanBookingDao;

    public HarinaamSankirtan bookHarinaamSankirtan(HarinaamSankirtan harinaamSankirtan)  {
//        harinaamSankirtan.setLocationTrackingImage(null);
        harinaamSankirtan.setApprovedStatus(false);
        return harinaamSankirtanBookingDao.bookHarinaamSankirtan(harinaamSankirtan);
    }

    public String aaceptHarinaamRequest(int id) {
        String email=harinaamSankirtanBookingDao.acceptHarinaamSankirtanRequest(id);
        System.out.println(email);
        if(email!=null)
        {
            String host = "localhost";
            final String user = "vermasahil269@gmail.com";//change accordingly
            final String password = "sahil@cute";//change accordingly

            String to = email;//change accordingly


            //Get the session object
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port","465");
            props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port","465");

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
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setSubject("Iskcon Ghaziabad HarinaamSankirtan Request Reply");
                message.setContent("<h3><b>Hare Krishna</b></h3><br>" +
                        "Your Request For <b>HarinaamSankirtan</b> Is Approved <br>","text/html");

                //send the message
                Transport.send(message);

                return "Acknowledgement Of HarinaamSankirtan  Sent Successfully...! To "+email;

            } catch (MessagingException e) {
                e.printStackTrace();
                return "Mail Service Error";
            }
        }else {
            return "Record Does Not Exist";
        }
    }

    public String declineHarinaamRequest(int id) {
        return harinaamSankirtanBookingDao.declineHaarinaamSankirtanRequest(id);

    }
}
