package tn.smartoffice.backend.controller.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.smartoffice.backend.model.Person.Employee;
import tn.smartoffice.backend.service.Person.EmployeeService;

import java.util.List;

@RestController
public class EmployeeControllerImpl implements EmployeeController{
    @Autowired
    EmployeeService employeeService;
    @Override
    public Employee create(Employee employee) {
        return employeeService.create(employee);
    }

    @Override
    public Employee getById(int id) {
        return employeeService.getById(id);
    }

    @Override
    public List<Employee> getAll() {
        return employeeService.getAll();
    }


    @Override
    public void deleteById(int id) {
        employeeService.deleteById(id);
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }
}
