package com.petfriends.transporte.domain.event;

import java.util.UUID;

public class PedidoDespachadoEvent {

    private UUID pedidoId;
    private String enderecoEntrega;

    public UUID getPedidoId() {
        return pedidoId;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }
}
