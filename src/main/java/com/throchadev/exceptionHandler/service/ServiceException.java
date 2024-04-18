package com.throchadev.exceptionHandler.service;

import com.throchadev.exceptionHandler.model.PesssoaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceException {

    public ResponseEntity<PesssoaRequest> save(PesssoaRequest pesssoaRequest){

        return ResponseEntity.ok().body(pesssoaRequest);
    }
}
