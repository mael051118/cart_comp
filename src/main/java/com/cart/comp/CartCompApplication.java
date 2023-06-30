package com.cart.comp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class CartCompApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartCompApplication.class, args);
	}

}
