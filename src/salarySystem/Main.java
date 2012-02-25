package salarySystem;
import Employees.Employee;
import Employees.JuniorEmployee;
import Employees.MediorEmployee;
import Employees.SeniorEmployee;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final SalarySystem salarySystem = new SalarySystem();
		final Employee junior = new JuniorEmployee("Jaap", 1700.0);
		final Employee medior = new MediorEmployee("Fred", 2000);
		final Employee senior = new SeniorEmployee("Hans", 2300);
		salarySystem.addColleague(junior);
		salarySystem.addColleague(medior);
		salarySystem.addColleague(senior);
		
		salarySystem.printAll();
		
		
		salarySystem.raiseSalary("Jaap");
		salarySystem.raiseSalary("Fred");
		salarySystem.raiseSalary("Hans");
		salarySystem.printAll();		
	}

}
