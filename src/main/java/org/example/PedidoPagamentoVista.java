package org.example;

public class PedidoPagamentoVista extends Pedido {

    public PedidoPagamentoVista(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    protected double getPercentualDiferenca() {
        return -0.05;
    }
}