package com.empresa.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUCURSAL")
public class Sucursal {

	@Id
	@Column(name = "COD_SUCURSAL")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codSucursal;

	@Column(name = "NOMBRE")
	private String nombre;

	public Long getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(Long codSucursal) {
		this.codSucursal = codSucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
