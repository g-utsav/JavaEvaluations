package Unit5.W1.Question1;

public class WaitNotify {

	public static void main(String[] args) throws InterruptedException {
		
//		synchronized() {
		Summ summ = new Summ();
		
		Thread a = new Thread(summ);
		
//		a.wait();
		
		a.start();
		
//		try {
//			a.wait();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Thread.sleep(1000);
		
		System.out.println("The sum is "+summ.sum);
		
//		}

	}

}

class Summ implements Runnable{
	
	int sum = 0;
	
	synchronized void fun1() {
//		synchronized(this) {
			for(int i=0; i<10; i++) {
				sum += i;
			}
			
			this.notify();
//		}

	}

	@Override
	public void run() {
		fun1();
	}
}