package com.billing.billing.controller;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.billing.billing.model.Category_Pojo;
import com.billing.billing.model.Customer_Pojo;
import com.billing.billing.model.Product_Pojo;
import com.billing.billing.service.OrderProductService;


@RestController
public class MainController {
	
	@Autowired
	OrderProductService order_product_service;

	
	
@RequestMapping(value="/")
public  void demoFunction() {
	System.out.println("Hello");
}

@RequestMapping(value="/add_order_product",method=RequestMethod.POST)
public @ResponseBody String add_order_product(Customer_Pojo customer_pojo,Product_Pojo  product_pojo,Category_Pojo category_pojo )
{
	System.out.println("Hello");
	Date date=new Date();
	SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
	String dtjoin=dt.format(date);
	customer_pojo.setDate_joined(dtjoin);
	String str=this.order_product_service.add_order_product(customer_pojo,product_pojo,category_pojo);
	return str;
}


@RequestMapping(value="/get_order_product",method=RequestMethod.POST)
public @ResponseBody String get_order_product() {
	String str= this.order_product_service.get_order_product().toString();
	return str;
}

@RequestMapping(value="/delete_order_product",method=RequestMethod.POST)
public @ResponseBody String delete_order_product(Category_Pojo category_pojo,Product_Pojo  product_pojo) {
	String str= this.order_product_service.delete_order_product( category_pojo,product_pojo);
	return str;
}


@RequestMapping(value="/update_order_product",method=RequestMethod.POST)
public @ResponseBody String update_order_product(Category_Pojo category_pojo,Product_Pojo  product_pojo) {
	String str= this.order_product_service.update_order_product( category_pojo,product_pojo);
	return str;
}
}
