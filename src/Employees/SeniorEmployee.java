package Employees;
/**
 * @author Thijmen Verkerk
 *
 * A senior employee is an employee with a standard pay raise of 7%
 */
public class SeniorEmployee extends Employee{
	/**
	* Constructor without a salary 
	* @param The employee name
	*/
	public SeniorEmployee(String name) {
		super(name);
	}
	/**
	* Constructor with a salary
	* @param The employee name
	* @param The initial Salary
	*/
	public SeniorEmployee(String name, double salary) {
		super(name, salary);
	}
	/**
	* Raises the salary of the employee with 7% 
	*/
	public void raiseSalary() {
		this.salary = (this.salary * 1.07);
		this.logPayRaise();
	}
	/**
	* Prints the information of the employee.  
	*/
	public String printEmployeeInformation() {
		return "Senior Employee " + this.employeeName + " has salary " + this.salary;
	}

}
