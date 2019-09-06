package com.neoris.modelo;

public class Usuario {

	private int idUsuario;
	private String usuario;
	private String password;
	private String email;
	private int privilegio;

	public Usuario(int idUsuario, String usuario, String password, String email, int privilegio) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.password = password;
		this.email = email;
		this.privilegio = privilegio;
	}

	public Usuario() {
		super();
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(int privilegio) {
		this.privilegio = privilegio;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", usuario=" + usuario + ", password=" + password + ", email="
				+ email + ", privilegio=" + privilegio + "]";
	}

}
