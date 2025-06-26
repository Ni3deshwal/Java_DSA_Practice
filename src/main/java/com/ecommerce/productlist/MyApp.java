package com.ecommerce.productlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
	@Autowired
	private MyComponent myComponent;
//	public MyApp(MyComponent myComponent) {
//		this.myComponent=myComponent;
//	}
	public void run() {
		myComponent.getMessage();
	}

}
