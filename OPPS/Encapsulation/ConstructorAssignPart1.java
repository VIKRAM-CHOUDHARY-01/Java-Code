
//Assignment - Constructor Part 1 21/12/24


//Q1  Basic Constructor:
    // Create a class Book with instance variables title and author. Use a constructor to initialize these variables.
        class Book{
            String title;
            String author;
            Book(){
                title="Greenlights";
                author = "Matthew McConaughey";
                System.out.println(title + " and Author is : " + author);
            }
        }

//Q2 Default Constructor:
        // Write a program to create a class Person with a default constructor that initializes name to "Unknown" and age to 0.

        class Person{
            String name;
            int age;
            Person(){
                name = "Unknown";
                System.out.println("The name of person is : " + name + " and age : " + age); 
            }
        }

//Q3 Constructor with Parameters:

        // Write a class Car that has a constructor to initialize the model and year of a car.

        class Car{
            String model;
            int year;
            Car(){
                model = "Bugatti Chirone";
                year = 2019;
                System.out.println("The model : " + model + " year : " + year);
            }
        }

//Q4 Constructor Initialization:

        // Create a class Animal with instance variables name and species. Use a constructor to initialize these variables.

        class Animal{
            String name;
            String species;
            Animal(){
                name = "Lion";
                species = "Mammal";
                System.out.println("The name of animal is : " + name + " and species : " + species);
            }
        }

//Q5  No-Argument Constructor:

        // Define a class Student with a no-argument constructor that initializes name to "Anonymous" and marks to 0.
        class Student{
            String stuName;
            int stuMarks;
            Student(){
                stuName = "Anonymous";
                System.out.println("The name of student is : " + stuName + " and marks : " + stuMarks);
            }
        }

//Q6    Constructor with One Parameter:

        // Create a class Book with an instance variable title and write a constructor that accepts a title and assigns it to the instance variable.

        class Book1{
            String title;
            String author;
            Book1(String title, String author){
                this.title= title;
                this.author = author;
                System.out.println("The title of book is : " + title + " and author : " + author);
            }
        }

//Q7 Constructor with Multiple Parameters:

        // Write a program to create a Rectangle class with length and breadth as instance variables. Use a constructor to initialize them.

        class Rectangle{
            double length;
            double breadth;
            Rectangle(double length, double breadth){
                this.length = length;
                this.breadth = breadth;
                System.out.println("This Rectangle Length : " + length + " and Breadth : " + breadth);
            }
        }

//Q8 Constructor and Method:

        // Create a class Person with name and age as instance variables. Use a constructor to initialize these values, and then write a method displayInfo() that prints the name and age.

        class Person1{
            String name;
            int age;
            Person1(String name, int age){
                this.name = name;
                this.age = age;
            }
            void displayInfo(){
                System.out.println("The name of person is : " + name + " and age is : " + age);
            }
        }
//Q.9 Constructor with String Parameter:

        // Define a class Book with a constructor that accepts a String representing the book’s title and assigns it to the title instance variable.
        class Book2{
            String title;
            Book2(String title){
                this.title = title;
                System.out.println("The title of book is : " + title);
            }
        }

//Q10  Constructor with Integer Parameter:

        // Write a class Employee with an integer instance variable salary. Create a constructor that takes an integer and sets the salary value.

        class Employee{
            int salary;
            Employee(int salary){
                this.salary = salary;
                System.out.println("Employee Salary : " + salary);
            }
        }

//Q11 Constructor and Display Method:

        // Create a Book class with title, author, and price as instance variables. Use a constructor to initialize these, and then write a method displayDetails() to print them.

        class Book3{
            String title;
            String author;
            int price;
            Book3(String title, String author, int price){
                this.title=title;
                this.author = author;
                this.price=price;
            }

            void displayDetails(){
                System.out.println("Title : " + title + " Author : " + author + " Price : " + price);
            }
        }

//Q12 Constructor with Default Values:

        // Create a Student class with instance variables name and marks. Write a constructor that initializes name to "Unknown" and marks to 0 by default.


    class Student2{
            String stuName;
            int stuMarks;
            Student2(){
                stuName = "Unknown";
                System.out.println("The name of student is : " + stuName + " and marks : " + stuMarks);
            }
        }


