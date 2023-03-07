package com.nasa.prueba.aspirante.infraestructura.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;

@Service
public class DataBaseServiceImpl implements IDataBaseService {

	@Autowired
	PruebaInterfaz pruebaInterfaz;
	
	@Override
	public List<PruebaEntity> findAll(){
		return (List<PruebaEntity>) pruebaInterfaz.findAll();
	}

	@Override
	public PruebaEntity findById(Long id) {
		return pruebaInterfaz.findById(id).orElse(null);
	}

	@Override
	public PruebaEntity save(PruebaEntity entity) {
		return pruebaInterfaz.save(entity);
	}
}
