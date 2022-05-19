package com.example.rental_car_sda_final_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class RentalCarSdaFinalProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(RentalCarSdaFinalProjectApplication.class, args);

    }

    @Bean
    Scanner scanner(){
        return new Scanner(System.in);
    }
}
