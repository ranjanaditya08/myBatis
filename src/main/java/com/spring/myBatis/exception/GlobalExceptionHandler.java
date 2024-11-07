package com.spring.myBatis.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        Map<String,String> errors = new HashMap<>();
        ex.getFieldErrors().forEach((err) -> {
            errors.put(err.getField(), err.getDefaultMessage());
        });

        //System.out.println("DEBUG: "+ errors);
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
