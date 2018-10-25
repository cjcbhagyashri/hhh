package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages="com")

public class Test {

	public static void main(String[] args) {
	System.out.println("hello...");      
		SpringApplication.run(Test.class,args);
	}  
}
