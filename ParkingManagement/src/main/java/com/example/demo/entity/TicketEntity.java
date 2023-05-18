package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;





@Entity
@Table(name = "Entity")
public class TicketEntity extends BaseEntity{

	
	public TicketEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TicketEntity(Date startDate, Date endDate, String carNumber, String pakingSpaceNumber, String status,
			List<ParkingHistoryEntity> parkingHistoryEntities, CustomerEntity customerEntity,
			ParkingSpaceEntity parkingSpaceEntity, TicketTypeEntity ticketTypeEntity, EmployeeEntity employeeEntity,
			List<TicketPaymentEntity> ticketPaymentEntities) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.carNumber = carNumber;
		this.pakingSpaceNumber = pakingSpaceNumber;
		this.status = status;
		this.parkingHistoryEntities = parkingHistoryEntities;
		this.customerEntity = customerEntity;
		this.parkingSpaceEntity = parkingSpaceEntity;
		this.ticketTypeEntity = ticketTypeEntity;
		this.employeeEntity = employeeEntity;
		this.ticketPaymentEntities = ticketPaymentEntities;
	}

	@Column
	private Date startDate;

	@Column
	private Date endDate;

	@Column
	private String carNumber;

	@Column
	private String pakingSpaceNumber;

	@Column
	private String status;

	@OneToMany(mappedBy = "ticketEntity")
	private List<ParkingHistoryEntity> parkingHistoryEntities = new ArrayList<>();

	@ManyToOne
    @JoinColumn(name = "customerID")
    private CustomerEntity customerEntity;

	@ManyToOne
    @JoinColumn(name = "parkingSpaceID")
    private ParkingSpaceEntity parkingSpaceEntity;
	
	@ManyToOne
    @JoinColumn(name = "ticketTypeID")
    private TicketTypeEntity ticketTypeEntity;
	
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private EmployeeEntity employeeEntity;

	@OneToMany(mappedBy = "ticketEntity")
	private List<TicketPaymentEntity> ticketPaymentEntities = new ArrayList<>();

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getPakingSpaceNumber() {
		return pakingSpaceNumber;
	}

	public void setPakingSpaceNumber(String pakingSpaceNumber) {
		this.pakingSpaceNumber = pakingSpaceNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ParkingHistoryEntity> getParkingHistoryEntities() {
		return parkingHistoryEntities;
	}

	public void setParkingHistoryEntities(List<ParkingHistoryEntity> parkingHistoryEntities) {
		this.parkingHistoryEntities = parkingHistoryEntities;
	}

	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}

	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}

	public List<TicketPaymentEntity> getTicketPaymentEntities() {
		return ticketPaymentEntities;
	}

	public void setTicketPaymentEntities(List<TicketPaymentEntity> ticketPaymentEntities) {
		this.ticketPaymentEntities = ticketPaymentEntities;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}



	public ParkingSpaceEntity getParkingSpaceEntity() {
		return parkingSpaceEntity;
	}

	public void setParkingSpaceEntity(ParkingSpaceEntity parkingSpaceEntity) {
		this.parkingSpaceEntity = parkingSpaceEntity;
	}

	public TicketTypeEntity getTicketTypeEntity() {
		return ticketTypeEntity;
	}

	public void setTicketTypeEntity(TicketTypeEntity ticketTypeEntity) {
		this.ticketTypeEntity = ticketTypeEntity;
	}
}
