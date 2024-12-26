import java.util.*;
//Assignment - 25/12/24 

  /* Q.1
    heirarichal inheritance : 
    A 
    	method1 :no return and no argument  
    B 
    	method2: return and no argument  

    C
    	method3: return and  argument  

    D
    	method4:no return and  argument  

    E 
    	method5 :covariant
        */

        //    class A{
        //     void method1(){
        //         System.out.println("I am in class A method 1");
        //     }
        //    }
        //    class B extends A{
        //     int method2(){
        //         System.out.println("I am in class B method 2");
        //         return 0;
        //     }
        //    }

        //    class C extends A{
        //         int method3(int as){
        //             System.out.println("I am in class C method3 : " + as);
        //             return as;
        //         }
        //    }
        //    class D extends A{
        //     void method4(int ab){
        //         System.out.println("I am in class D method 4 : " + ab);
        //     }
        //    }

        //    class E extends A{
        //     E method5(){
        //         return this;
        //     }
        //    }


  /*
     Q2
         heirarichal inheritance : 
            A
            add method 

            B

            C

            D
            every have default constructor 
         */

        // class A{
        //     void add(){
        //         Scanner sc =new Scanner(System.in);
        //         System.out.println("Enter Number : ");
        //         int a = sc.nextInt();
        //         System.out.println("Enter Number : ");
        //         int b = sc.nextInt();
        //         System.out.println("The Addition : " + (a+b));
        //     }
        // }
        // class B extends A{
        //     B(){
        //         System.out.println("In the Constructor of B class");
        //     }
        // }
        // class C extends A{
        //     C (){
        //         System.out.println("In the Constructor of C class");
        //     }
        // }
        // class D extends A{
        //     D(){
        //         System.out.println("In the constructor of D class");
        //     }
        // }

  /*
    Q3
    

        A

        B

        C

        D
        getter and setter 

      */

        // class A{
        //     private int a;
        //     public void setA(int a){
        //         this.a = a;
        //     }
        //     public int getA(){
        //         return a;
        //     }
        // }
        // class B extends A{
        //     private int b;
        //     public void setB(int b){
        //         this.b=b;   
        //     }
        //     public int getB(){
        //         return b;
        //     }
        // }
        // class C extends A{
        //     private int c;
        //     public void setC(int c){
        //         this.c = c;
        //     }
        //     public int getC(){
        //         return c;
        //     }
        // }
        // class D extends A{
        //     private int d;
        //     public void setD(int d){
        //         this.d = d;
        //     }
        //     public int getD(){
        //         return d;
        //     }
        // }

  /*Q4
        heirarichal inheritance : 
        A
            instance variable (four variable )

        B
        two instance variable access of A class variable 

        C
        two instance variable access of A class variable 

        D
        anyone access 
        */

        // class A{
        //     private String name;
        //     private int age;
        //     private double salary;
        //     private String address;

        //     public void setName(String name){
        //         this.name =name;
        //     }
        //     public String getName(){
        //         return name;
        //     }

        //     public void setAge(int age){
        //         this.age = age;
        //     }
        //     public int getAge(){
        //         return age;
        //     }
        //     public void setSalary(double salary){
        //         this.salary = salary;
        //     }
        //     public double getSalary(){
        //         return salary;
        //     }
        //     public void setAddress(String address){
        //         this.address = address;
        //     }
        //     public String getAddress(){
        //         return address;
        //     }

        // }

        // class B extends A{
        //     void show(){
        //     setName("Vikram");
        //     System.out.println("The name Name Instance Variable access from B class : " + getName());
        //     setAge(25);
        //     System.out.println("The age Instance Variable access from B class : " + getAge());
            
        //     }
        // }

        // class C extends A{
        //     void display(){
        //         setSalary(50000);
        //         System.out.println("The salary Instance Variable access from C class : " + getSalary());
        //         setAddress("Jaipur");
        //         System.out.println("The address Instance Variable access from C class : " + getAddress());
        //     }
        // }

        // class D extends A{
        //     void show(){
        //         System.out.println("The name Instance Variable access from D class : " + getName());
        //         System.out.println("The age Instance Variable access from D class : " + getAge());
        //         System.out.println("The salary Instance Variable access from D class : " + getSalary());
        //         System.out.println("The address Instance Variable access from D class : " + getAddress());

        //     }
        // }

   /*Q5

        heirarichal inheritance : 
        A
            m1
            m2
            m3
        B
            m4
            m5
            m6

        C
            m7
            m8 

        D
            jo tumhara mn ho 

        method chaining 
           */

        // class A{
        //     void m1(){
        //         System.out.println("Class A Method 1");
        //     }
        //     void m2(){
        //         System.out.println("Class A Method 2");
        //     }
        //     void m3(){
        //         System.out.println("Class A method 3");
        //     }
        // }
        // class B extends A{
        //     void m4(){
        //         System.out.println("Class B method 4");
        //     }
        //     void m5(){
        //         System.out.println("Class B method 5");
        //     }
        //     void m6(){
        //         System.out.println("Class B method 6");
        //     }
        // }

        // class C extends A{
        //     void m7(){
        //         System.out.println("Class C method 7");
        //     }
        //     void m8(){
        //         System.out.println("Class C method 8");
        //     }
        // }

        // class D extends A{
        //     void m9(){
        //         System.out.println("Merry Christmas");
        //     }
        // }
    /*Q6
        method chaining 
        */ 
        //    class A{
        //     int count=0;
        //     void m1(){
        //         System.out.println("Hello");
        //         while(count<5){
        //             count++;
        //             this.m2();
        //             //  m2();
                    
        //         }
            
        //     }
        //     void m2(){
        //         System.out.println("Bye");
        //         while(count <5){
        //             count++;
        //              m1();
                    
        //         }

        //     }
        //    }

    /*
    Q7 Multiple Inhetiance code
    */

        // class A{
        //     void show(){
        //         System.out.println("Hello");
        //     }
        // }
        // class B {
        //     void show(){
        //         System.out.println("Bye");
        //     }
        // }
        // class C extends A,B{
        //     void display(){
        //         System.out.println("Jesus");
        //     }
        // }

    /* Q8

         hybrid inheritance code 

        */

        class A{
            void a(){System.out.println("Hello");}
        }
        class B extends A{
            void b(){
                System.out.println("Bye");
            }
        }
        class C extends B{
            void c(){
                    System.out.println("Jesus");

            }
          
        }
        class D extends A,B{
            void d(){
                 System.out.println("Red One");
            }
           
        }
        
    
