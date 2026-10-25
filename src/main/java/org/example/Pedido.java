package org.example;

public abstract class Pedido {
    private String nome;
    private double valor;

    public Pedido(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public final double calcularValorFinal() {
        return valor + (valor * getPercentualDiferenca());
    }

    protected abstract double getPercentualDiferenca();

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}