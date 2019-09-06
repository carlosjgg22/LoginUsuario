package com.neoris.service;

public interface UsuarioService {
	
	public boolean validarUsuario(Usuario usuario);
	public boolean guardarUsuario(Usuario usuario);
	public boolean borrarUsuario(String nombreUsuario);
	public boolean modificarEmail(String nombreUsuario, String nuevoEmail);
	
}
