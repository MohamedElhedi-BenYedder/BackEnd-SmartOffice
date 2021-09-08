package tn.smartoffice.backend.service.Person;

import tn.smartoffice.backend.model.Person.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee create(Employee employee);
    public Employee update(Employee employee);
    public void deleteById(int id);
    public Employee getById(int id);
    public List<Employee> getAll();
}
