package tn.smartoffice.backend.service.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.smartoffice.backend.model.Person.Person;
import tn.smartoffice.backend.repository.Person.PersonRepository;
import java.util.List;

@Component
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        personRepository.deleteById(id);

    }

    @Override
    public Person getById(int id) {
        return personRepository.findById(id).orElse(new Person());
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

}
