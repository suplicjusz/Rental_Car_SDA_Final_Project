package service;

import lombok.RequiredArgsConstructor;
import model.Employee;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository EMPLOYEE_REPOSITORY;

    public Employee findById(Long id) {
        return EMPLOYEE_REPOSITORY.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Employee> findAll() {
        return EMPLOYEE_REPOSITORY.findAll();
    }

    public boolean deleteById(Long id) {
        EMPLOYEE_REPOSITORY.deleteById(id);
        return true;
    }

    public Employee save(Employee employee) {
        return EMPLOYEE_REPOSITORY.save(employee);
    }


}
