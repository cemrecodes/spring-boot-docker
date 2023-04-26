package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info (
				title = "User API",
				version = "1.0.0",
				description = "Open Source Softwares homework",
				contact = @Contact (
					name = "Cemre Şenyuva",
					email = "cemressenyuva@gmail.com"
					),
				license = @License(
						name = "MIT License", 
						url = "https://opensource.org/licenses/MIT"
						)
				
				))
public class SpringBootDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
