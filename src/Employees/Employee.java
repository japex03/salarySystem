package Employees;
// Alle getters geeft teveel weer van de interne structuur van het object.
//Kan beter met een super klasse employee en sub klassen voor elke soort medewerker
public abstract class Employee {
	protected String employeeName;
	protected double salary;
	
	public Employee(String name){
		this.employeeName = name;
		this.salary = 0;
	}
	
	public Employee(String name, double salary){
		this.employeeName = name;
		this.salary = salary;
	}
	
	public void logPayRaise(){
		System.out.println("Log message: employee " + this.employeeName + " has new salary: " + this.salary);
	}
	
	public abstract void raiseSalary();
	
	public abstract String printEmployeeInformation();

	public boolean checkName(String employeeName) {
		if(this.employeeName == employeeName)
			return true;
		else
			return false;
	}

}
