package com.MusicApp.Utls;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.Controller.ProductController;
import com.MusicApp.DAO.DAOLayer;
import com.MusicApp.Entities.Product;
import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.FileHandling.DemoFileDB;
import com.MusicApp.Repository.ProductDAOImpl;

public class ProductUtls {
	private static Scanner sc = new Scanner(System.in);

	private ProductController pcont = new ProductController();

	private DemoFileDB db = new DemoFileDB();

	private Product prod = new Product();

	public void addProductUtls() throws IOException, ClassNotFoundException, SQLException {

		System.out.println("Enter the Product Name");
		String pname = sc.next();

		System.out.println("Enter the Product Description");
		String pDesc = sc.next();

		System.out.println("Enter the Product Price");
		int pPrice = sc.nextInt();

		System.out.println("Enter the Product Image");
		String pImage = sc.next();

		prod = new Product(pname, pDesc, pPrice, pImage);

		
		  DAOLayer layer = new DAOLayer();
		  
		  layer.insertProduct(prod);
		 
	
		
		/*
		 * // pcont.addproductController(prod);
		 * 
		 * Object[] proTbl = { pId, pname, pDesc, pPrice, pImage };
		 * 
		 * 
		 * 
		 * db.appendExcelData(proTbl, "ProductSheet");
		 * 
		 */

	}

	public void removProductUtls() throws ProductNotFoundException, ClassNotFoundException, SQLException {
		System.out.println("Enter prdouct id");

		long proId = sc.nextLong();
		// long proId = Long.parseLong(sc.next());

		prod = new Product(proId);

		DAOLayer layer1 = new DAOLayer();
		layer1.deleteProduct(proId);

		// pcont.removeproducController(prod);

	}

	public void updateProductUtls() throws ProductNotFoundException, ClassNotFoundException, SQLException {

		System.out.println("Enter the Product Name");
		// String pname = sc.next();

		prod.setpName(sc.next());

		System.out.println("Enter the Product Description");
		// String pDesc = sc.next();

		prod.setpDesc(sc.next());

		System.out.println("Enter the Product Price");
		// int pPrice = sc.nextInt();
		prod.setpPrice(sc.nextInt());

		System.out.println("Enter the Product Image");
		// String pImage = sc.next();
		prod.setpImg(sc.next());

		System.out.println("Enter the Product Id");
		// long pid = sc.nextLong();
		prod.setpId(sc.nextLong());

		DAOLayer layer3 = new DAOLayer();
		layer3.updateProdcut(prod);

		// prod = new Product( pname, pDesc, pPrice, pImage);

		// pcont.addproductController(prod);

		/*
		 * prod.setpName(""); prod.setpDesc(""); prod.setpPrice(0); prod.setpImg("");
		 * prod.setpId(0);
		 */

	}

	public void showProductUtls() throws EncryptedDocumentException, IOException, ClassNotFoundException, SQLException {

		// db.readExcelFile("ProductSheet");

		// pcont.showproductController(prod);

		DAOLayer layer2 = new DAOLayer();
		layer2.showAllProduct();

	}

}
