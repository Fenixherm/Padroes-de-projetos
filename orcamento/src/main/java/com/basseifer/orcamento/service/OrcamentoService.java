package com.basseifer.orcamento.service;

import com.basseifer.orcamento.model.Orcamento;

import java.util.Date;

public class OrcamentoService implements IOrcamentoService{
    @Override
    public Iterable<Orcamento> buscarTodos() {
        return null;
    }

    @Override
    public Iterable<Orcamento> buscarPorRomaneio(Integer romaneio) {
        return null;
    }

    @Override
    public Iterable<Orcamento> buscarPorObra(String obra) {
        return null;
    }

    @Override
    public Iterable<Orcamento> buscarPorCliente(String cliente) {
        return null;
    }

    @Override
    public Iterable<Orcamento> buscaPorSituacao(String situacao) {
        return null;
    }

    @Override
    public Iterable<Orcamento> buscaPorDataChegada(Date dataChegada) {
        return null;
    }

    @Override
    public Iterable<Orcamento> buscaPorDataSaida(Date dataSaida) {
        return null;
    }

    @Override
    public void inserirOrcamento(Orcamento orcamento) {

    }

    @Override
    public void atualizar(Long id, Orcamento orcamento) {

    }

    @Override
    public void deletar(Long id) {

    }
}
