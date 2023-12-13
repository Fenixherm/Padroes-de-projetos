package com.basseifer.orcamento.service;

import com.basseifer.orcamento.model.Orcamento;


import java.util.List;

public interface IOrcamentoService {
    Iterable<Orcamento> buscarTodos();
    List<Orcamento> findAllBynomeCliente(String nome);
    Orcamento findByromaneio(Integer romaneio);
    Orcamento buscarPorId(Long idOrcamento);
    long countMethod();
    void inserirOrcamento(Orcamento orcamento);

    void atualizar(Long id, Orcamento orcamento);

    void deletar(Long idOrcamento);


}
