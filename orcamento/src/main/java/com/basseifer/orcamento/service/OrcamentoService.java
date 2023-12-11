package com.basseifer.orcamento.service;

import com.basseifer.orcamento.model.Orcamento;
import com.basseifer.orcamento.model.OrcamentoRepository;
import com.basseifer.orcamento.model.Usuario;
import com.basseifer.orcamento.model.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
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
    public void inserirOrcamento(Orcamento orcamento, Long usuarioId) {

        Optional<Usuario> usuarioBd = usuarioRepository.findById(usuarioId);
        Optional<Orcamento> orcamentoBd = orcamentoRepository.findById(orcamento.getId());
        if(usuarioBd.isPresent()){
            if(orcamentoBd.isPresent()){

            }else {
                orcamentoRepository.save(orcamento);
            }
        }else{
            System.out.println("Usuário não existe !");
        }
    }

    @Override
    public void atualizar(Orcamento orcamento, Long usuarioId) {
        Optional<Usuario> usuarioBd = usuarioRepository.findById(usuarioId);
        Optional<Orcamento> orcamenteBd = orcamentoRepository.findById(orcamento.getId());
        if(usuarioBd.isPresent()){
            if(orcamenteBd.isPresent()){
                inserirOrcamento(orcamento, usuarioId);
            }
        }
    }

    @Override
    public void deletar(Long id) {
        orcamentoRepository.delete(buscarPorId(id));
    }
}
