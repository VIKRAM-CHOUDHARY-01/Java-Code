// Weekly Test - 02/01/25
import java.util.*;
/*  Q.1 Create a class Student with private fields name, rollNumber, and grade. Implement getters and   setters to access and modify these fields.*/

    class Student {
        private String name;
        private int rollNumber;
        private char grade;

        public void setName(String name){
            this.name = name;
        }
        public void setRollNumber(int rollNumber){
            this.rollNumber = rollNumber;
        }
        public void setGrade(char grade){
            this.grade = grade;
        }

        public String getName(){
            return name;
        }
        public int getRollNumber(){
            return rollNumber;
        }
        public char getGrade(){
            return grade;
        }
    }


/*  Q.2 Write a program to enforce validation in the setter method for an Employee class where the salary cannot be negative.   */

    class Employee{
        private int salary;
        public void setSalary(int salary){
            if(salary>=0){
                this.salary = salary;
            } else {
                System.out.println("Salary can not be negative");
            }
        }
        public int getSalary(){
            return salary;
        }
    }

/*  Q.3 Implement a class BankAccount that has private fields for accountNumber and balance. Add methods for deposit and withdrawal with proper validation. */

    // class BankAccount{
    //     private int accountNumber;
    //     private int balance;
    //     public void setAccountNumber(int accountNumber){
    //         this.accountNumber = accountNumber;
    //     }
    //     public void setBalance(int balance){
    //         this.balance = balance;
    //     }

    //     public void deposit(int balance, int accountNumber){
    //         if(this.accountNumber == accountNumber && balance>=0){
    //             this.balance = this.balance + balance;
    //         } else {
    //             System.out.println("Invalid account number or invalid deposit");
    //         }
    //     }
    //      public void withdrawal(int balance, int accountNumber){
    //         if(this.accountNumber == accountNumber){
    //            if(this.balance>=balance){
    //             this.balance = this.balance - balance;
    //            } else {
    //             System.out.println("Balance Inficuient");
    //            }
    //         } else {
    //             System.out.println("Invalid account number");
    //         }
    //     }
    //     public int getAccountNumber(){
    //         return accountNumber;
    //     }

    //     public int getBalance(){
    //         return balance;
    //     }
    // }

/*  Q.4 Design a Product class that allows only valid prices (greater than zero) using encapsulation.   */
    
    class Product{
        private int price;
        public void setPrice(int price){
            if(price>0){
                this.price = price;
            } else {
                System.out.println("Enter valid Price");
            }
        }

        public int getPrice(){
            if(price == 0){
                System.out.println("No price is being set");
                return 0;
            } else {
                return price;
            }
        }
    }


/*  Q.5 Develop a class Book that encapsulates the properties title, author, and price. Include a method to display the book details.   */

    class Book{
        private String title;
        private String author;
        private int price;
        public void setTitle(String title){
            this.title = title;
        }
        public void setAuthor(String author){
            this.author = author;
        }
        public void setPrice(int price){
            this.price = price;
        }
        public String getTitle(){
            return title;
        }
         public String getAuthor(){
            return author;
        } 
        public int getPrice(){
            return price;
        }
        
    }

/*  Q.6 Create a class Car with fields brand and model. Write a default constructor and a parameterized constructor.*/
    class Car{
        private static String brand;
        private static String model;
        Car(String brand, String model){
            this.brand = brand;
            this.model = model;
        }
        Car(){
            System.out.println("The brand name is : " + brand);
            System.out.println("The Model is : " + model);
        }
    }

/*  Q.7 Write a program to demonstrate constructor overloading for a Rectangle class with fields length and breadth.*/
    
    class Rectangle{
            private double length;
            private double breadth;
        Rectangle(){
            length = 23.0d;
            breadth = 25.0d;
        }
        
        Rectangle(double length, double breadth){
            this.length = length;
            this.breadth = breadth;
        }
        void display(){
            System.out.println("Length : " + length);
            System.out.println("Breadth : " + breadth);
        }
    }

/*  Q.8 Implement a class Circle with a single field radius. Use a constructor to initialize the radius and calculate the area. */

    class Circle{
        private double radius;
        Circle(double radius){
            this.radius = radius;
            
        }
        void area(){
            double area = 3.14*radius*radius;
            System.out.println("The Area is : " + area);
        }
    }

/*  Q.9 Design a Person class that initializes name and age using a constructor. Add a method to display the details.   */
    class Person{
        private String name;
        private int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        void details(){
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
        }
    }

/*  Q.10 Create a class Vehicle with a parameterized constructor. Extend it in a Bike class that calls the parent constructor using super.*/
    
    class Vehicle{
        Vehicle(String name){
            System.out.println("Vehicle Name : " + name);
        }
    }
    class Bike extends Vehicle{
        Bike(){
            super("Splendor");
        }
    }


        public class TestfirstJan{
             public static void main(String [] args){

                //Q.1
                    Student st = new Student();
                    st.setName("Vikram Choudhary");
                    st.setRollNumber(21);
                    st.setGrade('A');

                    System.out.println("The name of student is : " + st.getName());
                    System.out.println("The Roll Number is : " + st.getRollNumber());
                    System.out.println("Grade he got is : " + st.getGrade());

                //Q.2  
                    Employee emp = new Employee();
                    emp.setSalary(-50000);
                    System.out.println("The salary is : " + emp.getSalary());

                //Q.3

                    // Scanner sc = new Scanner(System.in);
                    // BankAccount bank = new BankAccount();
                    // bank.setAccountNumber(786);
                    // bank.setBalance(1000);
                    // System.out.println("Your Bank Account Number is : " + bank.getAccountNumber());
                    // System.out.println("Your Intial Balance is : " + bank.getBalance());

                    // for(int i =1;;){
                    //      System.out.println("Enter 1 to deposit or 2 to withdraw and 3 to check your balance, 4 to exit");
                    // int key = sc.nextInt();
                    // if(key == 1){
                      
                    //     System.out.println("Enter the bank account and amount you want to deposit : ");
                    //     int accountNum = sc.nextInt();
                    //     int amount = sc.nextInt();
                    //     bank.deposit(amount,accountNum);
                        
                    
                    // } else if(key == 2){
                        
                    //     System.out.println("Enter the amount your bank account numebr and  then amount want to withdraw: ");
                    //     int accountN = sc.nextInt();
                    //     int amount = sc.nextInt();
                    //     bank.withdrawal(amount,accountN);
                    //     }
                    
                    // else if(key == 3){

                    //         System.out.println("Your current balance is : " + bank.getBalance());
                    // } else if(key>4 || key<=0){
                    //     System.out.println("Wrong Choice");
                        
                    // } else if(key ==4) {
                    //     System.out.println("Exited");
                    //     break;
                    // }

                    // }
                //Q.4

                    Product pr = new Product();
                    pr.setPrice(-500);
                    System.out.println("Your set price is : " + pr.getPrice());
                   
                //Q.5 

                    Book boo = new Book();
                    boo.setTitle("Greenlights");
                    boo.setAuthor("Matthew McConaughey");
                    boo.setPrice(270);
                    System.out.println("The title : " + boo.getTitle());
                    System.out.println("The Author : " + boo.getAuthor());
                    System.out.println("The price is: " + boo.getPrice());

                //Q.6
                    new Car("Buggati", "Chirone");
                    new Car();

                
                //Q.7   
                    Rectangle rt = new Rectangle();
                    rt.display();

                //Q.8 
                    Circle cl = new Circle(56);
                    cl.area();

                //Q.9
                    Person p = new Person("Vikran", 21);
                    p.details();

                //Q.10
                    Bike vh = new Bike();

            }
        }