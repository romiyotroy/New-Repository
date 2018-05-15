import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
public class SMTPAuthenticator extends Authenticator {
    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public SMTPAuthenticator(String userName,String password){
        this.userName=userName;
        this.password=password;
    }

    public PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication(userName, password);
    }
}