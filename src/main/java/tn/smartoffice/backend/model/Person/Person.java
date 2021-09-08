package tn.smartoffice.backend.model.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.util.files.Photo;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Person")
@TypeAlias("Person")
public class Person {
    @Id
    private long personId;
    private int cin ;
    private String firstName ;
    private String lastName ;
    private String birthDate ;
    private Photo photo;


}
