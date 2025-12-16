package com.petfriends.pedidos.infrastructure.messaging;

import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

    public void publish(Object event) {
        // Publicação do evento (Kafka/Rabbit) - conceitual
    }
}
