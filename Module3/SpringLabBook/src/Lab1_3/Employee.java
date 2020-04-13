package Lab1_3;

import java.util.List;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private int age;
	private SBU businessUnit;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public String toString() {
        return "Employee ID :" +employeeId + ", Employee Name: " + employeeName
                + ", Employee Salary: " +salary+ ", Age: "+age+"]";
    }

}
