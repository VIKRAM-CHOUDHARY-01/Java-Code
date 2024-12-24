import java.util.*;
/*
Q01 single level inheritance :
        A 
            method1 :no return and no argument 
            method2:no return and  argument 


        B 
            method3: return and no argument 

            method4: return and  argument 

        access child through :A child class  
*/
//     class A{
//     void show(){
//         System.out.println("Hello!, I am in Class A");
//     }
//     void argu(int a){
//         System.out.println("Hello!, I am in Class A, Your Argument is : " + a);
//     }
// }
// class B extends A{
//     int Age(){
//         return 10;
//     }
//     int showInB(int a){
//         return a;
//     }
// }


/*
Q.2
A 
instance variable 
method through value passes then two number addition 

B
instance variable 
method through value passes then two number substraction 

access child through

 */

// class Insta{
//     int a;
//     int b;
//     int add(int a, int b){
//         this.a = a;
//         this.b = b;
//         return a+b;
//     }
// }

// class Subsa extends Insta{
//     int c;
//     int d;
//     int sub(int c, int d){
//         this.c = c;
//         this.d = d;
//         return c-d;
//     }
// }

/*
Q3
A 
	default constructor :print 

B 
	default constructor :print 

access child through

 */
// class A{
//     public A(){
//         System.out.println("Hello, I am in Constructor of A class");
//     }
// }
// class B extends A{
//     public B(){
//         System.out.println("Hello, I am in Constructor of B class");
//     }

// }

/*
Q4

A 
	default constructor :two number multiplication :user input 

B 
	default constructor :two number divide :user input 
access child through

*/


// class A{
//     public A(){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter a Number : ");
//         int a = sc.nextInt();
//         System.out.println("Enter a Number : ");
//         int b= sc.nextInt();
//         System.out.println("Multiplication of two number is : "+a*b);
        
//     }
// }

// class B extends A{
//     public B(){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter a Number : ");
//         int c = sc.nextInt();
//         System.out.println("Enter a Number : ");
//         int d= sc.nextInt();
//         System.out.println("Multiplication of two number is : "+c/d);

//     }
// }

/*
Q.5
A 
	instance variable :private 
	getter and setter method 

B 
	instance variable :private 
	getter and setter method

access child through

*/

// class A {
//     private int a;
//     void setA(int a){
//         this.a=a;
//     }
//     int getA(){
//         return a;
//     }
// }
// class B extends A{
//     private int b;
//     void setB(int b){
//         this.b = b;
//     }
//     int getB(){
//         return b;
//     }
// } 

/*
Q.6
A 
	method1

B 
	method2

C
	method3
	object :A  
	method5 :return and argument 

D 
	method4
		object :B 

access 
*/
// class A{
//     void method1(){
//         System.out.println("method1 of A");
//     }
// }
// class B extends A{
//     void method2(){
//         System.out.println("Method of B");
//     }
// }
// class C extends B{
//     void method3(){
//         method1();        
//      }
//      int method5(int age){
//      return age;
//      }
// }
// class D extends C {
//     void method4(){
//         B obj = new B();
//     }
// } 

/*
Q.7
A 
	m1

	m2
	
	m3

	m4

	m5 
method chaining 
*/
// class A{
//     void m1(){
//         System.out.println("Method1");
//     }
//      void m2(){
//         System.out.println("Method2");
//         m3();
//     }
//      void m3(){
//         System.out.println("Method3");
//         m4();
//     }
//      void m4(){
//         System.out.println("Method4");
//         m5();
//     }
//      void m5(){
//         System.out.println("Method5");
//         m1();
//     }
// }


/*
Q.8
single level inheritance :

A 
	m1

	m2
method chaining 

B 
	
	m3

	m4
method chaining 

	m5 
	A class object call krna 

child k through access all property 
*/

// class A{
//     private int c=0;
//     void m1(){
//         System.out.println("Class A : Method1");
//         c++;
//         if(c<2){
//             m2();
//         }
        
//     }
//     void m2(){
//         System.out.println("Class A : Method2");
//         c++;
//         if(c<2){
//             m1();
//         }
//     }
// }

// class B extends A{
//     private int cn = 0;
//     void m3(){
//         System.out.println("Class B : method3");
//         cn++;
//         if(cn<2){
//             m4();
//         }
       
//     }
//     void m4(){
//         System.out.println("Class B : method4");
//          cn++;
//         if(cn<2){
//             m3();
//         }  
//     }
//     void m5(){
//         A ob = new A();
//         ob.m1();
//     }
// }

/*
Q.9 
multilevel inheritance :
A 
	method1

B 
	method2 

C
	method3

D
	method4 
child k through access 
*/
// class A{
//     void m1(){
//         System.out.println("Class A : Method1");
//     }
// }
// class B extends A{
//     void m2(){
//         System.out.println("Class B : Method2");
//     }
// }

// class C extends B{
//     void m3(){
//         System.out.println("Class C : Method3");
//     }
// }
// class D extends C{
//     void m4(){
//         System.out.println("Class D : Method4");
//     }
// }

/*
Q10
multilevel inheritance :
A 
	method1 :return and argument :covariant 

B 
	method2 :return and no argument 

C
	method3:no return and no argument 

D
	method4 :no return and argument 

child k through access 
*/

