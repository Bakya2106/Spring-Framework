package com.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SocialMedia {

	@Autowired
	private SocialMediaShowable socialinterface;
	
		//Constructor based dependancy injection
		public SocialMedia(SocialMediaShowable socialinterface) {
		super();
		this.socialinterface = socialinterface;
	    }

		public void Login() {
			// TODO Auto-generated method stub
		  socialinterface.Login();
		}
	}

