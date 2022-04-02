package com.example.customerService.service;

import java.util.List;
import java.util.Optional;

import com.example.customerService.model.Customers;

public interface CustomerService {
	
	public List<Customers> getAllCustomers();
	public Customers insertCustomer(Customers customer);
	public String deleteCustomer(Customers customer);
	/*public Optional<Customers> findByCid(int cid);

	public List<Customers> searchCustomersByCname(String cname);
	public List<Customers> searchCustomersByItem(String item);
	public List<String> searchCnamesByItem(String item);
	*/
	//public List<RestaurantDto> searchRestaurantByRid(int rid);
}
