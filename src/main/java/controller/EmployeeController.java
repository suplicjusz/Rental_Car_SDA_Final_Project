package controller;

import lombok.RequiredArgsConstructor;
import model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService EMPLOYEE_SERVICE;

    @GetMapping
    public ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(EMPLOYEE_SERVICE.findAll());
    }

    @GetMapping("employee/{id}")
    public ResponseEntity<Employee> getById(@PathVariable long id) {
        return ResponseEntity.ok(EMPLOYEE_SERVICE.findById(id));
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        return ResponseEntity.ok(EMPLOYEE_SERVICE.save(employee));
    }

    @DeleteMapping("employee/{id}")
    public boolean deleteById(@PathVariable long id) {
        return EMPLOYEE_SERVICE.deleteById(id);
    }

}
