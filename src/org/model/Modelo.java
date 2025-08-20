package org.model;

import java.util.Date;

import java.util.List;

public class Modelo {

    private long id;
    private String nome;
    private Date anoModelo;
    private int qtModelos;
    private List<Veiculo> listVeiculos;

    public Modelo(long id, String nome, Date anoModelo, int qtModelos) {
        this.id = id;
        this.nome = nome;
        this.anoModelo = anoModelo;
        this.qtModelos = qtModelos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getQtModelos() {
        return qtModelos;
    }

    public void setQtModelos(int qtModelos) {
        this.qtModelos = qtModelos;
    }
}