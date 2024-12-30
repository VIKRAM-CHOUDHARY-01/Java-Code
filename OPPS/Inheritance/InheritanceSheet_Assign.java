//  Inheritance Sheet Assignment - 27/12/24

/*  Q.1 Write a Java program to demonstrate single-level inheritance where a Student class          inherits    from a Person class.    */

    class Person{
        void name(){
            System.out.println("My name is Maharaja");
        }
    }
    class Student extends Person{
        void roll(){
            System.out.println("My roll number is : 01");
        }
    }

/*  Q.2 Create a Java program where a Dog class inherits a Mammal class, and call a method to display   their characteristics.      */
    class Mammal{
        void species(){
            System.out.println("These species are Mammal");
        }
    }
    class Dog extends Mammal{
        void bark(){
            System.out.println("Dogs Barks");
        }
    }

/*  Q.3 Implement a program where a Car class inherits from a Vehicle class, and call the inherited     method in the subclass.     */

        class Vehical{
            void vehicalType(){
                System.out.println("Type of Vehical");
            }
        }
        class Car extends Vehical{
            void carName(){
                this.vehicalType();
                System.out.println("Salavia is good car");
            }
        }

/*  Q.4 Write a Java program where a Rectangle class inherits a Shape class and calculates the area using a method in the superclass.       */

        class Shape{
            void ractangleArea(float length, float width){
                float area = length*width;
                System.out.println("The area of Reactangle is : "+ area);
            }
        }
        class Reactangle extends Shape{
            void ractangleMesurements(){
                float length = 45.0f;
                float width = 20.0f;

                ractangleArea(length, width);
                
            }
        }

/*  Q5  Write a Java program where a subclass inherits from a superclass and attempts to access private members (and observe the result).
                                    */

            // class A{
            //     private int a =23;
                
            // }
            // class B extends A{
            //     void accessPrivate(){
            //         System.out.println(a);
            //     }
            // }

        /* Output : InheritanceSheet_Assign.java:69: error: a has private access in A
                    System.out.println(a);
                                   ^
                    1 error     */

/*  Q.6 Write a Java program to demonstrate multilevel inheritance where Car inherits Vehicle and ElectricCar inherits Car.             */

        class Vehical1{
            void vech(){
                System.out.println("It's a Vehical");
            }
        }
        class Car1 extends Vehical1{
            void car(){
                System.out.println("It's a Car");
                }
        }
        class ElectricCar extends Car1{
            void ElectCar(){
                System.out.println("Tesla");
            }
        }

/*  Q7 Create a program where a Manager class inherits from an Employee class, and an Executive class inherits from Manager. Display the details for all three classes.     */

           class Employee {
                    void displayEmployeeDetails() {
                        System.out.println("This is the Employee class.");
                    }
                }

                class Manager extends Employee {
                    void displayManagerDetails() {
                        System.out.println("This is the Manager class.");
                    }
                }

                class Executive extends Manager {
                    void displayExecutiveDetails() {
                        System.out.println("This is the Executive class.");
                    }
                }

/*  Q.8 Implement a program where a Shape class is inherited by a Circle class, and then a Cylinder class inherits from the Circle class to calculate volume.           */
        class Shape1{
           Shape1(){
            System.out.println("This is Shape");
           }
        }
        class Circle1 extends Shape1{
            
            double circleArea(double radius){
                return 3.14*radius*radius;
            }
        }
        class Cylinder extends Circle1{
            Cylinder(double radius, double height){
                System.out.println("The Volume of Cylinder is : " + (circleArea(radius)*height));
            }
        }


/* Q.9  Create a program where a Person class is inherited by a Student class, which is then inherited by a GraduateStudent class.  */

        class Person1{
            void per_info(String name){
                System.out.println("The name is : " + name);
            }
        }
        class Student1 extends Person1{
            void stu_info(int roll){
                System.out.println("The Roll Number was : " + roll);
            }
        }
        class GraduateStudent extends Student1{
            void grad_info(String degree){
                System.out.println("The Graduation degree is : " + degree);
            }
        }
/*  Q10 Create a program where a Vehicle class is inherited by a Car class, which is then inherited by a SportsCar class. Each class should have its own unique method.     */
        class Vehicle2{
            void vehicle_info(String name){
                System.out.println("The Vehicle name is : " + name);
                }
            
        }
        class Car2 extends Vehicle2{
            void car_info(String model){
                System.out.println("The Car model is : " + model);
                }
        }
        class SportsCar extends Car2{
            void sports_info(int speed){
                System.out.println("The Sports Car speed is : " + speed);
                }
        }

/*  Q11 Implement a program where a Building class is inherited by a House class, and then a Mansion class inherits from House. Each class should have unique properties.      */

        class Building {
            void build(){
                System.out.println("It's a Building");
            }
        }
        class House extends Building{
            void hoe(){
                System.out.println("It's a House");
            }
        }
        class Mension extends House {
            void men(){
                System.out.println("No, It's a Mension");
            }
        }

