package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "Customer")
public class CustomerEntity extends BaseEntity{
	@Column(columnDefinition = "nvarchar(50)")
	private String name;

	@Column(columnDefinition = "nvarchar(150)")
	private String address;

	@Column(columnDefinition = "bit default 0")
	private boolean gender;

	@Column
	private String phoneNumber;


	@Column
	private Date birthDate;
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public CustomerEntity(String name, String address, boolean gender, String phoneNumber,
			List<TicketEntity> ticketEntities) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.ticketEntities = ticketEntities;
	}

	@OneToMany(mappedBy = "customerEntity")
	private List<TicketEntity> ticketEntities = new ArrayList<>();

	
	public CustomerEntity() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public List<TicketEntity> getTicketEntities() {
		return ticketEntities;
	}

	public void setTicketEntities(List<TicketEntity> ticketEntities) {
		this.ticketEntities = ticketEntities;
	}
}
