package com.MusicApp.Controller;

import com.MusicApp.Entities.Customer;
import com.MusicApp.Main.Main;
import com.MusicApp.Repository.UserDAOImpl;

public class RegisterController {
private UserDAOImpl userDao = new  UserDAOImpl();
	
	public void registerController(Customer cus) {
		//userDao.loginUser(cus);
		Main.listUser.saveUser(cus);
		Main.listUser.registerUser(cus);
		//userDao.saveUser(cus);
		//userDao.registerUser(cus);
		
	}

}
