package com.petfriends.almoxarifado.infrastructure.messaging;

import com.petfriends.almoxarifado.domain.event.PedidoPagoEvent;
import org.springframework.stereotype.Service;

@Service
public class PedidoPagoListener {

    public void receberEvento(PedidoPagoEvent event) {
        // Aqui o almoxarifado inicia a separação do pedido
    }
}
