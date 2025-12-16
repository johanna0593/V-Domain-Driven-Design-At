package com.petfriends.transporte.domain.repository;

import com.petfriends.transporte.domain.entity.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntregaRepository
        extends JpaRepository<Entrega, UUID> {
}
