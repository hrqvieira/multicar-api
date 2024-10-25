package br.com.multicar.service;

import br.com.multicar.entity.Car;
import br.com.multicar.exeption.ModelNullException;
import br.com.multicar.exeption.SellerNullExeption;
import br.com.multicar.repository.ICarRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarService {

    @Autowired
    private ICarRepository carRepository;

    public Car saveCar(Car car) throws Exception{
        if(car.getModel() == null)
            throw new ModelNullException();
        return carRepository.save(car);
    }

    public void deleteCar(long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Car with ID " + id + " not found.");
        }
    }

    public Car getCarById(long id){
        return carRepository.findById(id).get();
    }

    public Page<Car> getAllCars(int page, int size, String sortBy){
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return carRepository.findAll(pageable);
    }

    public Page<Car> getCarByModel(String model, int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return carRepository.findByModel(model, pageable);
    }


}
