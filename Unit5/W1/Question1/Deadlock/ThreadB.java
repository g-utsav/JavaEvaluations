package Unit5.W1.Question1.Deadlock;

public class ThreadB extends Thread{

	A a;
	B b;
	
	public ThreadB(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	public ThreadB() {
		super();
	}
	
	@Override 
	public void run() {
		b.funB(a);
	}
}
