package com.empresa.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/listar")
	public OutResponse<List<Producto>> listar() {
		return productoService.listar();
	}
}
