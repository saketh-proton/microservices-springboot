package com.example.customerService.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.customerService.model.Customers;


@Repository
@Transactional
public interface CustomersDao extends JpaRepository<Customers,Integer>{
	//@Query("select c from Customers c where c.cname=?1")
	//public List<Customers> searchCustomersByCname(String cname);
	
	//@Query("select c from Customers c where c.item?=1")
	//public List<Customers> searchCustomersByItem(String item);
	
	//@Query("select c.cname from Customers c where c.cname=?1")
	//public List<String> searchCnamesByItem(String item);
}
