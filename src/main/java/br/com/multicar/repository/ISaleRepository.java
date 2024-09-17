package br.com.multicar.repository;
import br.com.multicar.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository  extends JpaRepository<Sale, Long> {
}
