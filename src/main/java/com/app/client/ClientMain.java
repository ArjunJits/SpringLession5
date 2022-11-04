package com.app.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Product;
import com.app.config.ProjectConfig;



public class ClientMain {

	public static void main(String[] args) {
		try(var context= new AnnotationConfigApplicationContext(ProjectConfig.class))
		{
			Product product = context.getBean(Product.class);
			String displayMessage = product.displayMessage("Sudhakar");
			System.out.println(displayMessage);
                
		}
	}
}
