package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;




@Entity
@Table(name = "TicketType")
public class TicketTypeEntity extends BaseEntity{
	
	
	public TicketTypeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Column
	private String name;

	public TicketTypeEntity(String name, double price, String numberOfDay, List<TicketEntity> ticketEntities) {
		super();
		this.name = name;
		this.price = price;
		this.numberOfDay = numberOfDay;
		this.ticketEntities = ticketEntities;
	}

	@Column
	private double price;

	@Column
	private String numberOfDay;
	
	@OneToMany(mappedBy = "ticketTypeEntity")
	private List<TicketEntity> ticketEntities = new ArrayList<>();



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getNumberOfDay() {
		return numberOfDay;
	}

	public void setNumberOfDay(String numberOfDay) {
		this.numberOfDay = numberOfDay;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<TicketEntity> getTicketEntities() {
		return ticketEntities;
	}

	public void setTicketEntities(List<TicketEntity> ticketEntities) {
		this.ticketEntities = ticketEntities;
	}

}
