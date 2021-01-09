package com.zensar.Bean;

public class Admin_Customer {
	
	 private int user_id;
	 private String username;
	 private String password;
	 private int mobile_number;
	 private String address;
	 private String gender;
	 private String state;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Admin_Customer(int user_id, String username, String password, int mobile_number, String address,
			String gender, String state) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.mobile_number = mobile_number;
		this.address = address;
		this.gender = gender;
		this.state = state;
	}
	@Override
	public String toString() {
		return "admin_customer [user_id=" + user_id + ", username=" + username + ", password=" + password
				+ ", mobile_number=" + mobile_number + ", address=" + address + ", gender=" + gender + ", state="
				+ state + "]";
	}
	 
	 

}
