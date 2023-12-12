package com.basseifer.orcamento.service;

import com.basseifer.orcamento.model.Orcamento;
import com.basseifer.orcamento.model.Usuario;


import java.util.Date;

public interface IOrcamentoService {
    Iterable<Orcamento> buscarTodos();
    Orcamento findByromaneio(Integer romaneio);
    Orcamento buscarPorId(Long idOrcamento);

    void inserirOrcamento(Orcamento orcamento);

    void atualizar(Orcamento orcamento);

    void deletar(Long idOrcamento);


}
