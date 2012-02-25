package Employees;

public class MediorEmployee extends Employee {

	public MediorEmployee(String name) {
		super(name);
	}
	
	public MediorEmployee(String name, double salary) {
		super(name, salary);
	}

	public void raiseSalary() {
		this.salary = (this.salary * 1.06) + 100;
		this.logPayRaise();		
	}

	public String printEmployeeInformation() {
		return "Medior Employee " + this.employeeName + " has salary " + this.salary;
	}

}
