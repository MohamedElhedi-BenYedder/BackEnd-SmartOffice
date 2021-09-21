package tn.smartoffice.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.Person.Employee;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Site")
@TypeAlias("Site")
public class Site {
    @Id
    int siteId;
    String address;
    int PostalCode;
    String description;
    List<Employee> listOfEmployee;

}
