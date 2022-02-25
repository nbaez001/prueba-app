package com.empresa.proyecto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Producto;
import com.empresa.proyecto.service.ProductoService;
import com.empresa.proyecto.util.ConstanteUtil;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Override
	public OutResponse<List<Producto>> listar() {
		OutResponse<List<Producto>> out = new OutResponse<>();
		List<Producto> lista = new ArrayList<>();
		Producto p = new Producto();
		p.setCodProducto(1L);
		p.setNombre("PRODUCTO 1");
		p.setPrecio(22.2);
		lista.add(p);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(lista);

		return out;
	}

}
