package com.billing.billing.DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.json.JSONArray;
import org.json.JSONObject;
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
			result = "true";

		} catch (Exception e) {
			e.printStackTrace();
			result = "false";
		}

		return result;
	}

	@Override
	public Object get_order_product() {

		JSONArray js = new JSONArray();

		try {
			List<Object[]> query = session.getCurrentSession().createQuery(
					"select  cat.category_name,product.mrp,product.unit,product.discount,product.product_name,product.product_id,cat.category_id from Product_Pojo product,Category_Pojo cat where cat.category_id=product.product_id and cat.isActive=1 and product.isActive=1")
					.list();
			if (query.size() > 0) {
				Iterator itr = query.iterator();
				while (itr.hasNext()) {
					JSONObject cat = new JSONObject();
					Object[] obj = (Object[]) itr.next();

					cat.put("category_name", String.valueOf(obj[0]));
					cat.put("mrp", String.valueOf(obj[1]));
					cat.put("unit", String.valueOf(obj[2]));
					cat.put("discount", String.valueOf(obj[3]));
					cat.put("product_name", String.valueOf(obj[4]));
					cat.put("category_id", String.valueOf(obj[5]));
					cat.put("product_id", String.valueOf(obj[6]));
					js.put(cat);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			js = new JSONArray();
		}
		return js;
	}

	@Override
	public String delete_order_product(Category_Pojo category_pojo, Product_Pojo product_pojo) {
		String flag = "false";
		try {
			Query q = session.getCurrentSession().createQuery(
					"Update Category_Pojo set isActive=0 where id='" + category_pojo.getCategory_id() + "' ");
			Query q1 = session.getCurrentSession()
					.createQuery("Update Product_Pojo set isActive=0 where id='" + product_pojo.getCategory_id() + "' ");
			int res = q.executeUpdate();
			int res1 = q1.executeUpdate();
			if (res > 0 && res1 > 0) {
				flag = "true";
			}
		} catch (Exception e) {
			flag = "false";
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public String update_order_product(Category_Pojo category_pojo, Product_Pojo product_pojo) {
		String flag = "false";
		try {
			Query q = session.getCurrentSession()
					.createQuery("update Category_Pojo set category_name = '" + category_pojo.getCategory_name()+"' where category_id = '" + category_pojo.getCategory_id()  + "'");
			Query q1 = session.getCurrentSession()
					.createQuery("update Product_Pojo set product_name = '" + product_pojo.getProduct_name()+"',mrp= '"+product_pojo.getMrp()+"',unit= '"+product_pojo.getUnit()+"',discount= '"+product_pojo.getDiscount()+"' where product_id = '" + product_pojo.getProduct_id()  + "'");
			
			int res = q.executeUpdate();
			int res1 = q1.executeUpdate();
			if (res > 0 && res1 >0) {
				flag = "true";
			}
		} catch (Exception e) {
			flag = "false";
			e.printStackTrace();
		}
		return flag;
		
	}

}
