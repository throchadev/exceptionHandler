package com.throchadev.exceptionHandler.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDTO {

    private String campo;
    private String message;
}
