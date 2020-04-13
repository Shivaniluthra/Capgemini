package Lab1_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Lab1_3.SBU;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		Employee e= (Employee)ctx.getBean("employee");
		SBU s= (SBU) ctx.getBean("sbu1");
		s.getSbuDetails();
	}

}
