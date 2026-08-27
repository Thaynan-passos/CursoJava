package entities;

public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if(amount <= loanLimit) {	
		 balance += amount - 10.0; // Deducting a fee of 10.0 for the loan
		
		}
		
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); // Calling the withdraw method from the superclass (Account)
		balance -=  2.0; // Deducting a fee of 2.0 for the withdrawal in BusinessAccount
	}
}	

