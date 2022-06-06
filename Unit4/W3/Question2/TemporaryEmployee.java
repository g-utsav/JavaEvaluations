package Unit4.W3.Question2;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
//		this.calculateSalary();
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		this.salary = this.hoursWorked * this.hourlyWages;
	}
	
	
}
