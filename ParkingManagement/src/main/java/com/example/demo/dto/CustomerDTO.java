package com.example.demo.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.demo.entity.CustomerEntity;

public class CustomerDTO {
	private long id;
	private String address;
	private String fullName;
	private String phoneNumber;
	private String gender;
	private String dateOfBirth;
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public CustomerDTO(long id, String address, String fullName, String phoneNumber, String gender,
			String dateOfBirth) {
		super();
		this.id = id;
		this.address = address;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	public CustomerDTO() {
		super();
	}
	
	public CustomerEntity convertToEntity() {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setId(this.getId());
		customerEntity.setAddress(this.getAddress());
		customerEntity.setName(this.getFullName());
		customerEntity.setPhoneNumber(this.getPhoneNumber());
		customerEntity.setGender(this.getGender().equals("Nam"));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = formatter.parse(this.getDateOfBirth());
			customerEntity.setBirthDate(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerEntity;
	}
	
}
