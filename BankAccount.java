// Bank Account Java File
public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
//Constructor and methods
	public BankAccount(String firstName, String lastName, int accountID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0.0;
}
public void deposit(double amount) {
	this.balance +=amount;
}
public void withdrawal(double amount) {
	this.balance -= amount;
}
//The getter and setters 

	public double getBalance() {
		return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;    
    }

	public String getFirstName() {
		return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;    
    }

	public String getLastName() {
		return this.lastName;
    }
    
    public void setAccountID(int accountID){
        this.accountID = accountID;    
    }

	public int getAccountID() {
		return this.accountID;
    }

	public void accountSummary() {
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Account ID: " + this.accountID);
		System.out.println("Balance: " + this.balance);
	}
}
