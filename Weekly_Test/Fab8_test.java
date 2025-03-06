//Weekly Test - 08/02/25
/*
Q/1 1)
Method Overloading: Implement method overloading in a class Calculator with multiple add methods (int, double, and three numbers).
*/

// class Calculator{
//     void add(int a, int b){
//         System.out.println("Int Arugment add method sum : " + (a+b));
//     }
//     void add(double a, double b){
//        System.out.println("Double Arugment add method sum : "+  (a+b));
//     }
//     void add(int a, int b, int c){
//         System.out.println("Three Argument add method sum: " + (a+b+c));
//     }
// }
// public class Fab8_test{
//     public static void main(String [] args){
//         Calculator obj = new Calculator();
//         obj.add(5,6);
//         obj.add(4.5d, 6.5d);
//         obj.add(4,4,8);

//     }
// }


/*  Static Keyword: Create a class Counter with a static variable count that increments for every object created. Demonstrate static behavior*/

// class Counter{
//     static int count=0;
//     Counter(){
//         count++;
//         System.out.println(count);
//     }
// }
// public class Fab8_test{
//     public static void main(String [] args){
//      Counter obj1 = new Counter();
//      Counter obj2 = new Counter();
//      Counter obj3 = new Counter();
//      Counter obj4 = new Counter();
//      Counter obj5 = new Counter();

//     }
// }

/*  Q.3
Implement a Base class with a method display(), and use the super keyword in the Derived class to call the base class method.*/


// class Base{
//     void display(){
//         System.out.println("Display method in Base class");
//     }
// }
// class DerivedCl extends Base{
//     void show(){
//         super.display();
//         System.out.println("Show Method");
//     }
// }
// public class Fab8_test{
//     public static void main(String [] args){
//         DerivedCl obj = new DerivedCl();
//         obj.show();
   
   

//     }
// }

/*
Q.4
Create an abstract class Shape with an abstract method calculateArea(). Implement Circle and Rectangle classes to calculate areas.*/
// import java.util.*;
// abstract class Shape{
//     abstract float calculateArea();
// }
// class Circle extends Shape{
//     float calculateArea(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Radius of Circle : ");
//         float r = sc.nextFloat();
//         return (3.14f)*r*r;  
//     }
// }
// class Rectangle extends Shape{
//     float calculateArea(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter sides of Ractangle : ");
//         float side1 = sc.nextFloat();
//         float side2 = sc.nextFloat();
//         return side1*side2;

//     }
// }
// public class Fab8_test{
//     public static void main(String [] args){
       
//    Circle cr = new Circle();
//    System.out.println("Area of Circle : " + cr.calculateArea());
//    Rectangle rc = new Rectangle();
//    System.out.println("Area of Ractangle : " + rc.calculateArea());
   

//     }
// }


/*Q5
Create two interfaces Flyable and Swimmable. Implement both in a class Bird that can both fly and swim*/

// interface Flyable{
//     void fly();
// }
// interface Swimmable{
//     void swim();
// }
// class Bird implements Flyable, Swimmable{
//     public void fly(){
//         System.out.println("Bird is flying");
//     }
//     public void swim(){
//         System.out.println("Bird is swimming");
//     }
// }

// public class Fab8_test{
//     public static void main(String [] args){
//         Bird b = new Bird();
//         b.fly();
//         b.swim();
//     }
// }

/*Q.6
Implement dynamic method dispatch using an example of Parent and Child class reference.*/
// class Parent{
//     void show(){
//         System.out.println("Hello from Parent class");
//     }
//     static void display(){
//         System.out.println("Static method of Parent class");
//     }
// }
// class Child extends Parent{
//     //method overriding
//     void show(){
//         System.out.println("Hello from Child class");
//     }
    
//      //method overhiding
//      static void display(){
//         System.out.println("Static method of Child class");
//     }
// }
// public class Fab8_test{
//     public static void main(String [] args){
        
//         // parent class
//         Parent obj = new Parent();
//         obj.show();
//         obj.display();
        
//         //parent reference
//         Parent obj2 = new Child();
//         obj2.show();
//         obj2.display();

//         Child obj3 = new Child();
//         obj3.show();
//         obj3.display();
        
    
//     }
// }

/*Q7 Demonstrate the use of inner classes by creating an Outer class with an Inner class having a method display().*/
// class Outerclass{
//     class InnerClass{
//         void display(){
//             System.out.println("Display methdod of inner class");
//         }
//     }
// }
// public class Fab8_test{
//     public static void main(String [] args){
//         Outerclass obj = new Outerclass();
//         Outerclass.InnerClass obj2 = obj.new InnerClass();
//         obj2.display();
//     }
// }


