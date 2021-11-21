package com.cudemy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cudemy.dao.IPersonaDAO;
import com.cudemy.domain.Persona;


@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDAO pdao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> listarPersonas() {
		return (List<Persona>) pdao.findAll();
		
	}

	@Override
	@Transactional
	public void guardar(Persona pers) {
		pdao.save(pers);
	}

	@Override
	@Transactional
	public void eliminar(Persona pers) {
		pdao.delete(pers);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona encontrarPersona(Persona pers) {
		return pdao.findById(pers.getId()).orElse(null);
	}
	
	
}
