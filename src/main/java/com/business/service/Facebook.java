package com.business.service;

import org.springframework.stereotype.Component;

@Component
public class Facebook implements SocialMediaShowable {


	@Override
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Login to FaceBook");
	}
}
