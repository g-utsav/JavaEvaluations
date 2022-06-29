package Unit5.W1.Question3;

public class Deposit implements Runnable{

	int amount;
	Account account;
	
	public Deposit(int amount, Account account) {
		super();
		this.amount = amount;
		this.account = account;
	}

	public Deposit() {
		super();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.deposit(amount);
	}

}
