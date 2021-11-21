package com.cudemy.domain;

import java.io.Serializable;

import javax.persistence.*;


import lombok.Data;

@Entity
@Data
@Table(name="ROLES")
public class Roles implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_roles")
	@SequenceGenerator(sequenceName = "seq_role", initialValue = 1, allocationSize = 1, name="seq_roles")
	private Long id_rol;
	private String nombre;
	
	
	
}
