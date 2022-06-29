package Unit4.W4.Question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter Date of Birth in dd-MM-yyyy format : ");
			String dob = sc.nextLine();
			
			LocalDate ld = LocalDate.parse(dob, formatObj);
			
			LocalDate now = LocalDate.now();
			
			Period period = Period.between(ld, now);
			
			int year = period.getYears();
			int days = period.getDays();
			int month = period.getMonths();
			
			if(year < 0 || days < 0 || month < 0) {
				System.out.println("Date of birth should not be in future");
			}else if(year >= 18){
				if(days == 0 && month == 0) {
					System.out.println("Happy Birthday, You are eligible to cast your vote.");
				}else {
					System.out.println("You are eligible to cast your vote");
				}
			}else if(year < 18) {
				System.out.println("You are not eligible to caste your vote");
			}
			
		}catch(DateTimeParseException dtpe) {
			System.out.println("please pass the date in the proper format");
		}catch(Exception e) {
			System.out.println("please pass the date in the proper format");			
		}
		
		sc.close();
		
	}

}
