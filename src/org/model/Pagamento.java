package org.model;

public class Pagamento {
    private long id;
    private Enum tipoPagamento;
    private float valorFloat;

    public Pagamento(long id, Enum tipoPagamento, float valorFloat) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorFloat = valorFloat;
    }

    enum TipoPagamento {
        DINHEIRO, CARTAO_CREDITO, CARTAO_DEBITO, PIX
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enum getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Enum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public float getValorFloat() {
        return valorFloat;
    }

    public void setValorFloat(float valorFloat) {
        this.valorFloat = valorFloat;
    }
}
