package com.Java8.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class EmployeeClass {
	private String name;
	private String department;
	private double salary;

	EmployeeClass(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name : " + this.name + "  Department : " + this.department + " Salary : " + this.salary;

	}

}

public class Java8_Test {
	public static void main(String[] args) {
		// Q.1 Write a Java 8 program to print all even numbers from a list using
		// Streams.
		List<Integer> li = Arrays.asList(2, 3, 54, 678, 4, 323, 5, 674, 2, 35, 7, 9, 5);
		List<Integer> evenNumbers = li.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

		// Q2 Given a list of strings, write code to filter out empty strings and print
		// the remaining.
		List<String> st = Arrays.asList(" ", "dgh", " dsg sdg", " ");
		List<String> nonEmpty = st.stream().filter(s -> s != " ").collect(Collectors.toList());
		System.out.println(nonEmpty);

		// Q.3 Write a Java 8 program to find the maximum and minimum in a list using
		// Streams.

		List<Integer> nums = Arrays.asList(13, 5, 7, 5, 3, 5, 67, 3, 2, 646, 3, 5, 6, 8, 0, 4, 3, 2, 5, -4, 6);
		Optional<Integer> minNum = nums.stream().min(Comparator.naturalOrder());
		System.out.println(minNum);

		Optional<Integer> max = nums.stream().max((n1, n2) -> Integer.compare(n1, n2));
		System.out.println(max);

		// Q.4 Write a Java 8 program to count the number of occurrences of each word in
		// a list.
		List<String> str = Arrays.asList("Hello", "nice", "Hello");
		int occurrence = (int) str.stream().filter(s -> s == "Hello").count();
		System.out.println(occurrence);

		// Q5 Convert a list of names into uppercase using Stream API.
		List<String> st2 = Arrays.asList("vikram", "nice", "guy", "actually", "great", "Guy.");
		List<String> upper = st2.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upper);

		// Q.6 From a list of employees (name, department, salary), find the
		// department-wise average salary using Streams.
		EmployeeClass emp1 = new EmployeeClass("Vikram", "Developement", 4500000.0d);
		EmployeeClass emp2 = new EmployeeClass("Prem", "Manager", 500000.0d);
		EmployeeClass emp3 = new EmployeeClass("Noman", "Finance", 7500000.0d);
		EmployeeClass emp4 = new EmployeeClass("Lakahsy", "Developement", 7500000.0d);
		EmployeeClass emp5 = new EmployeeClass("Ronak", "Manager", 3600000.0d);
		EmployeeClass emp6 = new EmployeeClass("Jeetu", "Finance", 4700000.0d);
		EmployeeClass emp7 = new EmployeeClass("Parsoon Bidua", "Developement", 46700000.0d);
		EmployeeClass emp8 = new EmployeeClass("Sita", "Developement", 5300000.0d);
		EmployeeClass emp9 = new EmployeeClass("Ravi", "Manager", 2100000.0d);
		EmployeeClass emp10 = new EmployeeClass("Anuj", "Finance", 5800000.0d);
		EmployeeClass emp11 = new EmployeeClass("Arvind", "Developement", 6100000.0d);
		EmployeeClass emp12 = new EmployeeClass("Manoj", "Manager", 3300000.0d);
		EmployeeClass emp13 = new EmployeeClass("Alok", "Finance", 4500000.0d);
		EmployeeClass emp14 = new EmployeeClass("Neha", "Developement", 6700000.0d);
		EmployeeClass emp15 = new EmployeeClass("Kriti", "Manager", 2500000.0d);
		EmployeeClass emp16 = new EmployeeClass("Vikas", "Finance", 7200000.0d);
		EmployeeClass emp17 = new EmployeeClass("Chandresh", "Developement", 8000000.0d);
		EmployeeClass emp18 = new EmployeeClass("Tanu", "Manager", 2800000.0d);
		EmployeeClass emp19 = new EmployeeClass("Rohit", "Finance", 6200000.0d);
		EmployeeClass emp20 = new EmployeeClass("Suraj", "Developement", 7100000.0d);

		List<EmployeeClass> employeeData = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10,
				emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20);

		Map<String, List<EmployeeClass>> groupBy = employeeData.stream()
				.collect(Collectors.groupingBy(EmployeeClass::getDepartment));

		Map<String, Double> avgSalaryByDept = groupBy.entrySet().stream().collect(Collectors.toMap(
				Map.Entry::getKey,
				entry -> entry.getValue().stream().collect(Collectors.averagingDouble(EmployeeClass::getSalary))));

		System.out.println(avgSalaryByDept);
	}
}
