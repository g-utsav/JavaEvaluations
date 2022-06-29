package Unit5.W1.Question3;

public class Withdraw implements Runnable{

	int amount;
	Account account;
	
	public Withdraw() {
		super();
	}

	public Withdraw(int amount, Account account) {
		super();
		this.amount = amount;
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.withdraw(amount);
	}

}
