package com.business.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Instagram implements SocialMediaShowable {

	@Override
	public void Login() {
		System.out.println("Login to Instagram");
	}
}
