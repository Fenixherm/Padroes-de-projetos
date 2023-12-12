package com.basseifer.orcamento.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Orcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeCliente;
    private Double peso;
    private Double pesoDiferenca;
    private Double pesoFinal;
    private String obra;
    private int romaneio;
    private int posicao;
    private Date dataChegada;
    private Date dataSaida;
    private String tipoProjeto;
    private String situacao;
    @ManyToOne
    @JoinColumn(name = "usuario_Id", referencedColumnName = "id")
    private Usuario usuario;

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPesoDiferenca() {
        return pesoDiferenca;
    }

    public void setPesoDiferenca(Double pesoDiferenca) {
        this.pesoDiferenca = pesoDiferenca;
    }

    public Double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(Double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public int getRomaneio() {
        return romaneio;
    }

    public void setRomaneio(int romaneio) {
        this.romaneio = romaneio;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getTipoProjeto() {
        return tipoProjeto;
    }

    public void setTipoProjeto(String tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
