package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;




@Entity
@Table(name = "ParkingHistory")
public class ParkingHistoryEntity extends BaseEntity{
	
	@Column
	private Date arrivalTime;
	
	@Column
	private Date departureTime;

	public ParkingHistoryEntity() {
		super();
	}

	public ParkingHistoryEntity(Date arrivalTime, Date departureTime, String licensePlateIn, String licensePlateOut,
			String status, TicketEntity ticketEntity) {
		super();
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.licensePlateIn = licensePlateIn;
		this.licensePlateOut = licensePlateOut;
		this.status = status;
		this.ticketEntity = ticketEntity;
	}

	@Column
	private String licensePlateIn;
	
	@Column
	private String licensePlateOut;
	
	@Column
	private String status;

	@ManyToOne
	@JoinColumn(name = "ticketID")
	private TicketEntity ticketEntity;
	
	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getLicensePlateIn() {
		return licensePlateIn;
	}

	public void setLicensePlateIn(String licensePlateIn) {
		this.licensePlateIn = licensePlateIn;
	}

	public String getLicensePlateOut() {
		return licensePlateOut;
	}

	public void setLicensePlateOut(String licensePlateOut) {
		this.licensePlateOut = licensePlateOut;
	}

	public TicketEntity getTicketEntity() {
		return ticketEntity;
	}

	public void setTicketEntity(TicketEntity ticketEntity) {
		this.ticketEntity = ticketEntity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
