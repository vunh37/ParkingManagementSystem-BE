package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;



@Entity
@Table(name= "Employee")
public class EmployeeEntity extends BaseEntity{

	@Column(columnDefinition = "nvarchar(50)")
	private String name;

	@Column(columnDefinition = "nvarchar(150)")
	private String address;
	
	@Column(columnDefinition = "bit default 0")
	private boolean gender;
	
	@Column
	private Date birthDate;
	
	@Column
	private String phoneNumber;

	@Column
	private int identificationNumber;

	@Column
	private String userName;

	@Column
	private String password;
	

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Column
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "EmployeeRoles",
        		joinColumns = @JoinColumn(name = "employeeId"),
        		inverseJoinColumns = @JoinColumn(name = "roleId")
    )
    private List<RoleEntity> roles = new ArrayList<>();
	
	public EmployeeEntity(String name, String address, boolean gender, String phoneNumber, int identificationNumber,
			String userName, String password, String email, List<RoleEntity> roles,
			List<EmployeeShiftEntity> employeeShifts, List<TicketEntity> ticketEntities) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.identificationNumber = identificationNumber;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.roles = roles;
		this.employeeShifts = employeeShifts;
		this.ticketEntities = ticketEntities;
	}

	public EmployeeEntity() {
		super();
	}

	@OneToMany(mappedBy = "employeeEntity")
	private List<EmployeeShiftEntity> employeeShifts = new ArrayList<>();
	
	@OneToMany(mappedBy = "employeeEntity")
	private List<TicketEntity> ticketEntities = new ArrayList<>();


	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public List<EmployeeShiftEntity> getEmployeeShifts() {
		return employeeShifts;
	}

	public void setEmployeeShifts(List<EmployeeShiftEntity> employeeShifts) {
		this.employeeShifts = employeeShifts;
	}

	public List<TicketEntity> getTicketEntities() {
		return ticketEntities;
	}

	public void setTicketEntities(List<TicketEntity> ticketEntities) {
		this.ticketEntities = ticketEntities;
	}
}
