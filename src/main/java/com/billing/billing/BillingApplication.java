package com.billing.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;



@SpringBootApplication
public class BillingApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BillingApplication.class, args);
	}
	 //Its to run in your global sever when you host or push the code
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BillingApplication.class);
    }
	
	//Its for hibernet Session to run query and to fetch the data from the current session 
	@SuppressWarnings("deprecation")
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
		return new HibernateJpaSessionFactoryBean();
	}
}
