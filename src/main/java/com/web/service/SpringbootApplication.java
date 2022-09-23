package com.web.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.business.service.SocialMedia;

@SpringBootApplication
@ComponentScan({"com.business.service","com.web.service"})
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		SocialMedia sm= context.getBean(SocialMedia.class);
		sm.Login();
		
	}

}
