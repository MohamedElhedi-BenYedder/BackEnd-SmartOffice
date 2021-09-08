package tn.smartoffice.backend.repository.Person;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.smartoffice.backend.model.Person.Employee;
import tn.smartoffice.backend.model.Person.Person;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person,Integer> {

}
