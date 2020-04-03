package com.capg.anuraag.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.anuraag.entity.EmployeeDet;


@Repository
public class EmployeeDao implements EmployeeDaoI {
@PersistenceContext
private EntityManager em;
@Transactional
	public String createAccount(EmployeeDet emp) {
		em.merge(emp);
		return "Account Created";
	}
@Override
@Transactional
public EmployeeDet findById(int id) {
	EmployeeDet emp= em.find(EmployeeDet.class, id);
	return emp;
}
@Override
public String deleteById(int id) {
	// TODO Auto-generated method stub
	EmployeeDet emp=em.find(EmployeeDet.class, id);
	em.remove(emp);
	if(emp!=null)
	{
		return "Deleted";
	}
	return "no such record";
}
@Override
@Transactional
public List fetchAll() {
	Query q=em.createQuery("select emp from EmployeeDet emp");
	List l=(List) q.getResultList();
	return  l;
}
@Override
@Transactional
public String updateEmp(EmployeeDet emp) {
	EmployeeDet e=em.find(EmployeeDet.class, emp.getId());
	e.setName(emp.getName());
	e.setCompany(emp.getCompany());
	e.setSalary(emp.getSalary());
	em.merge(e);
	if(e==null) {
		return "no such";
	}
	return "updated";
}

}
