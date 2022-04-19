package com.project.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.project.springboot"})
public class DemoApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
