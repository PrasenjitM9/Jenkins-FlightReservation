package com.jeet.FlightReservation.ServiceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jeet.FlightReservation.Model.User;
import com.jeet.FlightReservation.Repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
    	Optional<User> userOptional = userRepository.findByEmail(email);
    	
    	if(!userOptional.isPresent()) {
    		throw new UsernameNotFoundException("User not found for email "+email);
    	}
    	
    	User user= userOptional.get();
    	return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), user.getRoles());
    }
/*    Meeting meeting = meetingRepository.findByMeetingId(meetingId).orElseThrow(new MeetingDoesNotExistException(meetingId));*/

/*    Meeting meeting = 
    	    meetingRepository.findByMeetingId(meetingId)
    	                     .orElseThrow(() -> new MeetingDoesNotExistException(meetingId));*/
    
   /* @SuppressWarnings("unused")
	private static Collection<? extends GrantedAuthority> getAuthorities(User user) {
        String[] userRoles = user.getRoles().stream().map((role) -> role.getName()).toArray(String[]::new);
        Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(userRoles);
        return authorities;
    }*/


}