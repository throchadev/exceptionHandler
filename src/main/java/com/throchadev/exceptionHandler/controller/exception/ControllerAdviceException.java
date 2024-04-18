package com.throchadev.exceptionHandler.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControllerAdviceException {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<ErrorDTO> handler(MethodArgumentNotValidException exception) {

       List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
       List<ErrorDTO> errorDTOS = new ArrayList<>();
       fieldErrors.forEach(error -> {
           errorDTOS.add(new ErrorDTO(error.getField(), error.getDefaultMessage()));
       });

       return errorDTOS;
    }
}
