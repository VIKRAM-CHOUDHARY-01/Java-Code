package Map_Interface;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

class Employee{
	int empID;
	String empName;
	public Employee(int empID, String empName) {
		// TODO Auto-generated constructor stub
		this.empID = empID;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "empID :" + this.empID;
	}
}
public class TreeMapBasics5Comparator {
	
public static void main(String[] args) {
	Comparator<Employee> tmp = new Comparator<>() {
		@Override
		public int compare(Employee emp, Employee emp2) {
			return emp2.empID-emp.empID;
		}		
	};
	TreeMap<Employee, String> map = new TreeMap<>(tmp);
	map.put(new Employee(11, "Vikram"), null);
	map.put(new Employee(1, "Heart"), null);
	map.put(new Employee(110, "Maybe"), null);
	map.put(new Employee(101, "Yours"), null);
	
	for(Entry<Employee, String> et: map.entrySet()) {
		System.out.println(et.getKey() + "\t" + et.getValue());
	}
	
	
}
}
