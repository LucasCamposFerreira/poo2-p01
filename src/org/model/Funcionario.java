package org.model;

public class Funcionario extends Usuario {
    private String cargo;

    public Funcionario(long id, String nome, String cpf, String login, String senha, Contato contato, Endereco endereco) {
        super(id, nome, cpf, login, senha, contato, endereco);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // getters e setters
}
