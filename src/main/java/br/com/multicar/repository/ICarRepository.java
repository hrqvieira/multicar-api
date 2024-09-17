package br.com.multicar.repository;
import br.com.multicar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, Long> {
}
