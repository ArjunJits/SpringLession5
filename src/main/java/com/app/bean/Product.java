package com.app.bean;

import org.springframework.stereotype.Component;

@Component
public class Product {

	public String displayMessage(String s) {
		
		return "Hello Good morning " +s;
	//	throw new RuntimeException("Blast here");
	}
}
