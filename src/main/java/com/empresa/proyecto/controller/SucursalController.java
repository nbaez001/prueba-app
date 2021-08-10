package com.empresa.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Sucursal;
import com.empresa.proyecto.service.SucursalService;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {

	@Autowired
	SucursalService sucursalService;

	@PostMapping("/listar")
	public OutResponse<List<Sucursal>> listar() {
		return sucursalService.listar();
	}

	@PostMapping("/registrar")
	public OutResponse<Sucursal> registrar(@RequestBody Sucursal req) {
		return sucursalService.registrar(req);
	}

	@PostMapping("/modificar")
	public OutResponse<Sucursal> modificar(@RequestBody Sucursal req) {
		return sucursalService.modificar(req);
	}

	@PostMapping("/eliminar")
	public OutResponse<?> eliminar(@RequestBody Sucursal req) {
		return sucursalService.eliminar(req);
	}

}
