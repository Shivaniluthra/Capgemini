package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
	Map<Integer, Employee> store= new HashMap<>();
	
	@Override
	public String findScheme(int id) {
		Employee e= store.get(id);
		if(e.getSalary()>5000 && e.getSalary()< 20000 && e.getDesignation().equalsIgnoreCase("System Associate")) {
			e.setInsuranceScheme("Scheme C");
			 return "Scheme C";
		}
		if(e.getSalary()>=20000 && e.getSalary()< 40000 && e.getDesignation().equalsIgnoreCase("Programmer")) {
			e.setInsuranceScheme("Scheme B");
			return "Scheme B";
		}
		if(e.getSalary()>=40000 && e.getDesignation().equalsIgnoreCase("Manager")) {
			e.setInsuranceScheme("Scheme A");
			return "Scheme A";
		}
		e.setInsuranceScheme("No Scheme");
		return "No Scheme";
		
			
	}

	@Override
	public void addEmp(Employee e) {
		store.put(e.getId(), e);
		
	}

	@Override
	public Employee getDetails(int id) {
		return store.get(id);
	}
}
