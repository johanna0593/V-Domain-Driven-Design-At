package com.petfriends.almoxarifado.domain.repository;

import com.petfriends.almoxarifado.domain.entity.PedidoAlmoxarifado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoAlmoxarifadoRepository
        extends JpaRepository<PedidoAlmoxarifado, UUID> {
}
