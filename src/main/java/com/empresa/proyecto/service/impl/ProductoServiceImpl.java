package com.empresa.proyecto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.proyecto.dao.ProductoDao;
import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Producto;
import com.empresa.proyecto.service.ProductoService;
import com.empresa.proyecto.util.ConstanteUtil;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoDao productoDao;

	@Override
	public OutResponse<Producto> registrar(Producto req) {
		OutResponse<Producto> out = new OutResponse<>();
		Producto s = productoDao.save(req);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(s);

		return out;
	}

	@Override
	public OutResponse<List<Producto>> listar() {
		OutResponse<List<Producto>> out = new OutResponse<>();
		List<Producto> lista = new ArrayList<>();
		productoDao.findAll().forEach(lista::add);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(lista);

		return out;
	}

	@Override
	public OutResponse<Producto> modificar(Producto req) {
		OutResponse<Producto> out = new OutResponse<>();
		Producto s = productoDao.save(req);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(s);

		return out;
	}

	@Override
	public OutResponse<?> eliminar(Producto req) {
		OutResponse<?> out = new OutResponse<>();
		productoDao.delete(req);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);

		return out;
	}

}
