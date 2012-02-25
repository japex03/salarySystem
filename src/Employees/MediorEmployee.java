package Employees;
/**
 * @author Thijmen Verkerk
 *
 * A medior employee is an employee with a standard pay raise of 6%
 */
public class MediorEmployee extends Employee {
	/**
	* Constructor without a salary 
	* @param The employee name
	*/
	public MediorEmployee(String name) {
		super(name);
	}
	/**
	* Constructor with a salary
	* @param The employee name
	* @param The initial Salary
	*/
	public MediorEmployee(String name, double salary) {
		super(name, salary);
	}
	/**
	* Raises the salary of the employee with 6% + 100
	*/
	public void raiseSalary() {
		this.salary = (this.salary * 1.06) + 100;
		this.logPayRaise();		
	}
	/**
	* Prints the information of the employee.  
	*/
	public String printEmployeeInformation() {
		return "Medior Employee " + this.employeeName + " has salary " + this.salary;
	}

}
