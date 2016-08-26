package com.bol.core;

import java.util.Arrays;

public class SignUp {

	private String firstName;
	private String lastName;
	private String uuid;
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
