package com.example.springdatajpa.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class MatriculaForm {

    @NotNull(message = "Prencha o campo corretamente.")
    @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long alunoId;

}
