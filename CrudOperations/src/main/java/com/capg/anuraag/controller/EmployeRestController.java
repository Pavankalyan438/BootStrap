package com.capg.anuraag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.anuraag.entity.EmployeeDet;
import com.capg.anuraag.service.EmployeeServiceI;

@RestController
@RequestMapping("/crud")
@CrossOrigin("http://localhost:4333")

public class EmployeRestController {
	@Autowired
	EmployeeServiceI service;
	@PostMapping("/create")
	public String createAccount(@RequestBody EmployeeDet emp) {
		return service.createAccount(emp);	
	}
	@GetMapping("/findById/{id}")
	public EmployeeDet findById(@PathVariable("id") int id) {
		return service.findById(id);	
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	@GetMapping("/fetchAll")
	public List fetchAll() {
		return service.fetchAll();
		
	}
	@PostMapping("/update")
	public String updateEmp(@RequestBody EmployeeDet emp) {
		return service.updateEmp(emp);
		
	}

}
