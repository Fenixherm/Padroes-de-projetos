package com.basseifer.orcamento.controller;

import com.basseifer.orcamento.model.Orcamento;
import com.basseifer.orcamento.model.Usuario;
import com.basseifer.orcamento.service.OrcamentoService;
import com.basseifer.orcamento.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orcamentos")
public class OrcamentoController {
    @Autowired
    private OrcamentoService orcamentoService;
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<Iterable<Orcamento>> buscarTodos(){
        return ResponseEntity.ok(orcamentoService.buscarTodos());
    }
    @GetMapping("/{id}")
    public  ResponseEntity<Orcamento> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(orcamentoService.buscarPorId(id));
    }
    @PostMapping
    public ResponseEntity<Orcamento> inserir(@RequestBody Orcamento orcamento){
        orcamentoService.inserirOrcamento(orcamento);
        return ResponseEntity.ok(orcamento);
    }

    public ResponseEntity<Void> deletar(@PathVariable Long id){
        orcamentoService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
