package br.com.multicar.controller;

import br.com.multicar.exeption.ModelNullException;
import br.com.multicar.exeption.SellerNullExeption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ModelControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ModelNullException.class)
    public ResponseEntity<Object> catchModelNull(){
        Map<String, Object> body = new HashMap<String, Object>();
        body.put("error", "campo model esta vazio");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    @ExceptionHandler(SellerNullExeption.class)

    public ResponseEntity<Object> catchSellerNull(){

        Map<String, Object> body = new HashMap<String, Object>();
        body.put("error", "campo seller esta vazio");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);

    }

}
