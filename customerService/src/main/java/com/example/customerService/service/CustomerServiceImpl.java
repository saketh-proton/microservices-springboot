package com.example.customerService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.customerService.model.Customers;
import com.example.customerService.repo.CustomersDao;

@Service
public class CustomerServiceImpl implements CustomerService{

	//@Autowired
	//RestTemplate template;
	
	@Autowired
	CustomersDao dao;
	
	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Customers insertCustomer(Customers customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	@Override
	public String deleteCustomer(Customers customer) {
		// TODO Auto-generated method stub
		dao.delete(customer);
		return "Customer Deleted!!";
	}

	/*@Override
	public Optional<Customers> findByCid(int cid) {
		// TODO Auto-generated method stub
		return dao.findById(cid);
	}
	

	@Override
	public List<Customers> searchCustomersByCname(String cname) {
		// TODO Auto-generated method stub
		return dao.searchCustomersByCname(cname);
	}

	@Override
	public List<Customers> searchCustomersByItem(String item) {
		// TODO Auto-generated method stub
		return dao.searchCustomersByItem(item);
	}

	@Override
	public List<String> searchCnamesByItem(String item) {
		// TODO Auto-generated method stub
		return dao.searchCnamesByItem(item);
	}
*/	
}
