package com.petfriends.almoxarifado.domain.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class PedidoAlmoxarifado {

    @Id
    private UUID id;

    private UUID pedidoId;

    @Enumerated(EnumType.STRING)
    private StatusSeparacao status;

    @Embedded
    private LocalizacaoEstoque localizacaoEstoque;

    protected PedidoAlmoxarifado() {}

    public PedidoAlmoxarifado(UUID pedidoId, LocalizacaoEstoque localizacaoEstoque) {
        this.id = UUID.randomUUID();
        this.pedidoId = pedidoId;
        this.status = StatusSeparacao.PENDENTE;
        this.localizacaoEstoque = localizacaoEstoque;
    }

    public void iniciarSeparacao() {
        this.status = StatusSeparacao.EM_SEPARACAO;
    }

    public void finalizarSeparacao() {
        this.status = StatusSeparacao.SEPARADO;
    }
}
