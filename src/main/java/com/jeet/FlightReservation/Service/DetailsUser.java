package com.jeet.FlightReservation.Service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class DetailsUser extends User {

	private static final long serialVersionUID = -6042295282115342978L;

	public DetailsUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		
		super(username, password, authorities);
	}
}