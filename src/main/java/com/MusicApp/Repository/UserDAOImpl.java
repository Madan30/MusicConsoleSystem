package com.MusicApp.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.MusicApp.Entities.Customer;

public class UserDAOImpl implements UserDAO {

	private Map<String, Customer> loginMap = new HashMap<>();

	private List<Customer> customerList = new ArrayList<>();

	@Override
	public void registerUser(Customer customer) {
		customerList.add(customer);
		//System.out.println(customer);

	}

	@Override
	public void loginUser(Customer customer) {
		

	}

	@Override
	public void saveUser(Customer customer) {
		loginMap.put(customer.getUserName(), customer);
		loginMap.put(customer.getPassword(), customer);

		//System.out.println("Username is:" + customer.getUserName());

	}

	public Map<String, Customer> getLoginMap() {
		return loginMap;
	}

	public void setLoginMap(Map<String, Customer> loginMap) {
		this.loginMap = loginMap;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
	

}
