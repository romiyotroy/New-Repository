import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
  
public class email {  
 public static void main(String[] args) {  
  
  String host="smtp.mail.yahoo.com";  
  final String user="romiyotroy@yahoo.com";//change accordingly  
  final String password="yahoomail";//change accordingly  
    
  String to="romiyotroy@gmail.com";//change accordingly  
  
   //Get the session object  
   //Properties props = new Properties();  
   //props.put("mail.smtp.host",host);  
   //props.put("mail.smtp.auth", "true");  
   SMTPAuthenticator authenticator = new SMTPAuthenticator(user, password);
   Properties properties = new Properties();
   properties.setProperty("mail.smtp.submitter", authenticator.getPasswordAuthentication().getUserName());
   properties.setProperty("mail.smtp.auth", "true");
   properties.setProperty("mail.smtp.host", "smtp.mail.yahoo.com");
   properties.setProperty("mail.smtp.port", "465");

   Session session = Session.getInstance(properties, authenticator);
   
   /*Session session = Session.getDefaultInstance(props,  
    new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  */
  
   //Compose the message  
    try {  
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("javatpoint");  
     message.setText("This is simple program of sending email using JavaMail API");  
       
    //send the message  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
   
     } catch (MessagingException e) {e.printStackTrace();}  
 }  
}  