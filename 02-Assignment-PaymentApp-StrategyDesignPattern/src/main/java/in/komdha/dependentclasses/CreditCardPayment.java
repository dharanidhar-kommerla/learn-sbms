package in.komdha.dependentclasses;

public class CreditCardPayment implements IPayment {
	
	double cdBalance = 1000000.00;
	boolean isPaymentCompleted = false;
	
	public CreditCardPayment() {
		System.out.println("CrediCardPayment::Constructor");
	}
	
	@SuppressWarnings("finally")
	public boolean makePayment(double amount) {
		try {
			if(amount>0) {
				System.out.println("Creditcard Payment process has started...");
				if(cdBalance>amount) {
					System.out.println("Credit Balance: "+cdBalance);
					System.out.println("Payment amount: "+amount);
					cdBalance = cdBalance-amount;
					System.out.println("Remaining credit Balance: "+cdBalance);
					isPaymentCompleted = true;
				} else {
					System.out.println("Credit Balance: "+cdBalance);
					System.out.println("Insufficient Balance");
				}
			}else {
				System.out.println("Not a valid amount");
			}
		}catch(Exception e) {
			System.out.println("Network Error");
		} finally {
			if(isPaymentCompleted) {
				System.out.println("Payment Done.");
			}else {
				System.out.println("Payment Failed");
			}
		}
		return isPaymentCompleted;
	}

}
