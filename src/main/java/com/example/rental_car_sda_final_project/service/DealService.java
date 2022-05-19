package com.example.rental_car_sda_final_project.service;

import lombok.RequiredArgsConstructor;
import com.example.rental_car_sda_final_project.model.Deal;
import org.springframework.stereotype.Service;
import com.example.rental_car_sda_final_project.repository.DealRepository;

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

    public boolean deleteById(Long id) {
        DEAL_REPOSITORY.deleteById(id);
        return true;
    }

    public Deal save(Deal deal) {
        return DEAL_REPOSITORY.save(deal);
    }

}
