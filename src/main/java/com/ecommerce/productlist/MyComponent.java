package com.ecommerce.productlist;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	public MyComponent() {
		System.out.println("Result from my component");
		
	}
	public void getMessage() {
		System.out.println("Result from my get Message");
	}
}
