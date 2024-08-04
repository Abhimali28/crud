package com.qsp.springbootdemo05;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication     
@ComponentScan(basePackages="com.qsp.springbootdemo05.Controller")
@EntityScan(basePackages="com.qsp.springbootdemo05.dto")
@EnableJpaRepositories(basePackages="com.qsp.springbootdemo05.repository")
public class Springbootdemo05Application {
	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo05Application.class, args);
	}
}

    
              








