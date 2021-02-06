package com.jeet.FlightReservation.Controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeet.FlightReservation.Model.User;
import com.jeet.FlightReservation.Repository.UserRepository;
import com.jeet.FlightReservation.ServiceImpl.SecurityService;
import com.jeet.FlightReservation.exception.UserAlreadyRegisteredException;
import com.jeet.FlightReservation.exception.UserNotFoundException;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private SecurityService securityService;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/")
	public String signUpPage()
	{
		return "SignUp";
	}

/*	@RequestMapping(value = "/SignUpPage" , method = RequestMethod.POST)
	public String signUp(@ModelAttribute("User") User user)
	{
		userRepository.save(user);		
		return "/login/Login";
	}*/
	
	@RequestMapping(value = "/SignUpPage", method = RequestMethod.POST)
    public String signUp(@ModelAttribute("user") User user) {
        //handle error here what is email already exists.
        LOGGER.info("{} Inside register()", user.getEmail());
        Optional<User> foundUser= userRepository.findByEmail(user.getEmail());
        if(foundUser.isPresent()){
            LOGGER.error("User is already registered with email {} ",user.getEmail());
            throw new UserAlreadyRegisteredException("Email exists: "+user.getEmail());
        }
        LOGGER.info("Email Exists: "+user.getEmail());
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "login/Login";
    }
	

	@RequestMapping("/login")
	public String getLoginPage()
	{
		return "/login/Login";
	}

	/*	@RequestMapping(value = "/LoginPage" , method = RequestMethod.POST)
	public String loginPage(@RequestParam("email") String email , @RequestParam("password") String password , ModelMap model)
	{		
		User u = userRepository.findByEmail(email);
		if(u.getEmail().equals(email) && u.getPassword().equals(password))
			return "Flight";			
		else
			model.addAttribute("wrong", "Invalid Credentials!!");

		return "/login/Login";
	}	*/

	@RequestMapping(value="/LoginPage",method = RequestMethod.POST)
	public String loginPage(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelmap){
		LOGGER.info("{} Inside login()",email);
		Optional<User> foundUser=userRepository.findByEmail(email);
		// handle error here what if no user found
		if(!foundUser.isPresent()){
			LOGGER.error("Email not found: "+email);
			throw new UserNotFoundException("Email not found: "+email);
		}
		LOGGER.info("Email Exists: "+email);
		boolean loginResponse = securityService.login(email, password);
		if(loginResponse) {
			modelmap.addAttribute("msg","Successfully logged in");
			return "Flight";
		} else {
			LOGGER.info("User entered Invalid credentials email:{} and password:{}",email,password);
			modelmap.addAttribute("msg","Invalid username or password");
		}
		return "login/Login";
	}

}
