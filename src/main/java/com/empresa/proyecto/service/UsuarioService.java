package com.empresa.proyecto.service;

import java.util.List;

import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Usuario;

public interface UsuarioService {

	public OutResponse<List<Usuario>> listar();

	public OutResponse<Usuario> registrar(Usuario req);

	public OutResponse<Usuario> modificar(Usuario req);

	public OutResponse<?> eliminar(Usuario req);
}
