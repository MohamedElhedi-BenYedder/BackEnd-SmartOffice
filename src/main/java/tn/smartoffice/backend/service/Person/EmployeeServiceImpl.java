package tn.smartoffice.backend.service.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import tn.smartoffice.backend.model.Person.Employee;
import tn.smartoffice.backend.repository.Person.EmployeeRepository;

import java.util.List;
@Component
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public Employee getById(int id) {
        return employeeRepository.findById(id).orElse(new Employee());
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAllBySepEquals("*");
    }
}
