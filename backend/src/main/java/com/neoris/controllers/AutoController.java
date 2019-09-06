package com.neoris.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.neoris.modelo.Auto;
import com.neoris.service.imp.AutoImp;

@Controller
public class AutoController {

	
	@RequestMapping(value="guardoAuto", method=RequestMethod.POST,  headers ={"Accept=application/json"})
	public String guadroAuto(@RequestBody String auto) {
		
		AutoImp autoMistico = new AutoImp();
		Gson g = new Gson();
		autoMistico.saveAuto(((Auto)g.fromJson(auto, Auto.class)));
		return "saludo";
	}
}
