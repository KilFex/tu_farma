package com.ventasTuFarma.tuFarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_farmacos")
public class Farmaco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

	private Long idFarmaco;
	private String nombre;
	private String laboratorio;
	private String concentracion;
	private Double precio;
	private Long stock;
	private String fechaVencimiento;
	private Boolean receta;
	
	public Farmaco() {
	}

	public Long getIdFarmaco() {
		return idFarmaco;
	}

	public void setIdFarmaco(Long idFarmaco) {
		this.idFarmaco = idFarmaco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Boolean getReceta() {
		return receta;
	}

	public void setReceta(Boolean receta) {
		this.receta = receta;
	}
	
	

	

}
