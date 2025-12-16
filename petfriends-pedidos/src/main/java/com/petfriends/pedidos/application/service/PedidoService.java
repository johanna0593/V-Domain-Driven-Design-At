package com.petfriends.pedidos.application.service;

import com.petfriends.pedidos.domain.entity.Pedido;
import com.petfriends.pedidos.domain.event.PedidoDespachadoEvent;
import com.petfriends.pedidos.domain.event.PedidoPagoEvent;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    public PedidoPagoEvent confirmarPagamento(Pedido pedido) {
        pedido.confirmarPagamento();
        return new PedidoPagoEvent(pedido.getId());
    }

    public PedidoDespachadoEvent despacharPedido(Pedido pedido) {
        pedido.despachar();
        return new PedidoDespachadoEvent(pedido.getId());
    }
}
