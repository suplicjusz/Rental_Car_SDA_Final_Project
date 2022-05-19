package com.example.rental_car_sda_final_project.service;

import lombok.RequiredArgsConstructor;
import com.example.rental_car_sda_final_project.model.MonthStats;
import org.springframework.stereotype.Service;
import com.example.rental_car_sda_final_project.repository.MonthStatsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonthStatsService {

    private final MonthStatsRepository MONTH_STATS_REPOSITORY;

    public MonthStats findById(Long id) {
        return MONTH_STATS_REPOSITORY.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<MonthStats> findAll() {
        return MONTH_STATS_REPOSITORY.findAll();
    }

    public boolean deleteById(Long id) {
        MONTH_STATS_REPOSITORY.deleteById(id);
        return true;
    }

    public MonthStats save(MonthStats monthStats) {
        return MONTH_STATS_REPOSITORY.save(monthStats);
    }
}
