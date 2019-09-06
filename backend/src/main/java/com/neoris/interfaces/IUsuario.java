package com.neoris.interfaces;

import com.neoris.modelo.Usuario;

public interface IUsuario {
	
	public boolean validarUsuario(Usuario usuario);
	public void eliminarUsuario(String usuario);
	public Usuario traer(String usuario);
}
