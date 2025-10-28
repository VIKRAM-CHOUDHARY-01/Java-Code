package Serialize;

import java.io.Serializable;

class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int Salary;
	Employee(String name, int Salary){
		this.name = name;
		this.Salary = Salary;
	}
}
