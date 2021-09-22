package tn.smartoffice.backend.model.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.Person.Person;
import tn.smartoffice.backend.model.Site;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("Data")
@TypeAlias("AccessData")
public class AccessData {
    @DBRef
    Person person;
    @DBRef
    Site site;
    Date startDate;
    Date endDate;

}
