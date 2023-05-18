package com.example.demo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;



@MappedSuperclass
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private Date createdDate;
	
	@Column(columnDefinition = "bit default 0")
	private boolean isDeleted = false;
	
	public boolean isDeleted() {
		return isDeleted;
	}


	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column
	private Date modifytedDate;
	
	@Column(columnDefinition = "nvarchar(50)")
	private String createBy;
	
	@Column
	private String modifytedBy;
	
	@Column
	private Date deleteDate;
	
	@Column(columnDefinition = "nvarchar(50)")
	private String deleteBy;
	
	@Column
	private String isDelete;
	
	@Column
	private String Note;

	public BaseEntity() {
		super();
	}
	
	
	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getId() {
		return id;
	}


	public Date getCreateDate() {
		return createdDate;
	}

	public void setCreateDate(Date createDate) {
		this.createdDate = createDate;
	}

	public Date getModifytedDate() {
		return modifytedDate;
	}

	public void setModifytedDate(Date modifytedDate) {
		this.modifytedDate = modifytedDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifytedBy() {
		return modifytedBy;
	}

	public void setModifytedBy(String modifytedBy) {
		this.modifytedBy = modifytedBy;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteBy() {
		return deleteBy;
	}

	public void setDeleteBy(String deleteBy) {
		this.deleteBy = deleteBy;
	}



	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

}
