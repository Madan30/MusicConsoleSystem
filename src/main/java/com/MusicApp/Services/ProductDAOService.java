package com.MusicApp.Services;

import java.util.List;


import com.MusicApp.Entities.Product;
import com.MusicApp.ExceptionHandling.ProductNotFoundException;

public interface ProductDAOService {

	public abstract void addProduct(Product product);

	public abstract void removeProduct(Product product) throws ProductNotFoundException;

	public abstract void updateProduct(Product product);

	public List<Product> showAllProducts();

}
