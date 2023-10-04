package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	 
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "SpringBoot FRamework");
		
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Nombre");
		usuario.setApellido("Apellido");
		usuario.setEmail("nombre@correo.com");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		
		
		return "perfil";
		
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Nombre","Apellido","email"));
		usuarios.add(new Usuario("Johna","Doe","email2"));
		usuarios.add(new Usuario("Jane","Doe","email3"));
		usuarios.add(new Usuario("Tornado","Roe","email4"));
		model.addAttribute("titulo", "Listado de usuarios: ");
		model.addAttribute("usuarios", usuarios);
		
		return "listar";
	}

}
