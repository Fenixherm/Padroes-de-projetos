package com.basseifer.orcamento.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String tipoUsuario;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Orcamento> orcamento = new ArrayList<>();

    public List<Orcamento> getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(List<Orcamento> orcamento) {
        this.orcamento = orcamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
