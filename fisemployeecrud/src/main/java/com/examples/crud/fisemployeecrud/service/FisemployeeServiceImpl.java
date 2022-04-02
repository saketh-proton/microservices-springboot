package com.examples.crud.fisemployeecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.crud.fisemployeecrud.model.Fisemployee;
import com.examples.crud.fisemployeecrud.repo.EmployeeDao;

@Service
public class FisemployeeServiceImpl implements FisemployeeService{
	
	
	@Autowired
	EmployeeDao dao;

	@Override
	public List<Fisemployee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
