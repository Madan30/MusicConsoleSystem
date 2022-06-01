package com.MusicApp.Menu;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Utls.LoginUtls;
import com.MusicApp.Utls.UserRegistrationUtls;

public class MainMenu {
	private static final Scanner sc = new Scanner(System.in);

	public void mainMenu()
			throws IOException, ProductNotFoundException, InvalidFormatException,ClassNotFoundException, SQLException {
		System.out.println("*****************************************************************");
		System.out.println("-------------Welcome To Nepal Music Gallery-----------------------");
		System.out.println("*****************************************************************");
		while (true) {
			System.out.println("              Press 1: To Create Account                     ");
			System.out.println("              Press 2: To Login Account                      ");
			System.out.println("              Press 3: To exit the system                    ");
			System.out.println("-------------------------------------------------------------");

			int choice = Integer.parseInt(sc.next());
			switch (choice) {
			case 1:
				UserRegistrationUtls regi = new UserRegistrationUtls();
				regi.userRegistrationUtls();

				System.out.println("Account created successfully");
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			case 2:
				LoginUtls login = new LoginUtls();
				login.loginUserUtls();

				System.out.println("-------------Login  successfully--------------------");
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			case 3:
				System.out.println("-------------Exiting from the system-----------------");
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			default:
				System.out.println("-------------Invalid choiece-----------------------");
				System.out.println("-------------*****************-----------------------");
			}

			System.out.println("--------------------Use our system again------------------");
			System.out.println("-------------*****************-----------------------");
			System.out.println("-------------*****************-----------------------");
		}
	}
}
