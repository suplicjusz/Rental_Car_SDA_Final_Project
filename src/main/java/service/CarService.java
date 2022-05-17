package service;

import lombok.RequiredArgsConstructor;
import model.Car;
import org.springframework.stereotype.Service;
import repository.CarRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository CAR_REPOSITORY;

    public Car findById(Long id) {
        return CAR_REPOSITORY.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Car> findAll() {
        return CAR_REPOSITORY.findAll();
    }

    public boolean deleteById(Long id) {
        CAR_REPOSITORY.deleteById(id);
        return true;
    }

    public Car save(Car car) {
        return CAR_REPOSITORY.save(car);
    }






}
