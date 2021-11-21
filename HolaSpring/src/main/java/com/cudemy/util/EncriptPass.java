package com.cudemy.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.var;

public class EncriptPass {
	public static void main(String[] args) {

	
	String password = "123";
	
	
	System.out.println("no encriptado es : "+ password);
	System.out.println("encriptado queda "+ encriptarPassword(password));
	
	}
	
	public static String encriptarPassword(String pass) {
		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
		return encoder.encode(pass);
	}
}
