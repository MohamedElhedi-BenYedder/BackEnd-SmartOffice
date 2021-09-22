package tn.smartoffice.backend.model.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.util.roles.Role;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "Person")
@TypeAlias("Employee")
public class Employee extends Person {
    private Role role ;
    private boolean atWork;

}
