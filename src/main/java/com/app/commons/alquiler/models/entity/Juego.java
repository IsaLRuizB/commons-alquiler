package com.app.commons.alquiler.models.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="juego")
public class Juego {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String protagonista;
	private String marca;
	private String productor;
	private String director;
	private String tecnologia;
	private BigDecimal precioVenta;
	private BigDecimal precioAlquiler;
	private Integer cantDisponible;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getProtagonista() {
		return protagonista;
	}
	public void setProtagonista(String protagonista) {
		this.protagonista = protagonista;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}
	public BigDecimal getPrecioAlquiler() {
		return precioAlquiler;
	}
	public void setPrecioAlquiler(BigDecimal precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	public Integer getCantDisponible() {
		return cantDisponible;
	}
	public void setCantDisponible(Integer cantDisponible) {
		this.cantDisponible = cantDisponible;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if(!(obj instanceof Juego)) {
			
			return false;
		}
		Juego a = (Juego) obj;
		return this.id != null && this.id.equals(a.getId());		
	}
	

}
