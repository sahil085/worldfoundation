package iskcongzb.services.ServiceClasses;

import iskcongzb.dao.DaoInterfaces.RequestForPersonalClassDao;
import iskcongzb.domain.RequestForPersonalClass;
import iskcongzb.services.ServiceInterfaces.RequestForPersonalClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class RequestForpersonalClassServiceImp implements RequestForPersonalClassService {
    @Autowired
    RequestForPersonalClassDao requestForPersonalClassDao;
    public String sendRequestToIyfAdmin(RequestForPersonalClass personalClass) {
        if(requestForPersonalClassDao.createRequest(personalClass))
        {
            String host = "localhost";
            final String user = "vermasahil269@gmail.com";//change accordingly
            final String password = "sahil@cute";//change accordingly

            String to = "sahil.14bit1114@abes.ac.in";//change accordingly


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
                message.setSubject(" Request For Personal Class || Request || Iskcon Ghaziabad ");
                message.setContent("<h3><b>Hare Krishna</b></h3><br><b>" +
                        personalClass.getUser().getUserName()+"</b> Requested You To For Personal Class Kindly Help Him/Her <hr>" +
                        "<b>Details Of :" +personalClass.getUser().getUserName()+"</b><br>"+
                        "Mobile Number"+personalClass.getUser().getMobileNumber()+"<br>" +
                        "Email Id "+personalClass.getUser().getEmail()+"<br>" +
                        "Permanent Address "+personalClass.getUser().getAddress(),"text/html");

                //send the message
                Transport.send(message);

                return "Request Send Successfully To Iskcon IYF Admin. We Will Contact You Shortly. Hare Krishna..!! ";

            } catch (MessagingException e) {
                e.printStackTrace();
                return "Mail Service Error";
            }

        }else {
            return "OOps Some Technical Error Occured..!";
        }
    }
}
