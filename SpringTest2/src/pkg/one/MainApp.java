package pkg.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      Test objA = (Test) context.getBean("bid");

	      objA.setMessage("I'm object A");
	      objA.getMessage();
	      objA.getMessage2();

	      Test objB = (Test) context.getBean("bid");
	      //objB.setMessage("tattarara");
	      objB.getMessage();
	}
}
