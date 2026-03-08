package in.komdha.main;

import java.util.Scanner;

import in.komdha.dependentclasses.CreditCardPayment;
import in.komdha.targetclasses.PaymentProcessor;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount: ");
		double amount = input.nextDouble();
		
		PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment());
		
		paymentProcessor.doPayment(amount);
		input.close();
	}
}
