package in.komdha.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.komdha.beans.Car;

public class Main {

	public static void main(String[] args) {
		
		// starting the IoC 
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		// getting the object from IoC
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
