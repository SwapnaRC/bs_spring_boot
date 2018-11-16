package com.billing.billing.DAO;

import com.billing.billing.model.Category_Pojo;
import com.billing.billing.model.Customer_Pojo;
import com.billing.billing.model.Product_Pojo;

public interface OrderProductDAO {

	String add_order_product(Customer_Pojo customer_pojo, Product_Pojo product_pojo, Category_Pojo category_pojo);

}
