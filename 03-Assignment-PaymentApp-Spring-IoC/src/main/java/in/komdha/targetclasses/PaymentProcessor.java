package in.komdha.targetclasses;

import in.komdha.dependentclasses.IPayment;

public class PaymentProcessor {
	
	private IPayment payment;

	public PaymentProcessor() {
		System.out.println("PaymentProcessor::Default Constructor");
	}
	
	public PaymentProcessor(IPayment payment) {
		this.payment = payment;
	}
	
	public void setIPayment(IPayment payment) {
		this.payment = payment;
	}
	
	public void doPayment(double amount) {
		try {
			boolean paymentStatus = payment.makePayment(amount);
			if(paymentStatus) {
				System.out.println("Payment Successfull");
			} else {
				System.out.println("Payment Failed");
			}
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}catch(Exception e) {
			System.out.println("Error occurred in the payment process");
		}
	}

}
