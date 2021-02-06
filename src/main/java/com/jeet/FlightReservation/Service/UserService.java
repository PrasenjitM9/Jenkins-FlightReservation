package com.jeet.FlightReservation.Service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.jeet.FlightReservation.Model.User;

public interface UserService extends UserDetailsService {
	
	void save(User user);
	
	User findByEmail(String email);

}