// class A{
//     A m1(int age){
//         System.out.println("Age in class A m1 method : " + age);
//         return this;
//     }
// }
// class B extends A{
//     int m2(){
//         return 34;
//     }
// }
// class C extends B{
//     void m3(){
//         System.out.println("Class C");
//     }
// }
// class D extends C{
//     void m4(String name){
//         System.out.println("The name in Class D is : " + name);
//     }
// }

/*
Q11
getter and setter method :
multilevel inheritance :
A 
	method1

B 
	method2 

C
	method3

D
	method4 
child k through access 
*/
// class A{
//     private String name;
//     void setPerName(String name){
//         this.name = name;
//     }

//     String getPerName(){
//         return name;
//     }
// }
// class B extends A{
//     private int age;
//     void setAge(int age){
//         this.age =age;
//         }
//     int getAge(){
//         return age;
//     }
// }
// class C extends B{
//     private int marks;
//     void setMarks(int marks){
//         this.marks = marks;
//         }
//     int getMarks(){
//         return marks;
//     }
// }
// class D extends C{
//     private String address;
//     void setAdd(String address){
//         this.address = address;
//     }
//     String getAdd(){
//         return address;
//     }
// }

/*
Q12
multilevel inheritance :normal statement 
A 
	default constructor 

B
	default constructor 

C 
	default constructor 

child k through access
*/
// class A{
//     public A(){
//         System.out.println("Class A");
//     }
// }
// class B extends A{
//     public B(){
//         System.out.println("Class B");
//     }
// }
// class C extends B{
//     public C(){
//         System.out.println("Class C");
//     }
// }

/*
Q13
multilevel inheritance :
A 
	default constructor :user input add 

B
	default constructor :user input :multiplication 

C 
	default constructor :normal statement 

child k through access 
*/
// class A {
//     public A(){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter Number : ");
//         int a = sc.nextInt();
//         System.out.println("Enter Number : ");
//         int b= sc.nextInt();
//         System.out.println("The Add : " + (a+b));
//     }
// }
// class B extends A{
//     public B(){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter Number : ");
//         int c = sc.nextInt();
//         System.out.println("Enter Number : ");
//         int d= sc.nextInt();
//         System.out.println("The Add : " + c*d);
//     }
// } 
// class C extends B{
//     public C(){
//         System.out.println("It's the end from Class C");
//     }
// }

/*
Q14
hrough single level inheritance 

A
	instance variable 

B 
	access
*/
// class A{
//     int a =12;
// }
// class B extends A{
//     void display(){
//         System.out.println("Instance Varivable Accessed in Class B : " +  a);
//     }
// }

/*
Q15
through single level inheritance 

A
	private instance variable 

B 
	access
*/
// class A {
//     private int a=22;
//     int getA(){
//         return a;
//     }
// }
// class B extends A{
//     void show(){
//         System.out.println("Private Instance in Class B by using getters in class A : " + getA());
//     }
// }

/*
Q16
through single level inheritance 

A
	public variable 

B 
	access
*/

// class A{
//     public int a =23;

// }
// class B extends A{
//     void display(){
//         System.out.println("Public Variable of Class A is accessed in class B : " + a);
//     }

// }

/*
Q17
through single level inheritance 

A
	protected variable 

B 
	access
*/

class A{
    protected int num =23;
}
class B extends A{
    void show(){
        System.out.println("Protacted Variable of Class A is accessed in Class B : "+ num);
    }
}
public class InheritanceAssign24_12_24{
    public static void main(String [] arge ){

        //Q.1
        // B obj = new B();
        // obj.show();
        // obj.argu(10);
        // System.out.println(obj.Age(););
        // System.out.println(obj.showInB(20));

        //Q2
        // Subsa op = new Subsa();
        // System.out.println("The Addition : " + op.add(5,10));
        // System.out.println("The Substraction : " + op.sub(10,5));

        //Q3
            // B obj = new B();

        //Q4
            // B obj = new B();
        
        //Q5
            // B obj = new B();
            // obj.setA(23);
            // System.out.println("Geter from Class A : " + obj.getA()); 
            // obj.setB(25);
            // System.out.println("Geter from Class B : " + obj.getB());  

        //Q6

            // D cal = new D();
            // cal.method1();
            // cal.method2();
            // cal.method3();
            // System.out.println(cal.method5(5));
            // cal.method4();

        //Q7

            // A obj = new A();
            // obj.m2();
        
        //Q8
            // B obj = new B();
            // obj.m5();
            // obj.m3();

        //Q9
            // D obj = new D();
            // obj.m1();
            // obj.m2();
            // obj.m3();
            // obj.m4();

        //Q10

            // D obj = new D();
            // System.out.println(obj.m1(45));
            // System.out.println(obj.m2());
            // obj.m3();
            // obj.m4("Vikram");

        //Q11

            // D obj = new D();
            // obj.setPerName("Vikram");
            // System.out.println(obj.getPerName());
            // obj.setAge(21);
            // System.out.println(obj.getAge());
            // obj.setMarks(90);
            // System.out.println(obj.getMarks());
            // obj.setAdd("Jaipur");
            // System.out.println(obj.getAdd());

        //Q12

            // C ob = new C();

        //Q13
        
            //  C obj = new C();

        //Q14

            // B ob = new B();
            // ob.display();

        //Q15

            // B obj = new B();
            // obj.show();  

        //Q16

            // B ob = new B();
            // ob.display();
    
        //Q17

            B obj = new B();
            obj.show();

    }

}