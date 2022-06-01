package com.MusicApp.Validation;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Menu.AdminMenu;

public class AdminValidator {
	private static final AdminMenu adminMenu = new AdminMenu();
	
	public void adminValidator(String username, String password) throws InvalidFormatException, IOException, ProductNotFoundException, ClassNotFoundException, SQLException {
		if(username.equals(username) && password.equals(password)) {
			adminMenu.adminMenu();
		}
		else {
			System.out.println("Please try again");
		}
		
	}

}
