package com.throchadev.exceptionHandler.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PesssoaRequest {

    @NotNull
    @NotEmpty
    private String cpf;

    @NotNull
    @NotEmpty
    private String nome;
}
