package com.neoris.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import implementacion.UsuarioImp;
import modelo.Usuario;

@Controller
public class UsuarioController {

	private UsuarioImp imp;

	public UsuarioController(UsuarioImp imp) {
		super();
		this.imp = imp;
	}

	@RequestMapping(value="login",method=RequestMethod.GET,headers ={"Accept=application/json"})
	public boolean checkearUsuario(Usuario usuario) {
		return imp.checkearUsuario(usuario);
	}
	
	@RequestMapping(value="x",method=RequestMethod.GET)
	public Usuario traer(String usuario) {
		
	}

}
