package Unit4.W3.Question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number of elements in the array : ");
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			System.out.println("Enter the Elements in the Array : ");
			for(int i =0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter the index of the array element you want to access : ");
			System.out.println(arr[sc.nextInt()]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.toString());
		}catch(NumberFormatException nf) {
			System.out.println(nf.toString());
		}catch(InputMismatchException i) {
			System.out.println(i.toString());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
