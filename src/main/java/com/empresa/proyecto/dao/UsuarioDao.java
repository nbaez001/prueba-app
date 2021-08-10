package com.empresa.proyecto.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.proyecto.entity.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {

}
