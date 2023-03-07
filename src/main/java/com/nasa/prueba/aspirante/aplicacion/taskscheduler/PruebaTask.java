package com.nasa.prueba.aspirante.aplicacion.taskscheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.nasa.prueba.aspirante.dominio.dto.Items;
import com.nasa.prueba.aspirante.dominio.dto.PruebaDto;
import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.infraestructura.clientrest.PruebaClienteRest;
import com.nasa.prueba.aspirante.infraestructura.repository.IDataBaseService;

public class PruebaTask {

	@Autowired
	private IDataBaseService iDataBaseService;
	
	@Autowired
	private PruebaClienteRest cliente;
	
	@Scheduled(fixedRate = 3000)
	public void EjecutarTareaProgramada() {
		PruebaDto datos = cliente.getResponseApi();
		String href = datos.getHref();
		Items items = datos.getItems().get(0);
		com.nasa.prueba.aspirante.dominio.dto.Data data = items.getData().get(0);
		
		PruebaEntity entity = new PruebaEntity();
		entity.setHref(href);
		entity.setCenter(data.getCenter());
		entity.setTitle(data.getTitle());
		entity.setNasa_id(data.getNasa_id());
		iDataBaseService.save(entity);
		
	}
}
