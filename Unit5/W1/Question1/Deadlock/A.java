package Unit5.W1.Question1.Deadlock;

public class A {

	synchronized void funA(B b) {//If we remove the synchronized keyword from this method or the method of class B then
		//We can avoid DeadLock
		b.funB1();
	}
	
	void funA1() {
		System.out.println("Inside funA1()");
	}
	
}
