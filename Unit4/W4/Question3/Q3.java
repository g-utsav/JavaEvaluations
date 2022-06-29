package Unit4.W4.Question3;

import java.util.Scanner;

/*Q3)
1. What is the difference between Checked and Unchecked Exceptions in Java, create a user-defined
checked and unchecked exception class?
2. What is the difference between the throw and throws keyword in Java?

*
*  1) = > Difference between checked ans unchecked exception in java.
*  
*   Checked Exception are those Exception which are the direct child of Exception class and these
*   Exceptions need to be handeled in compile tme itself if not Handeled in compile time the 
*   compiller wont compile the code so in order to compile the code these checked Exceptions 
*   need to be handeled in the compile time .
*   
*   Unchecked Exceptions are those Exception which are the child of RuntimeException Class
*   these Exceptions may not be handeled in the Compile time .If these Exceptions are Not handeled
*   the compiler will compile the code without any obstruction but while in Runtime there 
*   may be an Exception  called RuntimeException and the program may Terminate 
*
*
*
*
*	2) => Difference between the throw and throws keyword in Java
*
*	throw keyword is used to throw an Exception where as throws is uesd in fuunction to mark them
*	as this function may thrown an exception of the give type
*
*	throw creates an Exception and inserts the exception in the current line 
*	throws marks the function as this function may raise and Exception so handle it
*
*
*/
public class Q3 {
	
	static void check(int i) throws CheckedException,UnCheckedException{
		if(i < 10) {
			throw new CheckedException("This is a user Defined Checked Exception");
		}else {
			throw new UnCheckedException("This is a user Defined UnChecked Exception");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number");
		try {
			check(sc.nextInt());
		}catch(CheckedException e) {
			System.out.println(e.getMessage());
		}catch(UnCheckedException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
