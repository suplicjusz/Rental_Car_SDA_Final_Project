package com.example.rental_car_sda_final_project.repository;

import com.example.rental_car_sda_final_project.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
