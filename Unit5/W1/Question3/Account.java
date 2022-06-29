package Unit5.W1.Question3;

public class Account {

	int	balance;
	int accountNo;
	
	void displayBalance() {
		System.out.println("Account No: "+accountNo+" Balance: "+balance);
	}
	synchronized void deposit(int amount) {
		this.balance += amount;
		System.out.println(amount + " is Deposited");
		displayBalance();
	}
	synchronized void withdraw(int amount) {
		this.balance -= amount;
		System.out.println(amount + " is Withdrawn");	
		displayBalance();
	}
	
}
