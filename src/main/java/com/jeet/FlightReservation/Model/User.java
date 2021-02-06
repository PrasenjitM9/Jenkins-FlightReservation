package com.jeet.FlightReservation.Model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "*First Name is Required")
	private String firstName;
	@NotBlank(message = "*Last Name is Required")
	private String lastName;
	
	@Column(nullable=false, unique=true)
	@NotBlank(message = "*Email is Required")
	@Email(message = "{errors.invalid_email}")
	private String email;
	
	@Column(nullable=false)
	@NotBlank(message = "*Password is Required")
	@Size(min=8)
	private String password;
	
	@Column(nullable=false)
	@NotBlank(message = "*Confirm Password is Required")
	@Size(min=8)
	private String confirmPassword;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "users_roles",
				joinColumns= {@JoinColumn(name="USRE_ID", referencedColumnName="ID")},
				inverseJoinColumns= {@JoinColumn(name="ROLE_ID", referencedColumnName="ID")}
					)
	private Set<Role> roles;
	
	public User(int id, @NotBlank(message = "*First Name is Required") String firstName,
			@NotBlank(message = "*Last Name is Required") String lastName,
			@NotBlank(message = "*Email is Required") @Email(message = "{errors.invalid_email}") String email,
			@NotBlank(message = "*Password is Required") @Size(min = 8) String password,
			@NotBlank(message = "*Confirm Password is Required") @Size(min = 8) String confirmPassword,
			Set<Role> roles) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.roles = roles;
	}

	
	public User() {
	
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Collection<? extends GrantedAuthority> getRoles() {
		return (Collection<? extends GrantedAuthority>) roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}