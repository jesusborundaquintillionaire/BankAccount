//Test Bank Account for BankAccount and CheckingAccount
public class TestBankAccount {
	public static void main(String[]args) {
//creating a Bank Account
		BankAccount ba = new BankAccount("Jesus", "Borunda", 500000);
		ba.deposit(200.0);
		ba.withdrawal(500.0);
		ba.accountSummary();
		
//Creating a checking account
		CheckingAccount ca = new CheckingAccount("Diana", "Borunda",900000, 0.02); //the "0.02 represents a 2 percent intrest rate
		ca.deposit(2000.0);
		ca.withdrawal(3000.0);//3000 to trigger a overdraft fee
		ca.displayAccount();
	}
}
