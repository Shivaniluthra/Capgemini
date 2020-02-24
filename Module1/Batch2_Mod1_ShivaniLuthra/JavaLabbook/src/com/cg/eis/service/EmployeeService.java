package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public void addEmp(Employee e);
	public String findScheme(int id);
	public Employee getDetails(int id);

}
