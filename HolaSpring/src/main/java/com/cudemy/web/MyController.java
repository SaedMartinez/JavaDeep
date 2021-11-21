package com.cudemy.web;

import lombok.var;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cudemy.domain.Persona;
import com.cudemy.service.IPersonaService;


@Controller
public class MyController {

	@Autowired
	private IPersonaService pservice;
	
	
	Logger log = LoggerFactory.getLogger(MyController.class);
	
		
	@GetMapping("/")
	public String listar(Model model, @AuthenticationPrincipal User user) {

		var lpersonas = pservice.listarPersonas();
		model.addAttribute("listado", lpersonas);
		log.info(" ESTE INGRESO: "+user);
		return "index";

	}
	
	@GetMapping("/agregar")
	public  String agregar(Persona persona) {
		return "modificar";
	}
	
	
	@PostMapping("/guardar")
	public String guardar (Persona persona) {
		pservice.guardar(persona);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{id}")
	public String editar (Persona persona, Model model) {
		persona=pservice.encontrarPersona(persona);
		model.addAttribute("persona",persona);
		return "modificar";
	}
	
	@GetMapping("/eliminar")
	public String eliminar (Persona persona) {
		pservice.eliminar(persona);
		return "redirect:/";
	}

}
