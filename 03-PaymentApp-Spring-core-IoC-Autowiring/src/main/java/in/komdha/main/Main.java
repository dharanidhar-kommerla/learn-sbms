package in.komdha.main;

//import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.komdha.targetclasses.PaymentProcessor;

public class Main {
	public static void main(String[] args) {
		System.out.println("=========================================");
		double amount = 9000;
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-scope.xml");

		System.out.println("=========================================");
		
		PaymentProcessor paymentProcessor1 = context.getBean(PaymentProcessor.class);
		paymentProcessor1.doPayment(amount);
		
		System.out.println("------------------------------------------");
		
		PaymentProcessor paymentProcessor2 = context.getBean(PaymentProcessor.class);
		paymentProcessor2.doPayment(amount);
		
		System.out.println("=========================================");
		System.out.println("Hashcode of paymentProcessor1: "+paymentProcessor1.hashCode());
		System.out.println("Hashcode of paymentProcessor2: "+paymentProcessor2.hashCode());

		
	}
}
