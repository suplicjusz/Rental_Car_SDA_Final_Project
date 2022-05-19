package com.example.rental_car_sda_final_project.controller;

import com.example.rental_car_sda_final_project.model.Department;
import com.example.rental_car_sda_final_project.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
