package com.nasa.prueba.aspirante.dominio.dto;

import java.io.Serializable;
import java.util.List;

public class PruebaDto implements Serializable {

	private String version;
	private String href;
	private List<Items> items;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

}
