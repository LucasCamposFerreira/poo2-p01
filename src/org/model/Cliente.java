package org.model;

public class Cliente {
    private long id;
    private String cnh;

    public Cliente(long id, String cnh) {
        this.id = id;
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
