package com.nasa.prueba.aspirante.infraestructura.repository;

import org.springframework.data.repository.CrudRepository;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;

public interface PruebaInterfaz extends CrudRepository<PruebaEntity, Long> {

}
