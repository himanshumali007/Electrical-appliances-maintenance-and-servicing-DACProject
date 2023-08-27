
package com.app.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.app.entity.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
	
	private Long id;
	
	@NotBlank(message = "first name cannot be blank!!")
	private String firstName;

	@NotBlank(message = "last name cannot be blank!!")
	private String lastName;
	
	@NotBlank(message = "email is mandatory!!")
	@Email
	private String email;
	
	@NotBlank(message = "password is mandatory!!")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{4,12}$",
            message = "password must be min 4 and max 12 length containing atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ")
	private String password;
	
	@NotBlank
	private String address;
	
<<<<<<< HEAD
	@NotBlank
	private String city;
=======
	private String address;
>>>>>>> be0318a17ed474e4dc2afb065a80b597bae881f7
	
	private String city;
	@NotBlank(message = "phone number cannot be blank!!")
	private String phoneNumber;

	
	
	
<<<<<<< HEAD
	public PersonDto(@NotBlank(message = "first name cannot be blank!!") String firstName,
			@NotBlank(message = "last name cannot be blank!!") String lastName,
			@NotBlank(message = "email is mandatory!!") @Email String email,
			@NotBlank(message = "password is mandatory!!") @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{4,12}$", message = "password must be min 4 and max 12 length containing atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ") String password,
			@NotBlank(message = "address cannot be blank!!") String address,
			@NotBlank(message = "phone number cannot be blank!!") String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
=======
	
	
>>>>>>> be0318a17ed474e4dc2afb065a80b597bae881f7
	
	
	
}
