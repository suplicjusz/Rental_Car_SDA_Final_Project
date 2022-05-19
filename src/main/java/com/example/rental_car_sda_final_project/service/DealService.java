package com.example.rental_car_sda_final_project.service;

import lombok.RequiredArgsConstructor;
import com.example.rental_car_sda_final_project.model.Deal;
import org.springframework.stereotype.Service;
import com.example.rental_car_sda_final_project.repository.DealRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DealService {

    private final DealRepository DEAL_REPOSITORY;

    public Deal findById(Long id) {
        return DEAL_REPOSITORY.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Deal> findAll() {
        return DEAL_REPOSITORY.findAll();
    }

    public Deal findTheBestDeal(){
        List<Deal> listOfDeals = findAll();
        BigDecimal temp = new BigDecimal(0);
        Deal bestDeal = new Deal();
        for(Deal deal : listOfDeals) {
            if(deal.getCharge().compareTo(temp) > 0) {
                temp = deal.getCharge();
                bestDeal = deal;
            }
        }
        return bestDeal;
    }

    public static BigDecimal sumCharge(List<Deal> deals){
        BigDecimal sum = new BigDecimal(0);
        for(Deal deal : deals) {
            sum = sum.add(deal.getCharge());
        }
        return sum;
    }

    public boolean deleteById(Long id) {
        DEAL_REPOSITORY.deleteById(id);
        return true;
    }

    public Deal save(Deal deal) {
        return DEAL_REPOSITORY.save(deal);
    }

}
