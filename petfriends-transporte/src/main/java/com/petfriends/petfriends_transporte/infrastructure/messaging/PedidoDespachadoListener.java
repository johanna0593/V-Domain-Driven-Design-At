package com.petfriends.transporte.infrastructure.messaging;

import com.petfriends.transporte.domain.event.PedidoDespachadoEvent;
import org.springframework.stereotype.Service;

@Service
public class PedidoDespachadoListener {

    public void receberEvento(PedidoDespachadoEvent event) {
        // Aqui o transporte cria a entrega e inicia o envio
    }
}
