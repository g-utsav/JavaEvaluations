package Unit5.W1.Question2;

import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address("West Bengal", "Siliguri","734010");
		
		Employee emp = new Employee("123456", "Ram", address, "example@example.com", "password123");
		
		try {
			FileOutputStream fos = new FileOutputStream("src//Unit5//W1//Question2//emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(emp);
			
			System.out.println("Serialization of Employee Object done");
			
			
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//De-Serilazation
		
		
		try {
			FileInputStream fis = new FileInputStream("src//Unit5//W1//Question2//emp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee reGenEmp = (Employee) ois.readObject();
			
			System.out.println(reGenEmp);
			
			System.out.println("De-Serilization of Employee Object Done");
			
			
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
