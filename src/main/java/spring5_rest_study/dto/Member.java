package spring5_rest_study.dto;

import java.time.LocalDateTime;

import spring5_rest_study.exception.WrongIdPasswordException;

public class Member {
	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String email, String password, String name) {
		this.email = email;
		this.password = password;
		this.name = name;
	}
	
	public Member(String email, String password, String name, LocalDateTime registerDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = registerDateTime;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (!password.equals(oldPassword))
			throw new WrongIdPasswordException();
		this.password = newPassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}

	public void setRegisterDateTime(LocalDateTime registerDateTime) {
		this.registerDateTime = registerDateTime;
	}

	public boolean matchPassword(String password) {
        return this.password.equals(password);
    }

	@Override
	public String toString() {
		return String.format("Member [id=%s, email=%s, password=%s, name=%s, registerDateTime=%s]", id, email, password,
				name, registerDateTime);
	}

}
