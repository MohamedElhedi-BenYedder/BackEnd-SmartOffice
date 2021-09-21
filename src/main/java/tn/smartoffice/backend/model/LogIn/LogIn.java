package tn.smartoffice.backend.model.LogIn;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.Person.Person;
import java.security.SecureRandom;
import java.util.Base64;
@Document(collection = "LogIn")
@TypeAlias("LogIn")
public abstract class LogIn {

    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder();


    @DBRef
    private Person user;
    @Getter
    @Setter
    protected String currentToken;
    public static String newToken()
    {

        byte[] randomBytes = new byte[32];
        secureRandom.nextBytes(randomBytes);
        return base64Encoder.encodeToString(randomBytes);

    }

}
