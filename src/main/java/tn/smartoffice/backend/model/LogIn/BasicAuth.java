package tn.smartoffice.backend.model.LogIn;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;

@TypeAlias("BasiAuth")
public class BasicAuth extends LogIn{
    final static String salt ="mil7 zyada 3al 3inin";
    final static long maxSize = 1000 ;
    @Getter
    @Setter
    @Id
    private String email;
    @Getter
    @Setter
    private String hashedPassword;
    public static String Hash(String password)
    {
        String originalString = password + salt;
        String sha256hex = DigestUtils.sha256Hex(originalString);
        return sha256hex;
    }
    private boolean checkPassword(String Password)
    {
        return true;
    }
    public BasicAuth(String Email , String Password)
    {
        email = Email;
        hashedPassword = Hash(Password);
        super.currentToken = newToken();
    }

}
