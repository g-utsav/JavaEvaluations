package Unit4.W3.Question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	static Customer setDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User Name : ");
		String username = sc.next();
		String regex = "[a-zA-Z]{"+username.length()+"}";
		if(!(Pattern.matches(regex, username) && username.length() >=3 && username.length() <= 8)) {
			System.out.println("Invalid User Name");
			return null;
		}
		
		System.out.println("Enter Password : ");
		String pass = sc.next();
		regex = "[a-zA-Z0-9]{"+pass.length()+"}";
		if(!(Pattern.matches(regex, pass) && username.length() >=3 && username.length() <= 8)) {
			System.out.println("Invalid Password");
			return null;
		}

		System.out.println("Enter Mobile Nulber : ");
		String num = sc.next();
		if(!(Pattern.matches("[6789]{1}[0-9]{9}", num))) {
			System.out.println("Invalid Mobile Number");
			return null;
		}
		
		System.out.println("Enter Email id : ");
		String email = sc.next();
					
		return new Customer(username, pass, num, email);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("[a-zA-Z]{3}", "abcd"));		
		
		Customer c = Demo.setDetails();
		
		if(c instanceof Customer) {
			System.out.println("User Name : "+c.getUsername());
			System.out.println("Mobile Number : "+c.getMobileNumber());
			System.out.println("Password : "+c.getPassword());
			System.out.println("Email : "+c.getEmail());
		}
	}

}
