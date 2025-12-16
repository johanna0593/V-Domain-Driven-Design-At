package com.petfriends.pedidos.domain.event;

import java.util.UUID;

public class PedidoPagoEvent {

    private UUID pedidoId;

    public PedidoPagoEvent(UUID pedidoId) {
        this.pedidoId = pedidoId;
    }

    public UUID getPedidoId() {
        return pedidoId;
    }
}
