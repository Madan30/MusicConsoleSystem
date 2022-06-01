package com.MusicApp.Menu;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Utls.OrderUtls;
import com.MusicApp.Utls.ProductUtls;

public class ClientMenu {
	private static final Scanner sc = new Scanner(System.in);

	public void clientMenu() throws  IOException, ProductNotFoundException, ClassNotFoundException, SQLException, InvalidFormatException {
		System.out.println("*****************************************************************");
		System.out.println("----------------Welcome To Client Colsole------------------------");
		System.out.println("*****************************************************************");
		while (true) {
			System.out.println("            Press 1: To View Product                           ");
			System.out.println("            Press 2: To Place Order                            ");
			System.out.println("            Press 3: To Exit the system                        ");
			System.out.println("---------------------------------------------------------------");

			int choice = Integer.parseInt(sc.next());
			switch (choice) {

			case 1:
				System.out.println("List Of Product");
				ProductUtls putls = new ProductUtls();
				putls.showProductUtls();
				System.out.println("--------------------showing Product------------------");
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			case 2:
				System.out.println("Place Order");
				OrderUtls ord = new OrderUtls();
				ord.placeOrderUtls();
				System.out.println("----------------Order successful---------------------");
				break;

			case 3:
				System.out.println("Exit from system");
				MainMenu m = new MainMenu();
				m.mainMenu();
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			default:
				System.out.println("-------------------Invalid choice---------------------------");
			}

			System.out.println("---------------------use our system again------------------------");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------");
		}

	}

}
