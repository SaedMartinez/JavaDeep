package com.cudemy.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cudemy.dao.IUsuariosDAO;
import com.cudemy.domain.Roles;
import com.cudemy.domain.Usuarios;

import lombok.var;
import lombok.extern.slf4j.Slf4j;

@Service("userDetailsService")
@Slf4j
public class UsuariosService implements UserDetailsService{
	
	
	@Autowired
	IUsuariosDAO udao;
	
		
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuarios user=udao.findByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		
		var Lroles = new ArrayList<GrantedAuthority>();
		
		for(Roles rol: user.getRolesDB()) {
			Lroles.add(new SimpleGrantedAuthority(rol.getNombre()));
		}
		return new User(user.getUsername(), user.getPassword(), Lroles);
	}

	
}
