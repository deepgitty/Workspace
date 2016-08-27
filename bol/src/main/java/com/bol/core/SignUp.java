package com.bol.core;

import java.util.Arrays;

import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

public class SignUp {

	@NotNull
	@Size(min = 2, max = 40)
	private String firstName;

	@NotNull
	@Size(min = 2, max = 40)
	private String lastName;

	@NotNull
	@Size(min = 6, max = 20)
	private String uuid;

	@NotNull
	@Size(min = 6, max = 20)
	private char[] password;

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

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SignUp [firstName=" + firstName + ", lastName=" + lastName
				+ ", uuid=" + uuid + ", password=" + Arrays.toString(password)
				+ "]";
	}
}
