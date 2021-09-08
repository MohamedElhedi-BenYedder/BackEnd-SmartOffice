package tn.smartoffice.backend.controller.Person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.smartoffice.backend.model.Person.Employee;
import tn.smartoffice.backend.model.Person.Person;

import java.util.List;

@RequestMapping("/Person")
public interface PersonController {
    // create
    @PostMapping
    public Person create(@RequestBody Person person);
    // get & getAll
    @GetMapping("/{id}")
    public Person getById(@PathVariable int id);
    @GetMapping()
    public List<Person> getAll();
    @DeleteMapping("/{id}")
    // delete
    public void deleteById(@PathVariable int id);
    @PatchMapping
    // update
    public Person update (@RequestBody Person person);

}
