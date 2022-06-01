package com.MusicApp.Utls;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.DAO.DAOLayer;
import com.MusicApp.Entities.Order;
import com.MusicApp.FileHandling.DemoFileDB;

public class OrderUtls {

	private static final Scanner sc = new Scanner(System.in);
	private DemoFileDB db = new DemoFileDB();
	private Order od = new Order();

	public void viewOrderUtls() throws EncryptedDocumentException, IOException {

		db.readExcelFile("OrderSheet");

	}

	public void placeOrderUtls() throws EncryptedDocumentException, IOException, 
			ClassNotFoundException, SQLException {
		ProductUtls prod = new ProductUtls();
		prod.showProductUtls();

		System.out.println("Chooese the product");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");

		System.out.println("Enter product name");
		String proName = sc.next();

		System.out.println("Enter product price");
		int pprice = sc.nextInt();

		System.out.println("Enter your customer name");
		String cName = sc.next();

		System.out.println("Enter order date");
		String date = sc.next();

		od = new Order(proName, pprice, cName, date);

		DAOLayer daolayer = new DAOLayer();
		daolayer.insertOrder(od);

		/*
		 * od = new Order(proName, pprice, cName);
		 * 
		 * Object[] ordTbl = { prod, proName, pprice, cName };
		 * 
		 * db.appendExcelData(ordTbl, "OrderSheet");
		 * 
		 * System.out.println("Your order successfully placed");
		 */

	}
	
	public void viewOrders() throws ClassNotFoundException, SQLException {
		DAOLayer daol = new DAOLayer();
		daol.showOrder();
	}

}
