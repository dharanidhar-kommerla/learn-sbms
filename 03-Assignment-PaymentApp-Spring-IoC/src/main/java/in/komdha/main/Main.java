package in.komdha.main;

//import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.komdha.targetclasses.PaymentProcessor;

public class Main {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter amount: ");
//		double amount = input.nextDouble();
//		
//		PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment());
//		
//		paymentProcessor.doPayment(amount);
//		input.close();
		
		double amount = 9000;
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		PaymentProcessor paymentProcessor = context.getBean(PaymentProcessor.class);
		paymentProcessor.doPayment(amount);
		
	}
}
