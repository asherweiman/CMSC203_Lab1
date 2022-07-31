
public class CheckingAccount extends BankAccount {

	static double FEE = .15;
	
	
	public CheckingAccount(String name, double amount) {
		
		super(name,amount);
		
		super.setAccountNumber(super.getAccountNumber() + "-10");
		
		
	}
	
	public boolean withdraw(double amount) {
		
		
		amount += FEE;
		return super.withdraw(amount);
	}
	
	
}
