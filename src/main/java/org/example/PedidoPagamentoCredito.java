package org.example;

public class PedidoPagamentoCredito extends Pedido {

    public PedidoPagamentoCredito(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    protected double getPercentualDiferenca() {
        return 0.05;
    }
}