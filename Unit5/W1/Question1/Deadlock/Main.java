package Unit5.W1.Question1.Deadlock;

/*Getting out of DeadLck
*
*We can get out of DeadLock By removing the Synchronization in any one of the methods of either class A or class B. if 
*we remove the synchronizaton from funA() of class A OR funB() of class B then we can avoid DeadLock
*
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		B b = new B();
		
		ThreadA ta = new ThreadA(a,b);
		ThreadB tb = new ThreadB(a,b);
		
		ta.start();
		tb.start();
		
	}

}
