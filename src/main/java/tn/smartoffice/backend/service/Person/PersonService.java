package tn.smartoffice.backend.service.Person;

import tn.smartoffice.backend.model.Person.Employee;
import tn.smartoffice.backend.model.Person.Person;

import java.util.List;

public interface PersonService {
    public Person create(Person person);
    public Person update(Person person);
    public void deleteById(int id);
    public Person getById(int id);
    public List<Person> getAll();

}
