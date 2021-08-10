package com.empresa.proyecto.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.proyecto.entity.Sucursal;

public interface SucursalDao extends CrudRepository<Sucursal, Long> {

}
