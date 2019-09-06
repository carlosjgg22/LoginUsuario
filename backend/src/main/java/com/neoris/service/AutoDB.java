package com.neoris.service;

import java.util.List;

import com.neoris.modelo.Auto;

public interface AutoDB {

	public void saveAuto(Auto auto);
	
	public List<Auto> getAllAutos();
	
}
