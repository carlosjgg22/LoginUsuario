package com.neoris.service.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.neoris.service.Usuario;
import com.neoris.service.UsuarioService;

public class UsuarioServiceImp implements UsuarioService{

	private Conexion conn;
	
	public UsuarioServiceImp() {
		this.conn = new Conexion();
	}
	
	public boolean validarUsuario(Usuario usuario) {
		String sql = "SELECT * FROM Usuarios WHERE usuario=? AND password=?";
		try {
			PreparedStatement ps = this.conn.startedConexion().prepareStatement(sql);
			ps.setString(1, usuario.getUsuario());
			ps.setString(2, usuario.getPassword());
			ResultSet rs = ps.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean guardarUsuario(Usuario usuario) {
		String sql = "INSERT INTO Usuarios (usuario, password, email, privilegio) VALUES (?,?,?,?)";
		try {
			PreparedStatement ps = this.conn.startedConexion().prepareStatement(sql);
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getPassword());
			ps.setString(3, usuario.getEmail());
			ps.setInt(3, usuario.getPrivilegio());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			
		}
		return false;
	}

	public boolean borrarUsuario(String nombreUsuario) {
		String sql = "DELETE FROM Usuarios WHERE usuario='" + nombreUsuario + "'" ;
		try {
			Statement st = this.conn.startedConexion().createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// idUsuario, usuario, password, email privilegio //
	public boolean modificarEmail(Usuario usuario, String nuevoEmail) {
		String sql = "UPDATE Usuarios SET email=? WHERE id=?"		
		try {
			PrepareStatement ps = this.conn.startedConexion().prepareStatement(sql);
			ps.setString(1, nuevoEmail);
			ps.setInt(2, usuario.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
}
