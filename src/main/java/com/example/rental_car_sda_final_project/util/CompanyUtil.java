package com.example.rental_car_sda_final_project.util;

import lombok.RequiredArgsConstructor;
import com.example.rental_car_sda_final_project.model.Car;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class CompanyUtil {

    private final Scanner scanner;

    public void addCarToCompany() {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Enter mark of new car");
        car.setModel(sc.nextLine());
        System.out.println("Enter model of new car");
        car.setModel(sc.nextLine());
        System.out.println("Enter ");

    }

    public void addClientToStats() {

    }

    public void addEmployeeToCompany() {

    }

    public void addDepartmentToCompany() {

    }

    public void openDeal() {

    }

    public void closeDeal() {

    }


}
