package in.komdha.dependentclasses;

public class DebitCardPayment implements IPayment {
	
	double ddBalance = 1000000.00;
	boolean isPaymentCompleted = false;
	
	public DebitCardPayment() {
		System.out.println("CrediCardPayment::Constructor");
	}
	
	public boolean makePayment(double amount) {
		try {
			if(amount>0) {
				System.out.println("Debitcard Payment process has started...");
				if(ddBalance>amount) {
					System.out.println("debit Balance: "+ddBalance);
					System.out.println("Payment amount: "+amount);
					ddBalance = ddBalance-amount;
					System.out.println("Remaining debit Balance: "+ddBalance);
					isPaymentCompleted = true;
				} else {
					System.out.println("Debit Balance: "+ddBalance);
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
