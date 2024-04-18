package com.throchadev.exceptionHandler.controller;

import com.throchadev.exceptionHandler.model.PesssoaRequest;
import com.throchadev.exceptionHandler.service.ServiceException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ServiceException serviceException;

    @PostMapping("/save")
    public ResponseEntity<PesssoaRequest> save(@Valid @RequestBody PesssoaRequest pesssoaRequest) {

        return serviceException.save(pesssoaRequest);
    }
}
