package Unit4.W3.Question2;

public abstract class Employee {

	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	abstract void calculateSalary();
	
	public Employee(int employeeId,  String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public Employee() {
		super();
	}
}
