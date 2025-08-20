package org.model;

import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    private long id;
    private Date dataContrato;
    private float valorCaucao;
    private Enum status;
    private List<Locacao> listaLocacao;
    private float valorTotal;
//    private Funcionario funcionario;
    private Cliente cliente;

    public ContratoLocacao(long id, Date dataContrato, float valorCaucao, Enum status, float valorTotal, Cliente cliente) {
        this.id = id;
        this.dataContrato = dataContrato;
        this.valorCaucao = valorCaucao;
        this.status = status;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    enum status {
        ATIVO, CANCELADO, FINALIZADO
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public float getValorCaucao() {
        return valorCaucao;
    }

    public void setValorCaucao(float valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
