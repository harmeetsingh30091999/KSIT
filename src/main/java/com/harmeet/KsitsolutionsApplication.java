package com.harmeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class KsitsolutionsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(KsitsolutionsApplication.class, args);
		System.out.println("my second webproject");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(KsitsolutionsApplication.class);
	}

}
