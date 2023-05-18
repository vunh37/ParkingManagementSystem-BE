package com.example.demo.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.demo.entity.EmployeeEntity;

public class EmployeeDTO {
	
	private long id;
	private String address;
	private String email;
	private String fullName;
	private String userName;
	private long roleID;
	private String gender;
	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private String dateOfBirth;
	private String password;
	private String phoneNumber;
	public EmployeeDTO() {
		super();
	}

	
	public EmployeeEntity convertToEntity () {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setId(this.getId());
		employeeEntity.setName(this.getFullName());
		employeeEntity.setAddress(this.getAddress());
		employeeEntity.setEmail(this.getEmail());
		employeeEntity.setUserName(this.getUserName());
		
		employeeEntity.setGender(this.getGender().equals("Nam"));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = formatter.parse(this.getDateOfBirth());
			employeeEntity.setBirthDate(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employeeEntity.setPassword(this.getPassword());
		employeeEntity.setPhoneNumber(this.getPhoneNumber());
		return employeeEntity;
	}

	

	public EmployeeDTO(long id, String address, String email, String fullName, String userName, int roleID,
			String gender, String dateOfBirth, String password) {
		super();
		this.id = id;
		this.address = address;
		this.email = email;
		this.fullName = fullName;
		this.userName = userName;
		this.roleID = roleID;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getFullName() {
		return fullName;
	}





	public void setFullName(String fullName) {
		this.fullName = fullName;
	}





	public String getUserName() {
		return userName;
	}





	public void setUserName(String userName) {
		this.userName = userName;
	}





	public long getRoleID() {
		return roleID;
	}





	public void setRoleID(long roleID) {
		this.roleID = roleID;
	}





	public String getDateOfBirth() {
		return dateOfBirth;
	}





	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
