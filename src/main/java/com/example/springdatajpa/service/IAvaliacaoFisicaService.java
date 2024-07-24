package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.AvaliacaoFisica;
import com.example.springdatajpa.entity.form.AvaliacaoFisicaForm;
import com.example.springdatajpa.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete (Long id);
}
