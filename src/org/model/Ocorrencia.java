package org.model;

import java.util.Date;

public class Ocorrencia {
    private long id;
    private String descricao;
    private Date data;

    public Ocorrencia(long id, String descricao, Date data) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
