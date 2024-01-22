// The Checking account will inherit BankAccount.Java file
public class CheckingAccount extends BankAccount{
	private double intrestRate;
	
	public CheckingAccount(String firstName, String lastName, int accountID, double intrestRate) {
		super(firstName, lastName,accountID);
		this.intrestRate = intrestRate;
	}
	@Override
	public void withdrawal(double amount) {
		super.withdrawal(amount);
		if(getBalance() < 0) {
			super.withdrawal(30); //This code is for the overdraft fee
			System.out.println("Overdraft occured! A $30 fee has been charged.");
		}
	}
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Interest Rate: " + this.intrestRate);
	}
}
