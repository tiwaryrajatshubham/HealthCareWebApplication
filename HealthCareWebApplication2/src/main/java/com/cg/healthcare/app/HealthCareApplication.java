package com.cg.healthcare.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * HealthCareApplication is responsible for starting the application on server
 * 
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @date 11/11/2020
 *
 */
@SpringBootApplication
@EnableJpaRepositories("com.cg.healthcare.repository")
@EntityScan("com.cg.healthcare.entities")
@ComponentScan(basePackages = { "com.cg" })
public class HealthCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareApplication.class, args);
		System.out.println("8003 started");
	}

}
