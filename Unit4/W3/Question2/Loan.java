package Unit4.W3.Question2;

public class Loan {
	
	private Loan() {
		super();
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
			return (0.15 *  employeeObj.salary);
		}else if(employeeObj instanceof TemporaryEmployee) {
			return (0.1 * employeeObj.salary);
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PermanentEmployee pe = new PermanentEmployee(123, "ABC", 100000);
		pe.calculateSalary();
		
		TemporaryEmployee te = new TemporaryEmployee(456, "DEF", 10, 100);
		te.calculateSalary();
		
		Loan loan = new Loan();
		
		double loanForPermanentEmployee = loan.calculateLoanAmount(pe);
		double loanForTemporaryEmployee = loan.calculateLoanAmount(te);
		double loanForNull = loan.calculateLoanAmount(null);
		 
		System.out.println("Loan For Permanent Employee : "+loanForPermanentEmployee);
		System.out.println("Loan For Temporary Employee : "+loanForTemporaryEmployee);
		System.out.println("Loan For Null"+loanForNull);
		
	}

}
