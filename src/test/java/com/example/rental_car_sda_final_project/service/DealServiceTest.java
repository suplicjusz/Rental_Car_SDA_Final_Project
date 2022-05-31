package com.example.rental_car_sda_final_project.service;

import com.example.rental_car_sda_final_project.model.Deal;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DealServiceTest {

    @Test
    void findTheBestDeal() {
        //GIVEN

        //WHEN

        //THEN
    }

    @Test
    void sumCharge() {
        //GIVEN
        Deal deal1 = new Deal();
        deal1.setCharge(BigDecimal.valueOf(505.25));
        Deal deal2 = new Deal();
        deal2.setCharge(BigDecimal.valueOf(494.75));
        List<Deal> deals = new ArrayList<>();
        deals.add(deal1);
        deals.add(deal2);
        //WHEN
        BigDecimal result = DealService.sumCharge(deals);

        //THEN
        Assertions.assertEquals(BigDecimal.valueOf(999.99).add(BigDecimal.valueOf(0.01)), result);
             //Why BigDecimal round off the places after coma to one, when I write with two?
             // Assertions.assertEquals(BigDecimal.valueOf(1000.00), result) -> expected is "1000.0" ???

    }
}