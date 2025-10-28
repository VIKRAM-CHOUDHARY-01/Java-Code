package Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String empName;
	int salary;
	Employee(String empName, int salary){
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}
public class ComparatorUsage {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Vikram", 500000);
		Employee e2 = new Employee("Roland", 100000);
		Employee e3 = new Employee("Ronak", 100);
		Employee e4 = new Employee("Shakti", 10000);
		ArrayList<Employee> arr =  new ArrayList<>();
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		arr.add(e4);
		
		Comparator<Employee> empComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.salary>emp2.salary?1:-1;
			}
		};
		
		System.out.println(arr);
		System.out.println("-----------------------------------------\n");
		Collections.sort(arr, empComparator);
		System.out.println(arr);
		System.out.println("-----------------------------------------\n");
		Collections.sort(arr, empComparator.reversed());
		System.out.println(arr);
		
		
		}

}
