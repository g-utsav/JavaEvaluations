package Unit4.W3.Question3;

import java.util.Scanner;

public class Demo {

	void showDetails(Month m){
		m.monthDetails();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month Name : ");
		String name = sc.next();
		
		try {
			Month month = Month.valueOf(name);
			
			Demo d = new Demo();
			d.showDetails(month);
		}catch(IllegalArgumentException ie) {
			System.out.println("Invalid Month Name");
		}catch(Exception e) {
			System.out.println("Invalid ");
		}
		sc.close();
	}
	
}
