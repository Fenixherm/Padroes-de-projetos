package com.basseifer.orcamento.controller;

import com.basseifer.orcamento.model.Orcamento;
import com.basseifer.orcamento.service.OrcamentoService;
import com.basseifer.orcamento.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/buscar-orcamento/{id}")
    public  ResponseEntity<Orcamento> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(orcamentoService.buscarPorId(id));
    }

    @GetMapping("/buscar-romaneio/{romaneio}")
    public  ResponseEntity<Orcamento> buscarPorRomaneio(@PathVariable Integer romaneio){
        return ResponseEntity.ok(orcamentoService.findByromaneio(romaneio));
    }

    @GetMapping("/total-orcamentos")
    public ResponseEntity<Long> countMethod(){
        return ResponseEntity.ok(orcamentoService.countMethod());
    }

    @GetMapping("/buscar-nome/{nome}")
    public ResponseEntity<List<Orcamento>> findAllByName(@PathVariable String nome){
        return ResponseEntity.ok(orcamentoService.findAllBynomeCliente(nome));
    }

    @PostMapping
    public ResponseEntity<Orcamento> inserir(@RequestBody Orcamento orcamento){
        orcamentoService.inserirOrcamento(orcamento);
        return ResponseEntity.ok(orcamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Orcamento> atualizar(@PathVariable Long id, @RequestBody Orcamento orcamento){
        orcamentoService.atualizar(id, orcamento);
        return ResponseEntity.ok(orcamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        orcamentoService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
