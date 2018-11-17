package com.billing.billing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_product")
public class Product_Pojo {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int product_id;
//private String catgory_name;
private int category_id;
private String product_name;
private int mrp;
private int discount;
private int unit;
private String isActive;
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public int getCategory_id() {
	return category_id;
}
public void setCategory_id(int category_id) {
	this.category_id = category_id;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public int getMrp() {
	return mrp;
}
public void setMrp(int mrp) {
	this.mrp = mrp;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int getUnit() {
	return unit;
}
public void setUnit(int unit) {
	this.unit = unit;
}
public String getIsActive() {
	return isActive;
}
public void setIsActive(String isActive) {
	this.isActive = isActive;
}
public Product_Pojo(int product_id, int category_id, String product_name, int mrp, int discount, int unit,
		String isActive) {
	super();
	this.product_id = product_id;
	this.category_id = category_id;
	this.product_name = product_name;
	this.mrp = mrp;
	this.discount = discount;
	this.unit = unit;
	this.isActive = isActive;
}
public Product_Pojo() {
	super();

}



}
