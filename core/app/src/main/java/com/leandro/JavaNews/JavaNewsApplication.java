package com.leandro.JavaNews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaNewsApplication {

	public static void main(String[] args) {
		System.out.println("App is on");
		SpringApplication.run(JavaNewsApplication.class, args);
	}

}
