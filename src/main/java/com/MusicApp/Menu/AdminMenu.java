package com.MusicApp.Menu;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Utls.OrderUtls;
import com.MusicApp.Utls.ProductUtls;

public class AdminMenu {

	private static final Scanner sc = new Scanner(System.in);

	public void adminMenu()
			throws ProductNotFoundException, ClassNotFoundException, SQLException, EncryptedDocumentException, IOException, InvalidFormatException {

		System.out.println("*****************************************************************");
		System.out.println("---------------------Welcome To Admin Colsole--------------------");
		System.out.println("*****************************************************************");
		while (true) {
			System.out.println("            Press 1: To Add Proudct                 ");
			System.out.println("            Press 2: To Remove Product              ");
			System.out.println("            Press 3: To Upadate Product             ");
			System.out.println("            Press 4: To Show Product                ");
			System.out.println("            Press 5: To View Orders                 ");
			System.out.println("            Press 6: To Exit From System            ");
			System.out.println("-------------------------------------------------------------");

			int choice = Integer.parseInt(sc.next());
			switch (choice) {

			case 1:

				ProductUtls prod = new ProductUtls();
				prod.addProductUtls();

				System.out.println("Product added successfully");
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			case 2:
				ProductUtls pro1 = new ProductUtls();
				pro1.removProductUtls();
				System.out.println("Prouct remove successfully");
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			case 3:
				ProductUtls pro = new ProductUtls();
				pro.updateProductUtls();
				System.out.println("Prouct update successfully");
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			case 4:
				System.out.println("Viewing Product");
				System.out.println("------------------------------------------------------------");
				ProductUtls proUtls1 = new ProductUtls();
				proUtls1.showProductUtls();
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			case 5:
				System.out.println("Viewing Orders");
				System.out.println("-------------------------------------------------------------");
				OrderUtls ord = new OrderUtls();
				ord.viewOrders();
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				break;

			case 6:
				System.out.println("---------------------Exiting From System-------------");
				System.out.println("-------------*****************-----------------------");
				System.out.println("-------------*****************-----------------------");
				MainMenu m = new MainMenu();
				m.mainMenu();
				break;

			default:
				System.out.println("-------------Invalid choice--------------------------");
				System.out.println("-------------*****************-----------------------");
			}

		}

	}
	}