public class InheritanceAssign25_12_24{
    public static void main(String [] args){
        //Q1
            // B o = new B();
            // o.method1();
            // o.method2();
            // C ob = new C();
            // ob.method1();
            // ob.method3(45);
            // D obj = new D();
            // obj.method1();
            // obj.method4(30);
            // E obje = new E();
            // obje.method1();
            // obje.method5();

        //Q2
            
            // D obj =  new D();
            // obj.add();

        //Q3

            // A o = new A();
            // o.setA(50);
            // System.out.println("The value from A class is : " + o.getA());

            // B ob = new B();
            // ob.setB(60);
            // System.out.println("Getting B class value : " + ob.getB());
            // ob.setA(5);
            

            // C obj = new C();
            // System.out.println("Getting A class value from C class: " + obj.getA());
            // obj.setC(70);
            // System.out.println("Getting C class value : " + obj.getC());

            // D obb = new D();
            // System.out.println("Getting A class value from D class: " + obb.getA());
            // obb.setD(80);
            // System.out.println("Getting D class value : " + obb.getD());

        //Q4

            // B obj = new B();
            // obj.show();
            // C ob = new C();
            // ob.display();

            // D p =new D();
            // p.show();

        
        //Q5

            // A o = new A();
            // o.m1();

            // B ob = new B();
            // ob.m4();
            // ob.m2();

            // C obj = new C();
            // obj.m7();
            // obj.m3();

            // D objj = new D();
            // objj.m9();

        //Q6

            // A ob = new A();
            // ob.m1();

        //Q7

            // C obj = new C();
            // obj.show();
            // obj.display();

        //Q8

            D obj = new D();
            obj.a();
            obj.b();
            obj.c();
            obj.d();
    }
}