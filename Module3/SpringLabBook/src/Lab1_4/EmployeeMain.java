package Lab1_4;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		SBU s= (SBU) ctx.getBean("sbu2");
		System.out.println("Employee ID :");
		int id= sc.nextInt();
		Employee e = s.findEmployeeById(id);
		if(e!=null)
			System.out.println(e);
		else
			System.out.println("Employee Not found");
	}

}
