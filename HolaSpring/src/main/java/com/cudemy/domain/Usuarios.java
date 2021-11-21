package com.cudemy.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

	
	private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuarios")
	@SequenceGenerator(sequenceName = "seq_users", initialValue = 1, allocationSize = 1, name = "seq_usuarios")
	Long id_usuario;
	
	String username;
	String password;
	
	@OneToMany
	@JoinColumn(name="id_usuario")
	private List<Roles> rolesDB;
}
