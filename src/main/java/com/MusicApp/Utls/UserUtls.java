package com.MusicApp.Utls;

import java.util.Scanner;

public class UserUtls implements UserUtlsInterface {

	private static final Scanner sc = new Scanner(System.in);

	@Override
	public void userRegUtls() {

		System.out.println("Enter User ID");
		long uId = sc.nextLong();

		System.out.println("Enter First Name");
		String fname = sc.next();

		System.out.println("Enter Last Name");
		String lname = sc.next();

		System.out.println("Enter the Address");
		String address = sc.next();

		System.out.println("Enter the Phone Number");
		String phone = sc.next();

		System.out.println("Enter the Username");
		String username = sc.next();

		System.out.println("Enter the Password");
		String passwd = sc.next();

	}

	@Override
	public void userLoginUtls() {

		System.out.println("Enter the username");
		String username = sc.next();

		System.out.println("Enter the password");
		String password = sc.next();
		
		

	}

}
