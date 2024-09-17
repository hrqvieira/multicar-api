package br.com.multicar.controller;

import br.com.multicar.entity.Car;
import br.com.multicar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping(value = "/save")
    public ResponseEntity<Car> saveCar(@RequestBody Car car) throws Exception {

        car = carService.saveCar(car);

        return ResponseEntity.ok().body(car);

    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<String> deleteCar(@RequestBody int id) {

        carService.deleteCar(id);

        return ResponseEntity.ok().body("car_deleted");

    }

    @GetMapping(value = "/car")
    public ResponseEntity<Car> getCarById(@RequestBody int id) {
        return ResponseEntity.ok().body(carService.getCarById(id));
    }

    @GetMapping(value = "/cars")
    public Page<Car> getCars(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id")String sortBy
    ){
        return carService.getAllCars(page, size, sortBy);
    }



}
