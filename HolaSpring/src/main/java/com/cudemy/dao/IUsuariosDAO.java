package com.cudemy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cudemy.domain.Usuarios;

public interface IUsuariosDAO extends JpaRepository<Usuarios, Long>{

	Usuarios findByUsername(String username);
}
