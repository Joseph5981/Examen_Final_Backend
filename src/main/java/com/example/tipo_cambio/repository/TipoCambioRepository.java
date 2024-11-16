package com.example.tipo_cambio.repository;

import com.example.tipo_cambio.entity.TipoCambioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoCambioRepository extends JpaRepository<TipoCambioEntity, Long> {
}