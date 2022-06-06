package com.example.rental_car_sda_final_project.service;

import com.example.rental_car_sda_final_project.model.Deal;
import com.example.rental_car_sda_final_project.repository.DealRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DealServiceTest {

    @Mock
    DealRepository DEAL_REPOSITORY;

    @InjectMocks
    private DealService service;

    @Test
    void shouldReturnBestDeal() {
        //GIVEN
        Deal deal1 = new Deal();
        deal1.setCharge(BigDecimal.valueOf(505.25));
        Deal deal2 = new Deal();
        deal2.setCharge(BigDecimal.valueOf(494.75));
        List<Deal> deals = new ArrayList<>();
        deals.add(deal1);
        deals.add(deal2);

        //WHEN
        when(DEAL_REPOSITORY.findAll()).thenReturn(deals);

        //THEN
        assertEquals(deal1, service.findTheBestDeal());
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
        assertEquals(new BigDecimal("1000.00"), result);
    }

}