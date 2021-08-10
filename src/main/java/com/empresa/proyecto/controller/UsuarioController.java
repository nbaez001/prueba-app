package com.empresa.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Usuario;
import com.empresa.proyecto.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@PostMapping("/listar")
	public OutResponse<List<Usuario>> listar() {
		return usuarioService.listar();
	}

	@PostMapping("/registrar")
	public OutResponse<Usuario> registrar(@RequestBody Usuario req) {
		return usuarioService.registrar(req);
	}

	@PostMapping("/modificar")
	public OutResponse<Usuario> modificar(@RequestBody Usuario req) {
		return usuarioService.modificar(req);
	}

	@PostMapping("/eliminar")
	public OutResponse<?> eliminar(@RequestBody Usuario req) {
		return usuarioService.eliminar(req);
	}
}
