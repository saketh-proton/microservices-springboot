package com.examples.crud.fisemployeecrud.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.crud.fisemployeecrud.model.Fisemployee;

@Repository
@Transactional
public interface EmployeeDao extends JpaRepository<Fisemployee,Integer>{

}
