package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void testPedidoCredito() {
        Pedido pedido = new PedidoPagamentoCredito("Teclado", 200.0);
        assertEquals(210.0, pedido.calcularValorFinal(), 0.001);
    }

    @Test
    void testPedidoVista() {
        Pedido pedido = new PedidoPagamentoVista("Teclado", 200.0);
        assertEquals(190.0, pedido.calcularValorFinal(), 0.001);
    }
}