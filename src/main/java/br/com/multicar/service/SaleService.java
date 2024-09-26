package br.com.multicar.service;

import br.com.multicar.entity.Sale;
import br.com.multicar.repository.ICarRepository;
import br.com.multicar.repository.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class SaleService {

    @Autowired
    private ISaleRepository saleRepository;

    public Sale save(Sale sale) throws Exception {
        return saleRepository.save(sale);
    }

    public void delete(long id) {
        saleRepository.deleteById(id);
    }

    public Sale findById(long id) {
        return saleRepository.findById(id).get();
    }

    public Page<Sale> findAll(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return saleRepository.findAll(pageable);
    }





}
