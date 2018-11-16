package com.billing.billing.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.billing.billing.model.Category_Pojo;
import com.billing.billing.model.Customer_Pojo;
import com.billing.billing.model.Product_Pojo;

@Transactional
@Repository
public class OrderProductDAOImpl implements OrderProductDAO {

	
	@Autowired
	SessionFactory session;
	@Override
	public String add_order_product(Customer_Pojo customer_pojo, Product_Pojo product_pojo,
			Category_Pojo category_pojo) {
		String result;
		try {
			session.getCurrentSession().save(customer_pojo);
			session.getCurrentSession().save(product_pojo);
			session.getCurrentSession().save(category_pojo);
			result="true";
			
		}
		catch(Exception e) {
			e.printStackTrace();
			result="false";
		}
		
		
		return result;
	}

	
}
