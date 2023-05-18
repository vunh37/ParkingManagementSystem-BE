package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name ="TicketPayment")
public class TicketPaymentEntity extends BaseEntity{

	
	public TicketPaymentEntity() {
		super();// TODO Auto-generated constructor stub
	}
	
	public TicketPaymentEntity(double totalAmount, String type, String status, Date paymentDate,
			TicketEntity ticketEntity) {
		super();
		this.totalAmount = totalAmount;
		this.type = type;
		this.status = status;
		this.paymentDate = paymentDate;
		this.ticketEntity = ticketEntity;
	}

	@Column
	private double totalAmount;

	@Column
	private String type;
	
	@Column
	private String status;
	
	@Column
	private Date paymentDate;
	
	@ManyToOne
	@JoinColumn(name = "ticketId")
	private TicketEntity ticketEntity;


	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public TicketEntity getTicketEntity() {
		return ticketEntity;
	}

	public void setTicketEntity(TicketEntity ticketEntity) {
		this.ticketEntity = ticketEntity;
	}
}
