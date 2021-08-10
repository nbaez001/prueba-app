package com.empresa.proyecto.service;

import java.util.List;

import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Sucursal;

public interface SucursalService {

	public OutResponse<List<Sucursal>> listar();
	
	public OutResponse<Sucursal> registrar(Sucursal req);
	
	public OutResponse<Sucursal> modificar(Sucursal req);
	
	public OutResponse<?> eliminar(Sucursal req);
}
