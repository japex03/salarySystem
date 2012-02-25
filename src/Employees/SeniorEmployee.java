package Employees;

public class SeniorEmployee extends Employee{

	public SeniorEmployee(String name) {
		super(name);
	}
	
	public SeniorEmployee(String name, double salary) {
		super(name, salary);
	}
	
	public void raiseSalary() {
		this.salary = (this.salary * 1.07);
		this.logPayRaise();
	}
	
	public String printEmployeeInformation() {
		return "Senior Employee " + this.employeeName + " has salary " + this.salary;
	}

}
