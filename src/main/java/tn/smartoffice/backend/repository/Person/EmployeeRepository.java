package tn.smartoffice.backend.repository.Person;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.smartoffice.backend.model.Person.Employee;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
    List<Employee> findAllBySepEquals(String Sep);
}
