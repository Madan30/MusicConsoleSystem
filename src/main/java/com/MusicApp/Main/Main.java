package com.MusicApp.Main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.FileHandling.DemoFileDB;
import com.MusicApp.Menu.MainMenu;

import com.MusicApp.Repository.UserDAOImpl;

public class Main {
	public static UserDAOImpl listUser = new UserDAOImpl();
	public static DemoFileDB demofile = new DemoFileDB();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException, ProductNotFoundException,ClassNotFoundException, SQLException, InvalidFormatException {

		/*
		 * System.out.println(
		 * "*****************************************************************");
		 * System.out.
		 * println("----------------Welcome To Nepal Music Gallery-------------------");
		 * System.out.println(
		 * "*****************************************************************");
		 * 
		 * while (true) { System.out.
		 * println("            Press 1:  Main Menu                              ");
		 * System.out.
		 * println("            Press 2:  Exit From The System                   ");
		 * System.out.println(
		 * "-------------------------------------------------------------");
		 * 
		 * int choice = Integer.parseInt(sc.next()); switch (choice) { case 1: //
		 * System.out.println("Welcome To Main Menu"); MainMenu mainMenu = new
		 * MainMenu(); mainMenu.mainMenu(); break;
		 * 
		 * case 2:
		 * System.out.println("------------------Exit from system---------------------"
		 * ); break;
		 * 
		 * default:
		 * System.out.println("------------------Invalid choice-----------------------"
		 * ); }
		 * 
		 * }
		 * 
		 * 
		 * ProductUtls p = new ProductUtls(); p.addProductUtls(); DemoFileDB db = new
		 * DemoFileDB(); db.readExcelFile("ProductSheet");
		 * 
		 */

		/*
		 * AdminMenu m = new AdminMenu(); m.adminMenu();
		 */

		MainMenu mainmenu = new MainMenu();
		mainmenu.mainMenu();

		/*
		 * ClientMenu client = new ClientMenu(); client.clientMenu();
		 */

	}

}
