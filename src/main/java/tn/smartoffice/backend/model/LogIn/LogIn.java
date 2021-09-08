package tn.smartoffice.backend.model.LogIn;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.Person.Person;

@Document(collection = "LogIn")
@TypeAlias("LogIn")
public abstract class LogIn {
    @DBRef
    private Person user;
    public abstract String newToken();

}
