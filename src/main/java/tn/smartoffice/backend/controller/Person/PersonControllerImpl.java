package tn.smartoffice.backend.controller.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.smartoffice.backend.model.Person.Person;
import tn.smartoffice.backend.service.Person.PersonServiceImpl;

import java.util.List;

@RestController
public class PersonControllerImpl implements PersonController {
    @Autowired
    PersonServiceImpl personService;
    @Override
    public Person create(Person Person) {
        return personService.create(Person);
    }

    @Override
    public Person getById(int id) {
        return personService.getById(id);
    }

    @Override
    public List<Person> getAll() {
        return personService.getAll();
    }

   @Override
    public void deleteById(int id) {
        personService.deleteById(id);
    }

    @Override
    public Person update(Person Person) {
        return null;
    }
}
