package Lab1_4;

import java.util.List;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private int age;

	
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
	
	public String toString() {
        return " Employee ID :" +employeeId + "\n Employee Name: " + employeeName
                + "\n Employee Salary: " +salary+ "\n Age: "+age;
    }

}
