package com.basseifer.orcamento.service;

import com.basseifer.orcamento.model.Orcamento;

import java.util.Date;

public interface IOrcamentoService {
    Iterable<Orcamento> buscarTodos();
    Iterable<Orcamento> buscarPorRomaneio(Integer romaneio);
    Iterable<Orcamento> buscarPorObra(String obra);
    Iterable<Orcamento> buscarPorCliente(String cliente);
    Iterable<Orcamento> buscaPorSituacao(String situacao);
    Iterable<Orcamento> buscaPorDataChegada(Date dataChegada);
    Iterable<Orcamento> buscaPorDataSaida(Date dataSaida);

    void inserirOrcamento(Orcamento orcamento);
    void atualizar(Long id, Orcamento orcamento);
    void deletar(Long id);


}
