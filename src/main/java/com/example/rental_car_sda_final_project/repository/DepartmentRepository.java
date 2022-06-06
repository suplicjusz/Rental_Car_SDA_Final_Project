package com.example.rental_car_sda_final_project.repository;

import com.example.rental_car_sda_final_project.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
