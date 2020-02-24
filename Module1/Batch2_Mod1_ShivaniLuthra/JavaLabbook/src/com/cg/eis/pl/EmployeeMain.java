package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeService service= new EmployeeServiceImpl();
		Scanner sc= new Scanner(System.in);
		try {
			do {
				System.out.println("1. Add employee");
				System.out.println("2. Find insurance scheme");
				System.out.println("3. Display details of employee");
				System.out.println("4. Exit");
				System.out.println("Enter choice");
				int ch= sc.nextInt();
				
				switch(ch) {
				case 1: System.out.println("Enter id:");
					int id= sc.nextInt();
					System.out.println("Enter name:");
					String name= sc.next();
					System.out.println("Enter salary:");
					int sal= sc.nextInt();
					System.out.println("Enter designation:");
					String des= sc.next();
					Employee e1= new Employee(id,name,sal,des);
					service.addEmp(e1);
					break;
					
				case 2: System.out.println("Enter id");
					int id1= sc.nextInt();
					System.out.println(service.findScheme(id1));
					break;
					
				case 3: System.out.println("Enter id:");
					int i= sc.nextInt();
					Employee e= service.getDetails(i);
					if(e!=null)
						System.out.println("ID= "+e.getId()+", Name= "+e.getName()+", Salary= "+e.getSalary()+", Designation= "+e.getDesignation()+", Scheme= "+e.getInsuranceScheme());
					else
						throw new EmployeeException("No employee found");
					break;
					
				case 4: System.exit(0);
				
				default: System.out.println("Enter valid input.");
					}
			}while(true);
		} catch(EmployeeException e) {
			System.out.println("No employee found");
		}
	}

}
