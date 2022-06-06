package Unit4.W3.Question2;

public class PermanentEmployee extends Employee{

	private double basicPay;

	public PermanentEmployee(int employeeId,  String employeeName, double basicPay) {
		super(employeeId , employeeName);
		this.basicPay = basicPay;
//		this.calculateSalary();
	}

	@Override
	void calculateSalary() {
		double pf = 0.12 * this.basicPay;
		this.salary = this.basicPay - pf;
	}
	
	
	
}
