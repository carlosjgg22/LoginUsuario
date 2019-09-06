package com.neoris.service.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.neoris.dao.ConnectionMysql;
import com.neoris.modelo.Auto;
import com.neoris.service.AutoDB;

public class AutoImp implements AutoDB {


	public void saveAuto(Auto auto) {
		
		String sql = "insert into autos (marca,modelo,color) values (?,?,?)";
		try {
			PreparedStatement ps = (PreparedStatement) ConnectionMysql.getConnection().prepareStatement(sql);
			
			ps.setString(1, auto.getMarca());
			ps.setString(2, auto.getModelo());
			ps.setString(3, auto.getColor());
			
			ps.execute();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public List<Auto> getAllAutos() {
		
		List<Auto> listaAuto = new ArrayList<Auto>();
		try {
			String query = "select * from autos";
			Statement st = (Statement)ConnectionMysql.getConnection().createStatement();
			
			ResultSet str =  (ResultSet)st.executeQuery(query);
			while(str.next()) {
				listaAuto.add(new Auto(str.getString("marca"), str.getString("modelo"), str.getString("color")));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listaAuto;
	}

}
