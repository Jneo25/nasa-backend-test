package com.nasa.prueba.aspirante.infraestructura.clientrest;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nasa.prueba.aspirante.dominio.dto.PruebaDto;

@Component
public class PruebaClienteRest {

	
	public PruebaDto getResponseApi() {
		
		String url = "https://images-api.nasa.gov/search?q=apollo%2011";
		RestTemplate plantilla = new RestTemplate();
		PruebaDto resultado = plantilla.getForObject(url, PruebaDto.class);
        System.out.println(resultado);
        return resultado;
	}
}
