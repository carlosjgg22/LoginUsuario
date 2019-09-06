package com.neoris.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.neoris.modelo.Usuario;
import com.neoris.service.UsuarioService;
import com.neoris.service.imp.UsuarioServiceImp;

@Controller
public class UsuarioController {

	private UsuarioService us;

	public UsuarioController() {
		super();
		this.us = new UsuarioServiceImp();
	}

	@RequestMapping(value="login",method=RequestMethod.GET,headers ={"Accept=application/json"})
	public boolean validarUsuario(Usuario usuario) {
		return us.validarUsuario(usuario);
	}
	
	@RequestMapping(value="borrar",method=RequestMethod.POST)
	public boolean borrarUsuario(String nombreUsuario) {
		return us.borrarUsuario(nombreUsuario);
	}
	
	@RequestMapping(value="registrar",method = RequestMethod.POST)
	public boolean registrarUsuario(Usuario usuario) {
		return us.guardarUsuario(usuario);
	}
	
	@RequestMapping(value="modificar",method=RequestMethod.POST)
	public boolean modificar(Usuario usuario) {
		return us.modificarEmail(usuario, usuario.getEmail());
	}
}
