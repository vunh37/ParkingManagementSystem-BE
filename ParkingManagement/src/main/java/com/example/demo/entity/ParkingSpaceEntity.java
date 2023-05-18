package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name ="ParkingSpace")
public class ParkingSpaceEntity extends BaseEntity{
	


	@Column
	private String parkingSpaceName;

	public ParkingSpaceEntity() {
		super();
	}

	public ParkingSpaceEntity(String parkingSpaceName, String status, List<TicketEntity> ticketEntities) {
		super();
		this.parkingSpaceName = parkingSpaceName;
		this.status = status;
		this.ticketEntities = ticketEntities;
	}

	@Column
	private String status;

	@OneToMany(mappedBy = "parkingSpaceEntity")
	private List<TicketEntity> ticketEntities = new ArrayList<>();

	public String getParkingSpaceName() {
		return parkingSpaceName;
	}

	public void setParkingSpaceName(String parkingSpaceName) {
		this.parkingSpaceName = parkingSpaceName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<TicketEntity> getTicketEntities() {
		return ticketEntities;
	}

	public void setTicketEntities(List<TicketEntity> ticketEntities) {
		this.ticketEntities = ticketEntities;
	}
}
