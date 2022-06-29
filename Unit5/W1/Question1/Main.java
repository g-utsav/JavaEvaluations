package Unit5.W1.Question1;

/*Write a program that will result in a deadlock. How will you fix deadlock in Java show with
examples? And Explain about wait() and notify() method.

*wait() and notify() method :-> Say we have two threads lets call the first thread as Thread A which calculates the 
*sum of some data and the second thread called thread B which utilizes the sum of that data .
*
*Now as we dont have control over the excecution of thread and if we run both the threads normally we can get wrong answer
*the following things can happen
*   1)may be the thread B get the first chance of exection then thread B will take the sum value wich is not calculated
*   2)May be the thread A is running and thread-Scheduler may suspend the execution of thread A and start Executing Thread B
*   then Thread A can get the sum which is not complete 
*   3)May be the thread A completes the execution then only thread B will get its chance to execute in this case we get the 
*   correct value of sum
*   
*So in order to minimize the uncertainity in the execution we use wait an notify. These methods can only be called from a
*Synchronized block or method. 
*
*wait() method tells the thread to wait for the execution of the given thread and notify() method notify's the thread which is 
*wating for its execution.
*
*see waitNotify.java for example.
*
*
*
*
*
*
*
*
*Getting out of DeadLck
*
*We can get out of DeadLock By removing the Synchronization in any one of the methods of either class A or class B. if 
*we remove the synchronizaton from funA() of class A OR funB() of class B then we can avoid DeadLock
*
*
*
*/


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
