package com.jeet.FlightReservation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager customAuthenticationManager() throws Exception {
		return authenticationManager();
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
	  http
		.headers()
        .frameOptions().sameOrigin()
        .and()
        .authorizeRequests()
        .antMatchers("/SignUpPage","/showReg","/registerUser","/login").permitAll()
/*        .antMatchers("/", "/flight/search","/flight/book/verify", "/flight/book/cancel").permitAll()*/
        .antMatchers( "/Findflights","/getAllFlightDetail","/completeReservation").hasRole("AGENT")
        .antMatchers("/**").hasRole("ADMIN");
       
        /*.anyRequest().authenticated()
        .and()
        .formLogin()
        .loginPage("/login")
        .defaultSuccessUrl("/")
        .failureUrl("/login?error")
        .permitAll()
        .and()
        .logout()
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("/login?logout")
        .permitAll()
        .and()
        .csrf().disable()
        .exceptionHandling(); */
	}
}
