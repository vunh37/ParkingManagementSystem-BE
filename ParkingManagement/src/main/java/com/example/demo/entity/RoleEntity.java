package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity(name="Role")
public class RoleEntity extends BaseEntity{

	@Column(columnDefinition = "nvarchar(50)")
	private String name;

	public String getName() {
		return name;
	}

	public RoleEntity(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public RoleEntity() {
		super();
	}
}
