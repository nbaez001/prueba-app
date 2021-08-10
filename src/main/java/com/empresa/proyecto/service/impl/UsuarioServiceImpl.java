package com.empresa.proyecto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.proyecto.dao.UsuarioDao;
import com.empresa.proyecto.entity.OutResponse;
import com.empresa.proyecto.entity.Usuario;
import com.empresa.proyecto.service.UsuarioService;
import com.empresa.proyecto.util.ConstanteUtil;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioDao usuarioDao;

	@Override
	public OutResponse<Usuario> registrar(Usuario req) {
		OutResponse<Usuario> out = new OutResponse<>();
		Usuario s = usuarioDao.save(req);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(s);

		return out;
	}

	@Override
	public OutResponse<List<Usuario>> listar() {
		OutResponse<List<Usuario>> out = new OutResponse<>();
		List<Usuario> lista = new ArrayList<>();
		usuarioDao.findAll().forEach(lista::add);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(lista);

		return out;
	}

	@Override
	public OutResponse<Usuario> modificar(Usuario req) {
		OutResponse<Usuario> out = new OutResponse<>();
		Usuario s = usuarioDao.save(req);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);
		out.setObjeto(s);

		return out;
	}

	@Override
	public OutResponse<?> eliminar(Usuario req) {
		OutResponse<?> out = new OutResponse<>();
		usuarioDao.delete(req);

		out.setCodigo(ConstanteUtil.R_EXITO);
		out.setMensaje(ConstanteUtil.M_EXITO);

		return out;
	}

}
