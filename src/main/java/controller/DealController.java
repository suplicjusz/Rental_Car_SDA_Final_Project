package controller;

import lombok.RequiredArgsConstructor;
import model.Deal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.DealService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/deal")
public class DealController {

    private final DealService DEAL_SERVICE;

    @GetMapping
    public ResponseEntity<List<Deal>> getAll() {
        return ResponseEntity.ok(DEAL_SERVICE.findAll());
    }

    @GetMapping("deal/{id}")
    public ResponseEntity<Deal> getById(@PathVariable long id) {
        return ResponseEntity.ok(DEAL_SERVICE.findById(id));
    }

    @PostMapping
    public ResponseEntity<Deal> save(@RequestBody Deal deal) {
        return ResponseEntity.ok(DEAL_SERVICE.save(deal));
    }

    @DeleteMapping("deal/{id}")
    public boolean deleteById(@PathVariable long id) {
        return DEAL_SERVICE.deleteById(id);
    }
}
