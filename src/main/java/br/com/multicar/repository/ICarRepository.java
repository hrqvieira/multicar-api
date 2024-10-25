package br.com.multicar.repository;
import br.com.multicar.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICarRepository extends JpaRepository<Car, Long> {

    Page<Car> findByModel(String model, Pageable pageable);

}
