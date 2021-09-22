package tn.smartoffice.backend.model.Data;

import org.springframework.data.mongodb.core.mapping.DBRef;
import tn.smartoffice.backend.model.Person.Person;
import tn.smartoffice.backend.model.Site;

import java.util.Date;

public class AccessData {
    @DBRef
    Person person;
    @DBRef
    Site site;
    Date startDate;
    Date endDate;

}
