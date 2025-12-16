package com.petfriends.pedidos.domain.event;

import java.util.UUID;

public class PedidoDespachadoEvent {

    private UUID pedidoId;

    public PedidoDespachadoEvent(UUID pedidoId) {
        this.pedidoId = pedidoId;
    }

    public UUID getPedidoId() {
        return pedidoId;
    }
}
