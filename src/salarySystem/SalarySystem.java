package salarySystem;
import java.util.ArrayList;
import java.util.List;

import Employees.Employee;

public class SalarySystem {
	
	private List<Employee> allEmployees = new ArrayList<Employee>();
	
	public void addColleague(Employee c) {
		allEmployees.add(c);
	}
	
	public void raiseSalary(String employeeName) {
		Employee selectedEmployee = null;
		for (int i = 0; i < allEmployees.size(); i++){
			selectedEmployee = allEmployees.get(i);
			if (selectedEmployee.checkName(employeeName)){
				selectedEmployee.raiseSalary();				
			}
		}
	
	}
	
	public SalarySystem() { }
	
	public void printAll() {
		for (Employee e : allEmployees) {
			System.out.print(e.printEmployeeInformation() + "\n");
		}
	}
	
}


