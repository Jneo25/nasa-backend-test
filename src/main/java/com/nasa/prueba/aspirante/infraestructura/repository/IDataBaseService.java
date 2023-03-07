package com.nasa.prueba.aspirante.infraestructura.repository;

import java.util.List;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;

public interface IDataBaseService {

	public List<PruebaEntity> findAll();
	
	public PruebaEntity findById(Long id);
	
	public PruebaEntity save(PruebaEntity entity);
}
