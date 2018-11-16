package com.billing.billing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_customer")
public class Customer_Pojo {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int customer_id;
	private String customer_name;
	private String customer_address;
	private String date_joined;
	private String isActive;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getDate_joined() {
		return date_joined;
	}
	public void setDate_joined(String date_joined) {
		this.date_joined = date_joined;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Customer_Pojo(int customer_id, String customer_name, String customer_address, String date_joined,
			String isActive) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		this.date_joined = date_joined;
		this.isActive = isActive;
	}
	public Customer_Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
