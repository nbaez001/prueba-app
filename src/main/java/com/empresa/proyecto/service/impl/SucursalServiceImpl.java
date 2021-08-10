package com.empresa.proyecto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.proyecto.dao.SucursalDao;
import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Sucursal;
import com.empresa.proyecto.service.SucursalService;
import com.empresa.proyecto.util.ConstanteUtil;

@Service
public class SucursalServiceImpl implements SucursalService {

	@Autowired
	SucursalDao sucursalDao;

	@Override
	public OutResponse<Sucursal> registrar(Sucursal req) {
		OutResponse<Sucursal> out = new OutResponse<>();
		Sucursal s = sucursalDao.save(req);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(s);

		return out;
	}

	@Override
	public OutResponse<List<Sucursal>> listar() {
		OutResponse<List<Sucursal>> out = new OutResponse<>();
		List<Sucursal> lista = new ArrayList<>();
		sucursalDao.findAll().forEach(lista::add);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(lista);

		return out;
	}

	@Override
	public OutResponse<Sucursal> modificar(Sucursal req) {
		OutResponse<Sucursal> out = new OutResponse<>();
		Sucursal s = sucursalDao.save(req);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(s);

		return out;
	}

	@Override
	public OutResponse<?> eliminar(Sucursal req) {
		OutResponse<?> out = new OutResponse<>();
		sucursalDao.delete(req);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);

		return out;
	}

}
