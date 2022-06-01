package com.MusicApp.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;

import com.MusicApp.Entities.Product;
import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.FileHandling.DemoFileDB;

public class ProductDAOImpl implements ProductDAO {
	DemoFileDB db = new DemoFileDB();

	// adding product to list
	private List<Product> productList = new ArrayList<Product>();

	@Override
	public void addProduct(Product product) {
		productList.add(product);
		System.out.println(product);

	}

	@Override
	public void removeProduct(Product product) throws ProductNotFoundException {
		// before removing product
		// first of all check the product whether it is available or not
		if (!productList.contains(product)) {
			try {
				throw new ProductNotFoundException(product.getpId());
			} catch (ProductNotFoundException e) {
				e.printStackTrace();
			}
		}
		productList.remove(product);

	}

	@Override
	public void updateProduct(Product product) {

		if (!productList.contains(product)) {
			try {
				throw new ProductNotFoundException(product.getpId());
			} catch (ProductNotFoundException e) {
				e.printStackTrace();
			}
		}
		int index = productList.indexOf(product);
		productList.set(index, product);

	}

	@Override
	public List<Product> showAllProducts(){

		for(Product pl: productList) {
			System.out.println(pl.getpId());
			System.out.println(pl.getpName());
			System.out.println(pl.getpDesc());
			System.out.println(pl.getpPrice());
			System.out.println(pl.getpImg());
			
		}
		return null;
	}

}
