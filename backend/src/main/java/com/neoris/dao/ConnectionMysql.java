package com.neoris.dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class ConnectionMysql {

	private static Connection conn = null;

	public static Connection getConnection() {

		try {
			// version anteriores de la JDK 5
			Class.forName("com.mysql.jdbc.Driver");

			// patron de comportamiento singleton ... si esta instanciado el objeto devuelvo
			// la instancia sino la inicializo
			if (conn == null) {
				conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/neoris", "root", "");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
