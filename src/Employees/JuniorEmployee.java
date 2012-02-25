package Employees;
/**
 * @author Thijmen Verkerk
 *
 * A junior employee is an employee with a standard pay raise of 5%
 */
public class JuniorEmployee extends Employee {
	/**
	* Constructor without a salary 
	* @param The employee name
	*/
	public JuniorEmployee(String name) {
		super(name);
	}
	/**
	* Constructor with a salary
	* @param The employee name
	* @param The initial Salary
	*/
	public JuniorEmployee(String name, double salary){
		super(name, salary);
	}
	/**
	* Raises the salary of the employee with 5% + 100
	*/
	public void raiseSalary() {
		this.salary = (this.salary * 1.05) + 100;
		this.logPayRaise();
	}
	/**
	* Prints the information of the employee.  
	*/
	public String printEmployeeInformation() {
		return "Junior Employee " + this.employeeName + " has salary " + this.salary;
	}
}
