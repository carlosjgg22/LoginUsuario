package com.neoris.service;

import com.neoris.modelo.Usuario;

public interface UsuarioService {
	
	public boolean validarUsuario(Usuario usuario);
	public boolean guardarUsuario(Usuario usuario);
	public boolean borrarUsuario(String nombreUsuario);
	public boolean modificarEmail(Usuario usuario, String nuevoEmail);
	
}
