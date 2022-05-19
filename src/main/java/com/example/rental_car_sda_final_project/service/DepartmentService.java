package com.example.rental_car_sda_final_project.service;

import com.example.rental_car_sda_final_project.model.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.rental_car_sda_final_project.repository.DepartmentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository DEPARTMENT_REPOSITORY;

    public Department findById(Long id) {
        return DEPARTMENT_REPOSITORY.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Department> findAll() {
        return DEPARTMENT_REPOSITORY.findAll();
    }

    public boolean deleteById(Long id) {
        DEPARTMENT_REPOSITORY.deleteById(id);
        return true;
    }

    public Department save(Department department) {
        return DEPARTMENT_REPOSITORY.save(department);
    }


}
