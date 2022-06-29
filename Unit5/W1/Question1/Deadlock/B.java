package Unit5.W1.Question1.Deadlock;

public class B {
	synchronized void funB(A a) {//If we remove the synchronized keyword from this method or the method of class A then
		//We can avoid DeadLock
		a.funA1();;
	}
	
	void funB1() {
		System.out.println("Inside funB1()");
	}
}
