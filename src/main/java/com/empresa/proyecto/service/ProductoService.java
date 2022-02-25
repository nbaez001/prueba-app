package com.empresa.proyecto.service;

import java.util.List;

import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Producto;

public interface ProductoService {

	public OutResponse<List<Producto>> listar();

}
