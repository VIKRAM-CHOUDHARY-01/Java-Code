package com.Java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Stu1{
	private String name;
	private int id;
	Stu1(String name, int id){
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Stu1 [name=" + name + ", id=" + id + "]";
	}
	
}
public class FuntctionInterfaceBasic2 {
public static void main(String[] args) {

	
	Function <String,String> vipTrim = s ->s.toLowerCase().substring(0,3);
	
	
	Function<List<Stu1>, List<Stu1>> vipStu1 = s ->{
		List<Stu1> result = new ArrayList<>();
		for(Stu1 s1 : s) {
			if(vipTrim.apply(s1.getName()).equals("vip")) {
				result.add(s1);
			}	
			
		}
		return result;
	};
	
	Stu1 s1 = new Stu1("Vikram", 1);
	Stu1 s2 = new Stu1("Vipul", 2);
	Stu1 s3 = new Stu1("Vipram", 3);
	
	
	
	List<Stu1> pass = Arrays.asList(s1,s2,s3);
	System.out.println(vipTrim.apply(s1.getName()));
	System.out.println(vipStu1.apply(pass));
}
}