//Q13 Constructor for Initialization:

        // Write a class Person with a constructor that initializes the name to "John" and age to 25. Create an object and display these values.

        class Person2{
            Person2(){
                String name = "John";
                int age = 25;
                System.out.println("Name is : " + name + " Age is "+ age);
            }
        }

//Q14 Constructor with a String and an Integer:

        // Write a class Employee with name and salary as instance variables. Create a constructor that accepts both a String for name and an int for salary.

          class Employee2{
            String name;
            int salary;
            Employee2(String name,int salary){
                this.name = name;
                this.salary = salary;
                System.out.println("Employee Name : " + name);
                System.out.println("Employee Salary : " + salary);
                
            }
        }

//Q15   Constructor with Instance Variable Initialization:

        // Create a class Circle with a radius instance variable. Use a constructor to initialize the radius value and then write a method to display the radius.
        class Cricle{
            int radius;
            Cricle(int radius){
                this.radius = radius;
            }
            void displayRadius(){
                System.out.println("The Radius is : " + radius);
            }
        }

//Q16 Constructor with Parameter and Default Initialization:

        // Define a class Car that has model and year as instance variables. Write a constructor that accepts model and sets year to 2024 by default.

            class Car2{
            String model;
            int year;
            Car2(String model, int year){
                this.model = model;
                this.year = year;
                System.out.println("The model : " + model + " year : " + year);
            }

            Car2(String model){
                this(model,2024);
            }
        }

//17 Simple Constructor Example:

        // Write a class Person with instance variables name and age. Create a constructor that initializes these values and a method displayDetails() that prints the values.

        class Person3{
            String name;
            int age;
            Person3(String name, int age){
                this.name = name;
                this.age=age;
            }

            void displayDetails(){
                System.out.println("The name is : " + name + " and age is : " + age);
            }
        }
//Q18 Constructor with Boolean Parameter:

        // Define a class Light with a boolean instance variable isOn. Create a constructor that accepts a boolean value and initializes isOn.

        class Light{
            boolean isOn;
            Light(boolean isOn){
                this.isOn = isOn;
                if(this.isOn){
                    System.out.println("Light is on");
                } else {
                    System.out.println("Light is off");
                }
            }
        }

//Q19 Constructor in Main Method:

        // Create a class Book with title and author as instance variables. In the main method, create an object using the constructor and display the title and author.

        class Book4{
                    String title;
                    String author;
                    Book4(String title, String author){
                        this.title=title;
                        this.author = author;
                        System.out.println("Title : " + title + " Author : " + author);
                    }
                }
 



        
public class ConstructorAssignPart1{
    public static void main(String[] args){
        //Q1
            Book b = new Book();

        //Q2
            Person p = new Person();

        //Q3
            Car c = new Car();

        //Q4
            Animal an = new Animal();

        //Q5

            Student stu = new Student();

        //Q6
            Book1 boo = new Book1("Spring Angel", "Abdul khalid");

        //Q7
            Rectangle rec = new Rectangle(5,40);

        //Q8

            Person1 pr = new Person1("Vikram", 21);
            pr.displayInfo();

        //Q9
            Book2 bo = new Book2("Rich dad poor dad");

        //Q10
            Employee emp = new Employee(5000);

        //Q11
            Book3 book = new Book3("The Subtle Are of not Giving Fuck", "Makr Menson", 500);
            book.displayDetails();

        //Q12
            Student2 st = new Student2();

        //Q13
            Person2 per = new Person2();

        //Q14
            Employee2 e = new Employee2("Vikram", 5000000);

        //Q15
            Cricle cr = new Cricle(50);
            cr.displayRadius();

        //Q16
            Car2 car = new Car2("hel");
            Car2 car1 = new Car2("Volvo", 2019);

        //Q17
            Person3 per1 = new Person3("Vikram", 23);
            per1.displayDetails();

        //Q18

            Light li = new Light(false);

        //Q19 
            Book4 b4 = new Book4("Greenlights", "Matthew McConaughey");

    }
}