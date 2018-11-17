package com.billing.billing.service;

import com.billing.billing.model.Category_Pojo;
import com.billing.billing.model.Customer_Pojo;
import com.billing.billing.model.Product_Pojo;

public interface OrderProductService   {

	String add_order_product(Customer_Pojo customer_pojo, Product_Pojo product_pojo, Category_Pojo category_pojo);

	Object get_order_product();

	String delete_order_product(Category_Pojo category_pojo ,Product_Pojo product_pojo);

	String update_order_product(Category_Pojo category_pojo, Product_Pojo product_pojo);

	
	
}
