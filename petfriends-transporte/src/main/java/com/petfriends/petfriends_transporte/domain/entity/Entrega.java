package com.petfriends.transporte.domain.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Entrega {

    @Id
    private UUID id;

    private UUID pedidoId;

    @Enumerated(EnumType.STRING)
    private StatusEntrega status;

    @Embedded
    private EnderecoEntrega enderecoEntrega;

    protected Entrega() {}

    public Entrega(UUID pedidoId, EnderecoEntrega enderecoEntrega) {
        this.id = UUID.randomUUID();
        this.pedidoId = pedidoId;
        this.status = StatusEntrega.EM_TRANSITO;
        this.enderecoEntrega = enderecoEntrega;
    }

    public void confirmarEntrega() {
        this.status = StatusEntrega.ENTREGUE;
    }

    public void registrarDevolucao() {
        this.status = StatusEntrega.DEVOLVIDO;
    }
}
