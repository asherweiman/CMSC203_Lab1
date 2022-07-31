
public class SavingsAccount extends BankAccount {

	
	private double rate = .025;
	
	private int savingsNumber = 0;
	
	private String accountNumber ;
	
	
	public SavingsAccount(String name, double amount) {
		
		super(name,amount);
		
		accountNumber = super.getAccountNumber() + "-"+ savingsNumber;
		
		 
		
		
		
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double initialBalance) {
		
		super(oldAccount, initialBalance);
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-"+ savingsNumber;
		
	}
	
	
	public void postInterest() {
		
		deposit((rate/12)*getBalance());
		
	}
	
	public String getAccountNumber() {
		
		return accountNumber;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
