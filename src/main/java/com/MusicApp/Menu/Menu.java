package com.MusicApp.Menu;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Validation.AdminValidator;

public class Menu {

	private static final Scanner sc = new Scanner(System.in);
	private ClientMenu clientMenu = new ClientMenu();

	public void chooseMenu() throws ProductNotFoundException, IOException, ClassNotFoundException, SQLException, EncryptedDocumentException, InvalidFormatException {
		System.out.println("*****************************************************************");
		System.out.println("-------------Welcome to Nepal Music Gallery-----------------------");
		System.out.println("*****************************************************************");
		while (true) {
			System.out.println("               Press 1: To go Admin Console                   ");
			System.out.println("               Press 2: To go Client Console                  ");
			System.out.println("               Press 3: TO exit the System                     ");
			System.out.println("---------------------------------------------------------------");

			int choice = Integer.parseInt(sc.next());
			switch (choice) {

			case 1:
				//System.out.println("Go to admin console");
				
				AdminMenu admin = new AdminMenu();
				admin.adminMenu();
				break;

			case 2:
				//System.out.println("Go to client console");
				ClientMenu clientM = new ClientMenu();
				clientM.clientMenu();
				break;

			case 3:
				System.out.println("Exit from system");
				break;

			default:
				System.out.println("-----------------Invalid choice-----------------------");
			}
			System.out.println("---------------------Use our system again------------------");
			
		}
	}

}
