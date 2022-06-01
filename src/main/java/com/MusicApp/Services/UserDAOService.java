package com.MusicApp.Services;

import com.MusicApp.Entities.Customer;

public interface UserDAOService {
	
	public abstract void registerUser(Customer customer);
	public abstract void loginUser(Customer customer);
	public abstract void saveUser(Customer customer);

}
