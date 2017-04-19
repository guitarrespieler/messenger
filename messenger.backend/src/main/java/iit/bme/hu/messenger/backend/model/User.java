package iit.bme.hu.messenger.backend.model;

import java.util.Date;
import java.util.List;

import iit.bme.hu.messenger.backend.model.enums.Role;

/**
 * Represents a user. DTO class.
 * @author zsigatibor
 *
 */
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String password;	
	private String placeOfBirth;
	private Date birthDate;
	private List<User> friends;
	private List<Conversation> conversations;
	private Role role;
	
}
