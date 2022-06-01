package com.MusicApp.Utls;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.Controller.UserController;
import com.MusicApp.Entities.Customer;
import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Validation.LoginValiation;

public class LoginUtls {

	private static final Scanner sc = new Scanner(System.in);
	Customer cus = new Customer();

	public void loginUserUtls()
			throws  IOException, ProductNotFoundException, ClassNotFoundException, SQLException, EncryptedDocumentException, InvalidFormatException {

		System.out.println("Enter the username");
		String username = sc.next();
		
	

		System.out.println("Enter the password");
		String password = sc.next();
		
		
		/*
		 * UserController userController = new UserController();
		 * userController.loginController(cus);
		 */

		
		  LoginValiation logValid = new LoginValiation(); 
		  logValid.loginValid(username,  password);
		 

	}

}
