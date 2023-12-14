package com.basseifer.orcamento.service;

import com.basseifer.orcamento.model.Orcamento;
import org.springframework.cglib.core.Local;


import java.text.DateFormat;
import java.time.LocalDate;
import java.util.List;

public interface IOrcamentoService {
    Iterable<Orcamento> buscarTodos();
    Iterable<Orcamento> findAllBynomeCliente(String nome);
    Iterable<Orcamento> findByLocalDate(LocalDate data1, LocalDate data2);
    Orcamento findByromaneio(Integer romaneio);
    Orcamento buscarPorId(Long idOrcamento);
    long countMethod();
    void inserirOrcamento(Orcamento orcamento);

    void atualizar(Long id, Orcamento orcamento);

    void deletar(Long idOrcamento);




}
