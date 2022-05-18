package controller;

import lombok.RequiredArgsConstructor;
import model.Deal;
import model.MonthStats;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.MonthStatsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/month-stats")
public class MonthStatsController {

    private final MonthStatsService MONTH_STATS_SERVICE;

    @GetMapping
    public ResponseEntity<List<MonthStats>>  getAll() {
        return ResponseEntity.ok(MONTH_STATS_SERVICE.findAll());
    }

    @GetMapping("month-stats/{id}")
    public ResponseEntity<MonthStats> getById(@PathVariable long id) {
        return ResponseEntity.ok(MONTH_STATS_SERVICE.findById(id));
    }

    @PostMapping
    public ResponseEntity<MonthStats> save(@RequestBody MonthStats monthStats) {
        return ResponseEntity.ok(MONTH_STATS_SERVICE.save(monthStats));
    }

    @DeleteMapping("month-stats/{id}")
    public boolean deleteById(@PathVariable long id) {
        return MONTH_STATS_SERVICE.deleteById(id);
    }

}
