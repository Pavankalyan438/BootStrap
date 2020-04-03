package com.capg.anuraag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.anuraag.dao.EmployeeDaoI;
import com.capg.anuraag.entity.EmployeeDet;
@Service
public class EmployeeService implements EmployeeServiceI {
@Autowired
EmployeeDaoI dao;
@Override
	public String createAccount(EmployeeDet emp) {
		return	dao.createAccount(emp);
		 
	}
	@Override
	public EmployeeDet findById(int id) {
		
		return dao.findById(id);
		
	
	}
	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.deleteById(id);
	}
	@Override
	public List fetchAll() {
		// TODO Auto-generated method stub
		return dao.fetchAll();
	}
	@Override
	public String updateEmp(EmployeeDet emp) {
		// TODO Auto-generated method stub
		return dao.updateEmp(emp);
	}

}
