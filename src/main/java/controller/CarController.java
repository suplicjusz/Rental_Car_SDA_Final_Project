package controller;

import lombok.RequiredArgsConstructor;
import model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CarService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {

    private final CarService CAR_SERVICE;

    @GetMapping
    public ResponseEntity<List<Car>> getAll() {
        return ResponseEntity.ok(CAR_SERVICE.findAll());
    }

    @GetMapping("car/{id}")
    public ResponseEntity<Car> getById(@PathVariable long id) {
        return ResponseEntity.ok(CAR_SERVICE.findById(id));
    }

    @PostMapping
    public ResponseEntity<Car> save(@RequestBody Car car) {
        return ResponseEntity.ok(CAR_SERVICE.save(car));
    }

    @DeleteMapping("car/{id}")
    public boolean deleteById(@PathVariable long id) {
        return CAR_SERVICE.deleteById(id);
    }

}
