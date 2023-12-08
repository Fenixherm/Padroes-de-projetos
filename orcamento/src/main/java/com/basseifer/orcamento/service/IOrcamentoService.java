package com.basseifer.orcamento.service;

import com.basseifer.orcamento.model.Orcamento;


import java.util.Date;

public interface IOrcamentoService {
    Iterable<Orcamento> buscarTodos();
    Orcamento buscarPorId(Long id);

    void inserirOrcamento(Orcamento orcamento);
    void atualizar(Long id, Orcamento orcamento);
    void deletar(Long id);


}
