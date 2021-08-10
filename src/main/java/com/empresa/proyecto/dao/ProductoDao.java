package com.empresa.proyecto.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.proyecto.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
