package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;




@Entity
@Table(name = "EmployeeShift")
public class EmployeeShiftEntity extends BaseEntity{
	public EmployeeShiftEntity() {
		super();
	}

	public EmployeeShiftEntity(LocalDateTime start_Time, LocalDateTime end_Time, String status,
			EmployeeEntity employeeEntity) {
		super();
		this.start_Time = start_Time;
		this.end_Time = end_Time;
		this.status = status;
		this.employeeEntity = employeeEntity;
	}

	@Column
	private LocalDateTime start_Time;

	@Column
	private LocalDateTime end_Time;

	@Column
	private String status;

	@ManyToOne
	@JoinColumn(name = "employeeId")
	private EmployeeEntity employeeEntity;
	
	public LocalDateTime getStart_Time() {
		return start_Time;
	}

	public void setStart_Time(LocalDateTime start_Time) {
		this.start_Time = start_Time;
	}

	public LocalDateTime getEnd_Time() {
		return end_Time;
	}

	public void setEnd_Time(LocalDateTime end_Time) {
		this.end_Time = end_Time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}

	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}

}
