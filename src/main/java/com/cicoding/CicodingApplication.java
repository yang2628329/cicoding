package com.cicoding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.cicoding.dao")
@SpringBootApplication
public class CicodingApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CicodingApplication.class, args);
		System.out.println("***************************************");
		System.out.println("*      cicoding start-up success      *");
		System.out.println("***************************************"); 
		System.out.println("*******    Cicoding-Thymeleaf    ******"); 
		
	}
}
