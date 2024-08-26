package com.leandro.mail;

import com.leandro.JavaNews.Email;

public class Application {

	public static void main(String[] args) {
		System.out.println("Mail sender is on");
		var email = new Email();
		email.send();
	}

}
