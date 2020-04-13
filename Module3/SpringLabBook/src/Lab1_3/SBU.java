package Lab1_3;

import java.util.List;

public class SBU {
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public void getSbuDetails() {
		System.out.println("SBU Details");
		System.out.println("---------------------------");
		System.out.println("SBU Details= SBU [ sbuCode="+sbuId+", sbuHead="+sbuHead+", sbuName="+sbuName+"]]");
		System.out.println("Employee details------");
		System.out.println("[Employee "+empList);
	}
}
