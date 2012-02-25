package salarySystem;
/**
 * @author Thijmen Verkerk
 *
 * The salary system keeps track of all employees and handles there representation and pay raises.
 */
import java.util.ArrayList;
import java.util.List;

import Employees.Employee;

public class SalarySystem {
	/**
	 * Arraylist of all employees in the system.
	 * 
	 */
	private List<Employee> allEmployees = new ArrayList<Employee>();
	/**
	 * Function to add an employee to the arraylist.
	 * @param Employeeobject
	 */
	public void addColleague(Employee c) {
		allEmployees.add(c);
	}
	/**
	 * Function to raise the salary of a employee with the given name.
	 * Calls the function checkName to check wether it is the right employee object.
	 * @param employeeName
	 */
	public void raiseSalary(String employeeName) {
		Employee selectedEmployee = null;
		for (int i = 0; i < allEmployees.size(); i++){
			selectedEmployee = allEmployees.get(i);
			if (selectedEmployee.checkName(employeeName)){
				selectedEmployee.raiseSalary();				
			}
		}
	
	}
	/**
	 * Constructor
	 */
	public SalarySystem() { }
	/**
	 * print the information of all employees.
	 */
	public void printAll() {
		for (Employee e : allEmployees) {
			System.out.print(e.printEmployeeInformation() + "\n");
		}
	}
	
}


