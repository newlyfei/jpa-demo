package com.example.jpa.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = { "/META-INF/application-database.xml"})
public class JpaDemoThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoThreeApplication.class, args);
		System.out.println("--------------application service start------------------");
	}
}
