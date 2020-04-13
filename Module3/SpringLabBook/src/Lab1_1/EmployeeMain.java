package Lab1_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		Employee e= (Employee)ctx.getBean("emp");
		e.displayValues();
	}

}
