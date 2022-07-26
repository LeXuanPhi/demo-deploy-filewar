package com.example.demo;

import com.example.controller.ControllerDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.controller")
public class DemoDeployFileWarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDeployFileWarApplication.class, args);
	}

}
