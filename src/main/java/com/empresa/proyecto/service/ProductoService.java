package com.empresa.proyecto.service;

import java.util.List;

import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Producto;

public interface ProductoService {

	public OutResponse<List<Producto>> listar();

	public OutResponse<Producto> registrar(Producto req);

	public OutResponse<Producto> modificar(Producto req);

	public OutResponse<?> eliminar(Producto req);
}
