package Employees;
/**
 * @author Thijmen Verkerk
 *
 * The abstract Employee class provides a way to simply add new employees without having to change any other classes
 */
public abstract class Employee {
	/**
	* Name of the employee
	*/
	protected String employeeName;
	/**
	* Current salary of the employee
	*/
	protected double salary;
	/**
	* Constructor without a salary 
	* @param The employee name
	*/
	public Employee(String name){
		this.employeeName = name;
		this.salary = 0;
	}
	/**
	* Constructor with a salary
	* @param The employee name
	* @param The initial Salary
	*/
	public Employee(String name, double salary){
		this.employeeName = name;
		this.salary = salary;
	}
	/**
	* Logs the pay raise for an employee 
	*/
	public void logPayRaise(){
		System.out.println("Log message: employee " + this.employeeName + " has new salary: " + this.salary);
	}
	/**
	* Raises the salary of an employee. 
	* Is implemented in each subclass
	*/
	public abstract void raiseSalary();
	/**
	* Prints the information of an employee. 
	* Is implemented in each subclass
	* 
	*/
	public abstract String printEmployeeInformation();
	/**
	* Function to check wether the name of the current object is the same as the name given as a parameter.
	* @param The name of the employee given by the user.
	*/
	public boolean checkName(String employeeName) {
		if(this.employeeName == employeeName)
			return true;
		else
			return false;
	}

}