/*  Q8
Create a Department class that contains an object of an Employee class to show aggregation.*/

// both are in their respective file

/*/Q9   Write a program demonstrating the use of final keyword with a variable, method, and class.*/

// class A{
//     final void display(){
//         System.out.println("Final Display method of class A");
//     }
// }
// class B extends A{
//     // void display(){ // cannot be overridden since display method is final and it can not be overriden
// }


// final class C{
//     void show(){
//         System.out.println("Stranger Things");
//     }
// }
// class D extends C{ // can not inherit final class
//     void nice(){
//         System.out.println("Hello");
//     }
// }

//  public class Fab8_test{
//     public static void main(String [] args){
//         final int a = 34;
//         System.out.println(a);
//         // a = 36; // will give error since final keyword make a variable constant and it can not be reassigned

//         D obj = new D();
//         obj.nice();
//     }
// }

/*Q10
Design a Library Management System
Create a Library Management System using OOP principles. The system should have the following features:

Classes:
Book: Attributes - title, author, ISBN, isAvailable
Member: Attributes - name, memberId, borrowedBooks (list of books)
Librarian: Inherits from Member, has additional permissions to addBook() and removeBook()
Library: Manages books and members
Functionalities:
Members can borrow and return books.
If a book is unavailable, prevent borrowing.
Librarian can add or remove books from the library.
*/
import java.util.*;
class Book{
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;
    Book(){

    }
    Book(String title, String author, String ISBN){
        this.isAvailable = true;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public boolean getIsAvailable(){
        return this.isAvailable;

    }
}

class Members{
    String name;
    int memberId;
    String borrowedBooks[];
    public void setName(String name){
        this.name = name;
    }
    public void setMemberId(int memberId){
        this.memberId = memberId;
    }
    public void setBorrowedBooks(String borrowedBooks[]){
        this.borrowedBooks = new String[length.borrowedBooks];
        for(int i =0;i<length.borrowedBooks;i++){
            this.borrowedBooks[i] = borrowedBooks[i];
        }
        this.borrowedBooks = borrowedBooks;
    }

    public String getName(){
        return this.name;
    }
    public int memberId(){
        return memberId;
    }
    public String[] getBorrowedBooks(){
        return this.borrowedBooks;
    }
}
class Librarian extends Book{
    void addBook(String title, String author, String ISBN){
        Book book = new Book(title, author, ISBN);

    }
    void removeBook(String title){
        if(title == super.title){
            super.isAvailable = false;
            System.out.println("Book Removed");
        } else {
            System.out.println("Mentioned Book is not in database");
        }
        
    }
}

  public class Fab8_test{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        for(;true;){
            System.out.println("Enter 1 if you are librarian 2 if you are memeber and 3 to exit  : ");
            int option = sc.nextInt();
            if(option == 1){
                System.out.println("-----------------------Hello Librarian : We Welcome you(Make sure every answers should be in lower case)----------------------------------");
                while(true){
                    System.out.println("Enter 1 to to add books, 2 to remove book, 3 to see all books and 4 to exit");
                    int opiton2 = sc.nextInt();
                    if(opiton2==1){
                        
                        System.out.println("Enter the book title :");
                        String title = sc.nextLine();
                        System.out.println("Enter Book Author : ");
                        String author = sc.nextLine();
                        System.out.println("Enter ISBM of Book : ");
                        String ISBM = sc.nextLine();
                        Librarian lb = new Librarian();
                        lb.addBook(title,author,ISBM);
                    } else if(opiton2==2){
                        System.out.println("Enter Book Title : ");
                        String title = sc.nextLine();
                        lb.removeBook(title);
                    }
                    else if(opiton2==3){
                        System.out.println("All Books :");
                        System.out.println(lb.getTitle());
                        System.out.println(lb.getAuthor());
                        System.out.println(lb.getISBN());
                        System.out.println(lb.getIsAvailable());
                        System.out.println("-------------------------------------");

                    }
                    else if(opiton2==4){
                        break;
                    }  else {
                        System.out.println("Invalid Option");
                    }

                }
              
            }
            else if(option==2){
                System.out.println("Heloo");
            }
            else if(option==3){
                break;
            } else {
                System.out.println("Wrong Option Selection");
            }
        }
        System.out.println("Program Ended");
        
     
    }
}


