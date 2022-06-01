package com.MusicApp.Repository;

import com.MusicApp.Entities.Customer;

public interface UserDAO {
	
	public abstract void registerUser(Customer customer);
	public abstract void loginUser(Customer customer);
	public abstract void saveUser(Customer customer);

}
