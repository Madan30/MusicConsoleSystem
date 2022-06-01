package com.MusicApp.Controller;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.MusicApp.Entities.Product;
import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Services.ProductDAOServiceImpl;

public class ProductController {

	private ProductDAOServiceImpl proImplService = new ProductDAOServiceImpl();

	public void addproductController(Product product) {

		proImplService.addProduct(product);

		// proImplService.showAllProducts();

	}

	public void removeproducController(Product product) throws ProductNotFoundException {
		proImplService.removeProduct(product);
	}

	public void updateproductController(Product product) {

		proImplService.updateProduct(product);

	}

	public void showproductController(Product product) throws EncryptedDocumentException, IOException {

		proImplService.showAllProducts();

	}

}
