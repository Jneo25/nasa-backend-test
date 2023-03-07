package com.nasa.prueba.aspirante.infraestructura.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.infraestructura.repository.IDataBaseService;

@RestController
@RequestMapping("/api")
public class PruebaRestController {

	@Autowired
	private IDataBaseService iDataBaseService;
	
	@GetMapping("/nasa")
	public List<PruebaEntity> getAll(){
		return iDataBaseService.findAll();
	}
	
	@GetMapping("/nasa/{id}")
	public PruebaEntity getById(@PathVariable Long id) {
		return iDataBaseService.findById(id);
	}
}
