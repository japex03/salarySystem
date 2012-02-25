package Employees;
public class JuniorEmployee extends Employee {
		
	public JuniorEmployee(String name) {
		super(name);
	}
	
	public JuniorEmployee(String name, double salary){
		super(name, salary);
	}
	
	public void raiseSalary() {
		this.salary = (this.salary * 1.05) + 100;
		this.logPayRaise();
	}
	
	public String printEmployeeInformation() {
		return "Junior Employee " + this.employeeName + " has salary " + this.salary;
	}
}
