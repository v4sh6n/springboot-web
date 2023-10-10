package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		
		//another example return "redirect:https://www.google.es";
		//return "redirect:/app/index";
		//forward no cambia la url, buena practica para pagina de inicio
		return "forward:/app/index";
	}

}
