package com.billing.billing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_category")
public class Category_Pojo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int category_id;
	private String category_name;
	private String isActive;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Category_Pojo(int category_id, String category_name, String isActive) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.isActive = isActive;
	}
	public Category_Pojo() {
		super();
	}
	
	
	
}
