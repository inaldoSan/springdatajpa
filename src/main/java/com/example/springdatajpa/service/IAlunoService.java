package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Aluno;
import com.example.springdatajpa.entity.AvaliacaoFisica;
import com.example.springdatajpa.entity.form.AlunoForm;
import com.example.springdatajpa.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);


    Aluno get(Long id);


    List<Aluno> getAll();


    Aluno update(Long id, AlunoUpdateForm formUpdate);


    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
