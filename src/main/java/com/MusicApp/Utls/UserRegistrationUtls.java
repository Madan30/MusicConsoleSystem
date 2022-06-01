package com.MusicApp.Utls;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;



import com.MusicApp.Controller.RegisterController;
import com.MusicApp.DAO.UserDAOLayer;
import com.MusicApp.Entities.Customer;
import com.MusicApp.FileHandling.DemoFileDB;
import com.MusicApp.FileHandling.UserDBFile;

public class UserRegistrationUtls {
	private static final Scanner sc = new Scanner(System.in);

	public void userRegistrationUtls() throws IOException, ClassNotFoundException, SQLException {
		
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

		Customer customer = new Customer( fname, lname, address, phone, username, passwd);

		/*
		 * Object[] tble = { uId, fname, lname, address, phone, username, passwd };
		 * 
		 * RegisterController regisCon = new RegisterController();
		 * regisCon.registerController(customer);
		 * 
		 * DemoFileDB ddb = new DemoFileDB(); ddb.appendExcelData(tble, "UserSheet");
		 */
		
		UserDAOLayer userdo = new UserDAOLayer();
		userdo.insertUser(customer);

	}

}
