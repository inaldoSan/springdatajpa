package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Matricula;
import com.example.springdatajpa.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);

}
