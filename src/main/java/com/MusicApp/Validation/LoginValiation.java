package com.MusicApp.Validation;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.DAO.UserDAOLayer;
import com.MusicApp.Entities.Customer;
import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Main.Main;
import com.MusicApp.Menu.MainMenu;
//import com.MusicApp.Repository.UserDAOImpl;
import com.MusicApp.Menu.Menu;
import com.MusicApp.Utls.LoginUtls;

public class LoginValiation {
	// private UserDAOImpl userDaoImpl = new UserDAOImpl();
	private MainMenu menu = new MainMenu();
	private Menu m = new Menu();

	/*
	 * public void loginValidation(String username, String password) throws
	 * InvalidFormatException, IOException, ProductNotFoundException,
	 * ClassNotFoundException, SQLException { if
	 * (Main.listUser.getLoginMap().containsKey(username) &&
	 * Main.listUser.getLoginMap().get(username).getPassword().equals(password)) {
	 * System.out.println("Login Success");
	 * 
	 * m.chooseMenu();
	 * 
	 * } else { System.out.println("Login Failed"); menu.mainMenu();
	 * 
	 * }
	 * 
	 * }
	 */

	public void loginValid(String username, String password)
			throws ClassNotFoundException, SQLException, IOException, ProductNotFoundException, EncryptedDocumentException, InvalidFormatException {

		Customer cust = new Customer();
		cust.setUserName(username);
		cust.setPassword(password);

		UserDAOLayer udao = new UserDAOLayer();
		
		String userValidate = udao.loginUser(cust);
		if (userValidate.equals("Login success")) {

			m.chooseMenu();
		} else {
			menu.mainMenu();
		}

	}
}
