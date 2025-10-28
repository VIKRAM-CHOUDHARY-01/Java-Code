package com.Java8.features;

@FunctionalInterface
interface Hello{
	void sayHello();
}
public class LambdaExpression {
public static void main(String[] args) {
	Hello h = ()->{
		System.out.println("Nice Hello");
	};
	h.sayHello();	
	
}
}

/* Java 8 Features -> Class:1 (23/07/25)
 * 
 * JAVA 8 [2014]
 * 
 * 
 * Lambda Expression
 * Q.1 What is Lambda Expression?
 * Ans: It is an Anonymous function. The Anonymous function is nameless function.
 * 		
 * 		1) It was introduced in jdk 1.8
 * 		2) Non Name
 * 		3) No Modifier
 * 		4) No Return Type
 * 		
 * Q.2 What are the benefits of the lambda Expression?
 * Ans: 1) To enable functional programming in java.
 * 		2) To write more Readable and maintainable and clear concise code.
 * 		3) to use API  in easily and effective manner
 * 		4) to enable parallel Processing.
 * 
 * 
 * Q.3 How to write Lambda Expression?
 * Ans: Syntax of Lambda Expression :-
 * 		
 * 		(parameters) -> {Statements};
 * 		1) parameters :- it is just similar to method parameters. please be informed that they are just optional.
 * 						if there is only one parameter and you can also omit the paranthesis.
 * 		2) Arrow Operator (->) : It separates the parameters from the body of the lambda expression.
 * 		3) Body  : 	It is to write the implementation code.
 * 
 * 
 * 		Note :- If you have one line of code in lambda Expression, the curly braces are Optional.
 * 				Eg : ()-> {System.out.println("hEELO");};
 * 					:  () -> System.out.println("hEELO");
 * 
 * 
 * 		Note :- Based on the context, The Compiler can able to recognize of the data type of the
 * 				parameters. so the datatypes in the parameters are also optional.
 * 				
 * 			Eg: (int a, int b) -> System.out.println(a + b);
 * 			  :   (a,b) -> System.out.println(a + b);	
 * 
 * 		
 * 		Eg : public int getLength(String s){
 * 				return s.length();
 * 			}
 * 
 * 			Format 1 : (String s) -> {return s.length();};
 * 			Format 2 : (String s) -> return s.length();
 * 			Format 3 : (s) -> return s.length();
 * 
 * 			Note: If you are keeping only one line of code and if that line of code is the
 * 				return statement, then the return keyword is optional and the paranthesis of 
 * 				lambda Expression is also optional.
 * 			Thus :
 * 			Format 4 : (s)-> s.length();
 * 
 * 			Note : If you are passing only one parameter, then paranthesis are also optional,
 * 					you can remove the paranthesis.
 * 			Thus :
 * 			Format 5 : s -> s.length();
 * 
 * 		
 * 
 * 
 * */
