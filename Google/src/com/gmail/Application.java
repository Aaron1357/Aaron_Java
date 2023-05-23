package com.gmail;

import com.gmail.model.*;

public class Application {

	public static void main(String[] args) {

		User user1 = new User();
		Mail mail1 = new Mail();

		user1.signUp();
		user1.login();
		user1.viewMail();
		user1.changePw();
		user1.exit();

	}
}
