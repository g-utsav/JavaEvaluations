package Unit5.W1.Question1.Deadlock;

public class ThreadA extends Thread{
	A a;
	B b;
	
	public ThreadA(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	public ThreadA() {
		super();
	}
	
	@Override 
	public void run() {
		a.funA(b);
	}
	
}
