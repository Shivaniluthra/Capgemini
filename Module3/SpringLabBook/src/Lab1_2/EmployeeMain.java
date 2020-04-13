package Lab1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		Employee e= (Employee)ctx.getBean("empl");
		e.getSbuDetails();
	}

}
