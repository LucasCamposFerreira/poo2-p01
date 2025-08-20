package org.model;

public class Contato {
    private long id;
    private String email;
    private String celular;
    private String telefone;

    public Contato(long id, String email, String celular, String telefone) {
        this.id = id;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
