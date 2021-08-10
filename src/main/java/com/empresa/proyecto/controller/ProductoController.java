package com.empresa.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Producto;
import com.empresa.proyecto.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService productoService;

	@PostMapping("/listar")
	public OutResponse<List<Producto>> listar() {
		return productoService.listar();
	}

	@PostMapping("/registrar")
	public OutResponse<Producto> registrar(@RequestBody Producto req) {
		return productoService.registrar(req);
	}

	@PostMapping("/modificar")
	public OutResponse<Producto> modificar(@RequestBody Producto req) {
		return productoService.modificar(req);
	}

	@PostMapping("/eliminar")
	public OutResponse<?> eliminar(@RequestBody Producto req) {
		return productoService.eliminar(req);
	}
}