/*  Q12 Create a program where a BankAccount class is inherited by a SavingsAccount class, which is then inherited by a CheckingAccount class. Each class should have a different method for calculating interest.                  */

        class BankAccount{
            float balance;
            BankAccount(float balance){
                this.balance = balance;
            }
            float bankInterest(){
                return balance*0.05f;
            }
        }
        class SavingsAccount extends BankAccount{
             SavingsAccount(float balance) {
                    super(balance); // Call the constructor of BankAccount
         }
            float savingInterest(){
                return balance*0.15f;
            }
        }
        class CurrentAccount extends SavingsAccount{
              CurrentAccount(float balance) {
            super(balance); // Call the constructor of SavingsAccount
            }
            float currentInterest(){
                 return balance*0.10f;
            }
           
        }


/*  Q13 Write a Java program where both Cat and Dog inherit from a Pet class and demonstrate calling methods from both subclasses.      */

        class Pet{
            void petAni(){
                System.out.println("This is pet class");
            }
        }
        class Cat_1 extends Pet{
            void catAni(){
                System.out.println("It's a Cat");
            }
        }
        class Dog_1 extends Pet{
            void dogAni(){
                System.out.println("It's a Dog");
            }
        }

/*  Q14 Create a program where a Person class is inherited by both Employee and Student classes, and demonstrate how each subclass can have its own unique methods. */

        class Person_3{
            void personAge(){
                System.out.println("The person is young");
            }
        }
        class Student_3 extends Person_3{
            void stu_Name(){
                System.out.println("The name of student is Vikram Choudhary");
            }
        }
        class Employee_3 extends Person_3{
            void emp_Name(){
                System.out.println("The name of employee is future Vikram Choudhary");
                }
        }

/*  Q15 Write a Java program where a Vehicle class is inherited by both Car and Bike classes, and each class demonstrates a unique method of transportation.    */

            class Vehical_1{
                void vehicalChar(){
                    System.out.println("Every Vahical have engine");
                    }
            }
            class Car_1 extends Vehical_1{
                void carChar(){
                    System.out.println("Car have 4 wheels");
                    }
            }
            class Bike_1 extends Vehical_1{
                void bikeChar(){
                    System.out.println("Bike have 2 wheels");
                    }
            }

/*  Q16 Create a program where a Shape class is inherited by Circle and Rectangle classes, and each subclass has a method to calculate the area     */
            class Shape_2{
                void circle(int radius){
                    System.out.println("The area of circle is "+ (3.14)*(radius*radius));
                }

                void reactangle(int length, int width){
                    System.out.println("The area of rectangle is "+(length*width));
                }
            }

            class Circle_1 extends Shape_2{
                void circleArea(int radius){
                    circle(radius);
                }
            }
            class Reactangle_1 extends Shape_2{
                void ractangleArea(int length, int width){
                    reactangle(length, width);
                }
            }
/*  Q17 Write a program where a Person class is inherited by Teacher and Student classes, and each subclass demonstrates a unique method to display their role.     */
            class Person_4{
                void personName(){
                    System.out.println("The name of person is Vikram Choudhary");
                    }
            }
            class Teacher_1 extends Person_4{
                void teacherName(){
                    System.out.println("The name of teacher is Vikram Choudhary");
                    }
                    }
                    class Student_1 extends Person_4{
                        void studentName(){
                            System.out.println("The name of student is Vikram Choudhary");
                            }
                    }

/*  Q18 Create a Java program where a Book class is inherited by Ebook and PrintedBook classes, with methods to show specific details for each book type.   */
                    class Book{
                        void bookDetail(){
                            System.out.println("All are books");
                        }
                        
                    }
                    class Ebook extends Book{
                        void ebookDetails(){
                            System.out.println("Ebook is a digital book");
                        }
                        
                    }
                    class PrintedBook extends Book{
                        void printedBookDetails(){
                            System.out.println("Printed book is a physical book");
                        }
                    }

/*  Q19 Write a program where an Animal class is inherited by Bird and Mammal classes, and each subclass has a method to display its unique behavior.   */
                    class Animal_1{
                        void animalName(){
                            System.out.println("All are Animal");
                        }
                    }
                    class Bird_1 extends Animal_1{
                        void birdName(){
                            System.out.println("Birds can fly");
                            }
                    }
                    class Mammal_1 extends Animal_1{
                        void mammalName(){
                            System.out.println("Mammals can walk");
                            }

                    }
/*  Q20 Create a program where a Shape class is inherited by both Circle and Square classes. Demonstrate calling the inherited methods and adding new functionality in each subclass.   */
                    class Shape_3 {
    void displayShape_3() {
        System.out.println("This is a generic shape.");
    }
}

class Circle_4 extends Shape_3 {
    double radius;

    Circle_4(double radius) {
        this.radius = radius;
    }

    void displayShape_4() {
        System.out.println("This is a Circle.");
    }

    double calculateArea_4() {
        return Math.PI * radius * radius;
    }
}

class Square_5 extends Shape_3 {
    double side;

    Square_5(double side) {
        this.side = side;
    }

