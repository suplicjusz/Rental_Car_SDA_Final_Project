package com.example.rental_car_sda_final_project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    private long id;
    @OneToMany
    private List<Car> cars;
    @OneToMany
    private List<Employee> employeesOfDepartment;



}
