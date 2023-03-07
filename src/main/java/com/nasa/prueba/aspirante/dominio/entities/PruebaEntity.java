package com.nasa.prueba.aspirante.dominio.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.PrePersist;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "prueba_entity")
public class PruebaEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	private String href;
	private String center;
	private String title;
	private String nasa_id;
	@Column(name = "created_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreatedDate;
	
	@PrePersist
	public void prePerist() {
		CreatedDate = new Date();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNasa_id() {
		return nasa_id;
	}

	public void setNasa_id(String nasa_id) {
		this.nasa_id = nasa_id;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

}
