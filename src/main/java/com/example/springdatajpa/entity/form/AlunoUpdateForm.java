package com.example.springdatajpa.entity.form;

import lombok.Data;

@Data
public class AlunoUpdateForm {
    private String nome;
    private String cpf;
    private String bairro;
    private String dataDeNascimento;
}

