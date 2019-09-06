package com.neoris.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private Connection com;

	public Conexion() {
		this.startedConexion();
	}

	public Connection startedConexion() {

		if (com == null) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				com = DriverManager.getConnection("jdbc:mysql://localhost:3306/tpneoris", "root", "");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return com;
	}

	public void closeConexion() {
		if (startedConexion() != null) {
			try {
				com.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}
