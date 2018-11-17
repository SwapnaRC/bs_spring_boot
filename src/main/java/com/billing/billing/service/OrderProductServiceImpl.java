package com.billing.billing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.billing.DAO.OrderProductDAO;
import com.billing.billing.model.Category_Pojo;
import com.billing.billing.model.Customer_Pojo;
import com.billing.billing.model.Product_Pojo;

@Service
public class OrderProductServiceImpl implements OrderProductService {

	@Autowired
	OrderProductDAO orderproductdao;
	@Override
	public String add_order_product(Customer_Pojo customer_pojo, Product_Pojo product_pojo,
			Category_Pojo category_pojo) {
		// TODO Auto-generated method stub
		customer_pojo.setIsActive("1");
		product_pojo.setIsActive("1");
		category_pojo.setIsActive("1");
		return this.orderproductdao.add_order_product(customer_pojo,product_pojo,category_pojo);
	}
	@Override
	public Object get_order_product() {
		// TODO Auto-generated method stub
		return this.orderproductdao.get_order_product();
	}
	@Override
	public String delete_order_product(Category_Pojo category_pojo ,Product_Pojo product_pojo) {
		// TODO Auto-generated method stub
		return this.orderproductdao.delete_order_product( category_pojo, product_pojo);
	}
	@Override
	public String update_order_product(Category_Pojo category_pojo, Product_Pojo product_pojo) {
		// TODO Auto-generated method stub
		return this.orderproductdao.update_order_product(category_pojo,product_pojo);
	}

}
