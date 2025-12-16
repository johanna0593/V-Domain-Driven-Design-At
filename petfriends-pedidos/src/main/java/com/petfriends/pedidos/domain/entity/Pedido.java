package com.petfriends.pedidos.domain.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Pedido {

    @Id
    private UUID id;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    protected Pedido() {}

    public Pedido() {
        this.id = UUID.randomUUID();
        this.status = StatusPedido.NOVO;
    }

    public void confirmarPagamento() {
        this.status = StatusPedido.PAGO;
    }

    public void despachar() {
        this.status = StatusPedido.DESPACHADO;
    }

    public UUID getId() {
        return id;
    }
}
