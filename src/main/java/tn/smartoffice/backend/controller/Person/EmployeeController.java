package tn.smartoffice.backend.controller.Person;
import org.springframework.web.bind.annotation.*;
import tn.smartoffice.backend.model.Person.Employee;

import java.util.List;

@RequestMapping("/Employee")
public interface EmployeeController {
    // create
    @PostMapping
    public Employee create(@RequestBody Employee employee);
    // get & getAll
    @GetMapping("/{id}")
    public Employee getById(@PathVariable int id);
    @GetMapping()
    public List<Employee> getAll();
    @DeleteMapping("/{id}")
    // delete
    public void deleteById(@PathVariable int id);
    @PatchMapping
    // update
    public Employee update (@RequestBody Employee employee);

}
