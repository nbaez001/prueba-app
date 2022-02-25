package com.empresa.proyecto.entity;

public class Producto {

	private Long codProducto;
	private String nombre;
	private Double precio;

	public Long getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(Long codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
