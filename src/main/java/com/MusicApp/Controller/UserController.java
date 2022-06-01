package com.MusicApp.Controller;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.DAO.UserDAOLayer;
import com.MusicApp.Entities.Customer;
import com.MusicApp.ExceptionHandling.ProductNotFoundException;


public class UserController {
	//private UserDAOImpl userDao = new  UserDAOImpl();
	
	public void loginController(Customer cus) throws ClassNotFoundException, SQLException, InvalidFormatException, IOException, ProductNotFoundException {
		//userDao.loginUser(cus);
		//Main.listUser.registerUser(cus);
		/*
		 * UserDAOLayer dd = new UserDAOLayer(); dd.loginUser(cus);
		 */
		
	}

}
