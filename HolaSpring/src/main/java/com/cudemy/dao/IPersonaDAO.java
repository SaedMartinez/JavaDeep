package com.cudemy.dao;

import org.springframework.data.repository.CrudRepository;

import com.cudemy.domain.Persona;

public interface IPersonaDAO extends CrudRepository<Persona, Long>{

	
}
