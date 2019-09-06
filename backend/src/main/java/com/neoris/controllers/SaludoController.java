package com.neoris.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SaludoController {

	@RequestMapping(value="saludito", method=RequestMethod.GET)
	public String saludoMagico() {
		
		return "saludo";
	}
}
