package com.MusicApp.Services;

import java.util.List;


import com.MusicApp.Entities.Product;
import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Repository.ProductDAO;
import com.MusicApp.Repository.ProductDAOImpl;

public class ProductDAOServiceImpl implements ProductDAOService {

	private ProductDAO dao = new ProductDAOImpl();

	@Override
	public void addProduct(Product product) {
		dao.addProduct(product);

	}

	@Override
	public void removeProduct(Product product) throws ProductNotFoundException {
		dao.removeProduct(product);
		System.out.println("removing product" + product.getpName());

	}

	@Override
	public void updateProduct(Product product) {
		dao.updateProduct(product);

	}

	@Override
	public List<Product> showAllProducts()  {
		dao.showAllProducts();

		return null ;
	}

}
