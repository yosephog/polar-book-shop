package com.polar.bookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class PolarBookShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolarBookShopApplication.class, args);
	}

}
