package com.capg.anuraag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@CrossOrigin("http://localhost:4200")

public class EmployeRestController {
	@Autowired
	EmployeeServiceI service;
	@PostMapping("/create")
	public String createAccount(@RequestBody EmployeeDet emp) {
		return service.createAccount(emp);	
	}
	@GetMapping("/findById/{id}")
	public  ResponseEntity<EmployeeDet> findById(@PathVariable("id") int id) {
		EmployeeDet msg=service.findById(id);	
		return new ResponseEntity<EmployeeDet>(msg,new HttpHeaders(),HttpStatus.OK);
	}
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String>  deleteById(@PathVariable int id) {
		String msg=service.deleteById(id);
		return new ResponseEntity<String>(msg,new HttpHeaders(),HttpStatus.OK);
	}
	@GetMapping("/fetchAll")
	public List fetchAll() {
		return service.fetchAll();
		
	}
	@PostMapping("/update")
	public ResponseEntity<String>  updateEmp(@RequestBody EmployeeDet emp) {
		 String msg=service.updateEmp(emp);
		 return  new ResponseEntity<String>(msg,new HttpHeaders(),HttpStatus.OK);
		
	}

}
