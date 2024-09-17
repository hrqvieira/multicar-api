package br.com.multicar.service;

import br.com.multicar.repository.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaleService {

    @Autowired
    private ISaleRepository saleRepository;



}
