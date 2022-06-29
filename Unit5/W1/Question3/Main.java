package Unit5.W1.Question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ABC = new Account();
		ABC.balance = 1000;
		ABC.accountNo = 111;
		
		Deposit deposit = new Deposit(500, ABC);
		Withdraw withdraw = new Withdraw(900, ABC);
		
		
		Thread thread1 = new Thread(deposit);
		Thread thread2 = new Thread(withdraw);
		
		thread1.setPriority(10);
		
		thread1.start();
		thread2.start();
		
	}

}
