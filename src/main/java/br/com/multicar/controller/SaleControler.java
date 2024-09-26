package br.com.multicar.controller;

import br.com.multicar.entity.Sale;
import br.com.multicar.service.CarService;
import br.com.multicar.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/sale")
public class SaleControler {

    @Autowired
    private SaleService saleService;

    @PostMapping(value="/save")
    public ResponseEntity<Sale> saveSale(@RequestBody Sale sale) throws Exception {

        sale = saleService.save(sale);

        return ResponseEntity.ok(sale);

    }

}
