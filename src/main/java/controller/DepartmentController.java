package controller;

import lombok.RequiredArgsConstructor;
import model.Department;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.DepartmentService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService DEPARTMENT_SERVICE;

    @GetMapping
    public ResponseEntity<List<Department>> getAll() {
        return ResponseEntity.ok(DEPARTMENT_SERVICE.findAll());
    }

    @GetMapping("department/{id}")
    public ResponseEntity<Department> getById(@PathVariable long id) {return ResponseEntity.ok(DEPARTMENT_SERVICE.findById(id));}

    @PostMapping
    public ResponseEntity<Department> save(@RequestBody Department department) {return ResponseEntity.ok(DEPARTMENT_SERVICE.save(department));}

    @DeleteMapping("department/{id}")
    public boolean deleteById(@PathVariable long id) {
        return DEPARTMENT_SERVICE.deleteById(id);
    }


}
