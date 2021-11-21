package com.cudemy.domain;

import java.io.Serializable;

import javax.persistence.*;
/*import javax.validation.constrains.NotEmpty;*/

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Persona implements Serializable {


	private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PER")
	@SequenceGenerator(sequenceName = "seq_id_users", initialValue = 1, allocationSize = 1, name = "SEQ_PER")
	Long id;
	
	/*@NotEmpty*/
	String nombre;
	
	String apellido;
	
	String telefono;

	
}