    void displayShape_5() {
        System.out.println("This is a Square.");
    }

    double calculateArea_5() {
        return side * side;
    }

}
                

    public class InheritanceSheet_Assign{
        public static void main(String [] args){
            
            //Q.1
                    Student s1 = new Student();
                    s1.name();
                    s1.roll();

                    System.out.println("\n----------------------------------------------------------\n");

            //Q.2
                    Dog dg = new Dog();
                    dg.species();
                    dg.bark();
                    System.out.println("\n----------------------------------------------------------\n");

            //Q.3

                    Car cr = new Car();
                    cr.carName();
                    System.out.println("\n----------------------------------------------------------\n");

            //Q.4   
                    Reactangle rc = new Reactangle();
                    rc.ractangleMesurements();
                    System.out.println("\n----------------------------------------------------------\n");

            //Q.5
                    // B sub = new B();
                    // sub.accessPrivate();

            //Q.6

                    ElectricCar ev = new ElectricCar();
                    ev.vech();
                    ev.car();
                    ev.ElectCar();
                    System.out.println("\n----------------------------------------------------------\n");

            
            //Q.7

                    Employee emp = new Employee();
                    Manager mgr = new Manager();
                    Executive exe = new Executive();

                    System.out.println("--- Employee ---");
                    emp.displayEmployeeDetails();

                    System.out.println("--- Manager ---");
                    mgr.displayEmployeeDetails(); 
                    mgr.displayManagerDetails();

                    System.out.println("--- Executive ---");
                    exe.displayEmployeeDetails();
                    exe.displayManagerDetails();
                    exe.displayExecutiveDetails();
                    System.out.println("\n----------------------------------------------------------\n");

            //Q.8

                    Cylinder cy = new Cylinder(20,10);
                    System.out.println("\n----------------------------------------------------------\n");

            //Q.9
                    GraduateStudent gs = new GraduateStudent();
                    gs.per_info("Vikram Choudhary");
                    gs.stu_info(20);
                    gs.grad_info("BCA");   
                    System.out.println("\n----------------------------------------------------------\n");

            //Q10

                    SportsCar sp = new SportsCar();
                    sp.vehicle_info("Buggati");
                    sp.car_info("Chiron");
                    sp.sports_info(400);    

                    System.out.println("\n----------------------------------------------------------\n");     

            //Q11
                    Mension mn = new Mension();
                    mn.build();
                    mn.hoe();
                    mn.men();
                    System.out.println("\n----------------------------------------------------------\n");

            //Q12

                    CurrentAccount ba = new CurrentAccount(5000.0f);
                    System.out.println("The interest in simple bank : " + ba.bankInterest());
                    System.out.println("The interest in Saving Account : " + ba.savingInterest());
                    System.out.println("The interest in Current Account : " + ba.currentInterest());
                    

            
            //Q13
                    Cat_1 ca = new Cat_1();
                    ca.petAni();
                    ca.catAni();

                    Dog_1 d = new Dog_1();
                    d.petAni();
                    d.dogAni();
                    System.out.println("\n----------------------------------------------------------\n");

            //Q14
                    Student_3 su = new Student_3();
                    su.personAge();
                    su.stu_Name();

                    Employee_3 e = new Employee_3();
                    e.personAge();
                    e.emp_Name();
                    System.out.println("\n----------------------------------------------------------\n");
            //Q15    
                    Car_1 c = new Car_1();
                    c.vehicalChar();
                    c.carChar();

                    Bike_1 b = new Bike_1();
                    b.vehicalChar();
                    b.bikeChar();

                    System.out.println("\n----------------------------------------------------------\n");

            //  Q16
                    Reactangle_1 r = new Reactangle_1();
                    r.ractangleArea(45,5);

                    Circle_1 ch = new Circle_1();
                    ch.circleArea(34);

                    System.out.println("\n----------------------------------------------------------\n");

            //Q17   
                    Teacher_1 t = new Teacher_1();
                    t.teacherName();
                    Student_1 stu1 = new Student_1();
                    stu1.personName();
                    stu1.studentName();
                    System.out.println("\n----------------------------------------------------------\n");

            //Q18   

                    Ebook eb = new Ebook();
                    eb.bookDetail();
                    eb.ebookDetails();

                    PrintedBook pb = new PrintedBook();
                    pb.bookDetail();
                    pb.printedBookDetails();
                    System.out.println("\n----------------------------------------------------------\n");

            //Q19   
                    Bird_1 br = new Bird_1();
                    br.animalName();
                    br.birdName();
                    

                    Mammal_1 mam = new Mammal_1();
                    mam.mammalName();

                    System.out.println("\n----------------------------------------------------------\n");
            
            //Q20

                    Circle_4 circle = new Circle_4(5);
                    circle.displayShape_4();
                    System.out.println("Area of Circle: " + circle.calculateArea_4());
 
                    Square_5 square = new Square_5(4);
                    square.displayShape_5(); 
                    System.out.println("Area of Square: " + square.calculateArea_5());

                    System.out.println("\n----------------------------------------------------------\n");







        }
    }

