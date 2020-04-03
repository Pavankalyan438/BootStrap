package com.capg.anuraag.service;

import java.util.ArrayList;
import java.util.List;

import com.capg.anuraag.entity.EmployeeDet;

public interface EmployeeServiceI {
	public String createAccount(EmployeeDet emp);

	public EmployeeDet findById(int id);

	public String deleteById(int id);

	public List fetchAll();

	public String updateEmp(EmployeeDet emp);
}
