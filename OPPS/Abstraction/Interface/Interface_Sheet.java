//Assignment - Interface Sheet - 31/01/25

    //Q.1   create an interface Shape with a method calculateArea(). Implement this interface in classes Circle and Rectangle to calculate their respective areas.

        interface Shape{
           void calculateArea();
        }
        class Circle implements Shape{
            double radius;
            Circle(double radius){
                this.radius = radius;
            }
            public void calculateArea(){
                double area = (22/7) * radius * radius;
                System.out.println("The area of circle is : " + area);  
            }
        }
        class Rectangle implements Shape{
            int length, breadth;
            Rectangle(int length, int breadth){
                this.length = length;
                this.breadth = breadth;
            }
            public void calculateArea(){
                int area = length*breadth;
                System.out.println("The area of rectangle is : " + area);
            }
        }


    //Q2    Create an interface Printable with a default method print(). Implement this interface in a class and override the print() method to customize its behavior.

        interface Printable{
            default void print(){
                System.out.println("Its Print method of Printable");
            }
        }
        class CustomPrintable implements Printable{
            public void print(){
                System.out.println("Customized Print method of CustomPrintable");
            }
        }

    //Q3    Create two interfaces Flyable and Swimmable. Define appropriate methods in each. Create a class Duck that implements both interfaces and demonstrates their usag.

            interface Flyable{
                void fly();
            }
            interface Swimmable{
                void swim();
            }
            class Duck implements Flyable, Swimmable{
                public void fly(){
                    System.out.println("Duck is flying");
                }
                public void swim(){
                    System.out.println("Duck is swimming");
                }
            }

    //Q4    Create an interface MathConstants with constants PI and E. Implement this interface in a class MathOperations to perform calculations using these constants.

        interface MathConstants{
            double PI = 3.14;
            double E = 2.71;
        }
        class MathOperations implements MathConstants{
            public void calculateCircleArea(double radius){
                double area = PI*radius*radius;
                System.out.println("The area of circle is : " + area);
            }
            public void compound(int investment, int rate){
                double amount = investment + (investment * rate * E);
                System.out.println("The amount after compounding is : " + amount);
            }

        }

    //Q5    Create an interface Payment with a method processPayment(). Implement this interface in classes CreditCardPayment and DebitCardPayment. Write a program to process payments dynamically using the Payment type.

            interface Payment{
                void processPayment(int amount);
            }
            class CreditCardPayment implements Payment{
                int CreditCardLimit;
                CreditCardPayment(int CreditCardLimit){
                    this.CreditCardLimit = CreditCardLimit;
                }
                public void processPayment(int amount){
                if(CreditCardLimit>=amount){
                    System.out.println("Payment is processed");
                    CreditCardLimit = CreditCardLimit-amount;
                }else{
                    System.out.println("Payment is not processed, Amount Exceeds Credit Card Limit");
                }
                }
            }

            class DebitCardPayment implements Payment{
                int DebitCardBalance;
                DebitCardPayment(int DebitCardBalance){
                    this.DebitCardBalance = DebitCardBalance;
                }
                public void processPayment(int amount){
                    if(DebitCardBalance>=amount){
                        System.out.println("Payment is processed");
                        DebitCardBalance = DebitCardBalance-amount;
                    }else{
                        System.out.println("Payment is not processed, Amount Exceeds Debit Card Balance");
                    }
                }
            }

    //Q6    Create a base interface Vehicle with methods start() and stop(). Extend this interface in another interface ElectricVehicle with a method chargeBattery(). Implement these interfaces in a class TeslaCar.

                    interface Vehicle {
                    void start();
                    void stop();
                }

                interface ElectricVehicle extends Vehicle {
                    void chargeBattery(int units);  // Better parameter name
                }

                // TeslaCar Implements ElectricVehicle
                class TeslaCar implements ElectricVehicle {
                    private int batteryLevel = 0;  // Track battery charge

                    public void start() {
                        System.out.println("Tesla Car is started");
                    }

           
                    public void stop() {
                        System.out.println("Tesla Car is stopped");
                    }

                    public void chargeBattery(int units) {
                        batteryLevel += units;
                        System.out.println("Tesla Car is charged with " + units + " units of electricity. Current battery level: " + batteryLevel);
                    }
                }


    //Q7    Create a functional interface Calculator with a method int operate(int a, int b). Use a lambda expression to implement addition, subtraction, multiplication, and division.

    interface Calculator{
        int operate(int a, int b);
    }

    //Q8    Create two interfaces InterfaceA and InterfaceB with a default method display(). Implement both interfaces in a class MyClass and resolve the conflict.

        interface A{
            default void display(){
                System.out.println("Interface A");
            }
        }
        interface B {
            default void display(){
                System.out.println("Interface B");
            }
        }
        class MyClass implements A,B{
                 public void display() {
                    System.out.println("Resolving Conflict: Using Interface A's display()");
                    A.super.display();  // Explicitly calling Interface A's method
                }
        }
  

            public class Interface_Sheet{
                public static void main(String []args){
                //Q1
                    Circle c = new Circle(5);
                    c.calculateArea();
                    Rectangle r = new Rectangle(4, 5);
                    r.calculateArea();

                //Q2
                    CustomPrintable cp = new CustomPrintable();
                    cp.print();

                //Q3
                    Duck d = new Duck();
                    d.fly();
                    d.swim();

                //Q4
                    MathOperations m  = new MathOperations();
                    m.calculateCircleArea(5);
                    m.compound(1000, 10);

                //Q5
                    CreditCardPayment cd = new CreditCardPayment(10000);
                    cd.processPayment(5000);
                    DebitCardPayment dc = new DebitCardPayment(50000);
                    dc.processPayment(5000);


                //Q6
                    TeslaCar t = new TeslaCar();
                    t.start();
                    t.stop();
                    t.chargeBattery(100);


                //Q7
                                // Lambda Expressions for Basic Arithmetic Operations
                    Calculator addition = (a, b) -> a + b;
                    Calculator subtraction = (a, b) -> a - b;
                    Calculator multiplication = (a, b) -> a * b;
                    Calculator division = (a, b) -> (b != 0) ? (a / b) : 0; // Prevent division by zero

                    // Testing the Lambda Implementations
                    int num1 = 10, num2 = 5;

                    System.out.println("Addition: " + addition.operate(num1, num2));
                    System.out.println("Subtraction: " + subtraction.operate(num1, num2));
                    System.out.println("Multiplication: " + multiplication.operate(num1, num2));
                    System.out.println("Division: " + division.operate(num1, num2));


                //Q8    
                        MyClass obj = new MyClass();
                        obj.display();
                    
                }
            }