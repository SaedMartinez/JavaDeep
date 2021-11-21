package com.cudemy.service;

import java.util.List;

import com.cudemy.domain.Persona;

public interface IPersonaService {
	
	public List<Persona> listarPersonas();
	
	public void guardar(Persona pers);
	
	public void eliminar(Persona pers);
	
	public Persona encontrarPersona(Persona pers);
}
