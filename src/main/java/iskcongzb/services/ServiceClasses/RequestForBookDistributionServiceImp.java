package iskcongzb.services.ServiceClasses;

import iskcongzb.dao.DaoInterfaces.RequestForBookDistributionDao;
import iskcongzb.domain.RequestForBookDistribution;
import iskcongzb.services.ServiceInterfaces.RequestForBookDistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class RequestForBookDistributionServiceImp implements RequestForBookDistributionService {
@Autowired
RequestForBookDistributionDao requestForBookDistributionDao;
    public String makeRequest(RequestForBookDistribution requestForBookDistribution) {
        if(requestForBookDistributionDao.makeRequest(requestForBookDistribution)) {
            String host = "localhost";
            final String user = "vermasahil269@gmail.com";//change accordingly
            final String password = "sahil@cute";//change accordingly

            String to = "sahil.14bit1114@abes.ac.in";//change accordingly


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
                message.addRecipients(Message.RecipientType.CC,InternetAddress.parse(to));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(requestForBookDistribution.getFacilitatorName()));
                message.setSubject("Regular Book Distribution Request || Iskcon Ghaziabad ");
                message.setContent("<h3><b>Hare Krishna</b></h3><br><b>" +
                        requestForBookDistribution.getName() + "</b> Requested You To Be A Part Of Book distribution " +
                        "As A Regular Book Distribution" +
                        "Kindly Help Him As Soon As Possible <hr>" +
                        "<b>Details Of :" + requestForBookDistribution.getName() + "</b><br>" +
                        "Mobile Number" + requestForBookDistribution.getMobileNumber() + "<br>" +
                        "Email Id " + requestForBookDistribution.getEmailId() + "<br>" +
                        "Permanent Address " + requestForBookDistribution.getPermanentAddress(), "text/html");

                //send the message
                Transport.send(message);
                return "Request Send Successfully To Book Distribution Admin. We Will Contact You Shortly. Hare Krishna ";
            } catch (MessagingException e) {
                e.printStackTrace();
                return "Mail Service Error Please Try Again After Sometime";
            }
        }
       else {
            return "Some Error occured Please Try Again";
        }

    }
}
