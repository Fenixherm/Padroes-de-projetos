package com.basseifer.orcamento.service;

import com.basseifer.orcamento.model.Orcamento;
import com.basseifer.orcamento.model.OrcamentoRepository;
import com.basseifer.orcamento.model.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Optional;

public class OrcamentoService implements IOrcamentoService{
    @Autowired
    private OrcamentoRepository orcamentoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Iterable<Orcamento> buscarTodos() {
        return orcamentoRepository.findAll();
    }

    @Override
    public Orcamento buscarPorId(Long id) {
        Optional<Orcamento> orcamento = orcamentoRepository.findById(id);

        return orcamento.get();
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
