package com.MusicApp.Services;

import com.MusicApp.Entities.Customer;
import com.MusicApp.Repository.UserDAO;
import com.MusicApp.Repository.UserDAOImpl;

public class UserDAOServiceImpl implements UserDAOService {

	private UserDAO udao = new UserDAOImpl();

	@Override
	public void registerUser(Customer customer) {
		udao.registerUser(customer);

	}

	@Override
	public void loginUser(Customer customer) {

	}

	@Override
	public void saveUser(Customer customer) {
		udao.saveUser(customer);

	}

}
