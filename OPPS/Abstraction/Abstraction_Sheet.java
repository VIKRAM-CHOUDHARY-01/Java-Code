//Assignment - Abstraction Sheet - 31/01/25

    /*Q1) Create an abstract class Shape with methods calculateArea() and displayDetails(). Create subclasses Circle and Rectangle to implement these methods.    */

            abstract class Shape{
                abstract void calculateArea();
                abstract void displayDetails();
            }

            class Circle extends Shape{
                int radius;
                float area;
                Circle(int radius){
                    this.radius = radius;
                }

                public void calculateArea(){
                    final float pie = 22/7f;
                    area = pie*radius*radius;
                }
                public void displayDetails(){
                    System.out.println("The Area of Circle is : " + area);
                }
            }

            class Rectangle extends Shape{
                int width;
                int length;
                int area;
                Rectangle(int width, int length){
                    this.width = width;
                    this.length = length;
                }

                public void calculateArea(){
                    area = width*length;
                }
                public void displayDetails(){
                    System.out.println("The Width of Rectangle is : " + area);
                }
            }
    /*Q2)   Define an abstract class Animal with an abstract method makeSound(). Implement this in subclasses Dog, Cat, and Cow.*/

                abstract class Animal{
                    abstract void makeSound();
                }
                class Dog extends Animal{
                    public void makeSound(){
                        System.out.println("Bhow");
                    }
                }
                class Cat extends Animal{
                    public void makeSound(){
                        System.out.println("Meow");
                    }
                }
                class Cow extends Animal{
                    public void makeSound(){
                        System.out.println("Murr");
                    }
                }
    /*Q3    Create a class Vehicle with an abstract method startEngine(). Implement this in subclasses Car and Bike to provide custom behavior. */
                abstract class Vehicle{
                    abstract void startEngine();
                }
                class Car extends Vehicle{
                    public void startEngine(){
                        System.out.println("Car Engine Started");
                    }
                }
                class Bike extends Vehicle{
                    public void startEngine(){
                        System.out.println("Bike Engine Started");
                    }
                }

    /*Q4    Write a program using an abstract class Appliance with abstract methods turnOn() and turnOff(). Implement it in classes Fan and WashingMachine*/
                abstract class Appliance{
                    abstract void turnOn();
                    abstract void turnOff();
                }
                class Fan extends Appliance{
                    public void turnOn(){
                        System.out.println("Fan has been turned On");
                    }
                    public void turnOff(){
                        System.out.println("Fan has beend turned Off");
                    }
                }
                class WashingMachine extends Appliance{
                        public void turnOn(){
                        System.out.println("Waching Machine has been turned On");
                    }
                    public void turnOff(){
                        System.out.println("Waching Machine has beend turned Off");
                    }
                }

    /*Q5    Implement an abstract class Employee with an abstract method calculateSalary() and non-abstract methods for setting employee details. Create subclasses Manager and Engineer to provide salary calculation logic.6) */

abstract class Employee{
    private String name;
    private int id;

    abstract void calculateSalary();
    void setEmployeeDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Non-abstract method to display employee details
    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

}
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor for Manager
    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementation of calculateSalary for Manager
 
    void calculateSalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println("Manager's Total Salary: " + totalSalary);
    }
}

// Subclass Engineer
class Engineer extends Employee {
    private double baseSalary;
    private double overtimePay;

    // Constructor for Engineer
    public Engineer(double baseSalary, double overtimePay) {
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    // Implementation of calculateSalary for Engineer
  
    void calculateSalary() {
        double totalSalary = baseSalary + overtimePay;
        System.out.println("Engineer's Total Salary: " + totalSalary);
    }
}


/*Q.6   Design an abstract class BankAccount with abstract methods deposit() and withdraw(). Implement these methods in SavingsAccount and CurrentAccount.*/

abstract class BankAccount{
    abstract void deposit(int amount);
    abstract void withdraw(int withdrawAmount);
}
class SavingsAccount extends BankAccount{
    int balance;
    SavingsAccount(int balance){
        this.balance=balance;
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("Added " + amount + " Now, Balance : " + balance);
    }
    public void withdraw(int withdrawAmount){
        if(withdrawAmount<=balance){
            balance-=withdrawAmount;
            System.out.println("Withdrwal Successfully-> Current Balance : " + balance);
        }else {
            System.out.println("Insufficiant Balance");
        }
    }
}

class CurrentAccount extends BankAccount{
    private int balance;
    private int overdraftLimit;
    CurrentAccount(int balance){
        this.balance = balance;
        this.overdraftLimit=50000;
    }
    public void deposit(int amount){
        if(amount<=0){
            System.out.println("Invalid Deposit Amount");
        }else {
            balance += amount;
            System.out.println(amount + " is added to acount now balance : " + balance);
        }
    }
    public void withdraw(int withdrawAmount){
        
        if(withdrawAmount>0){
                if(balance - withdrawAmount < -overdraftLimit){
            System.out.println("Overdraft Not Allowed, can not exceeds Overdarft more then " + overdraftLimit);
        }else {
            balance-=withdrawAmount;
            System.out.println("Succesfully Withdrawal of " + withdrawAmount + " now balance is : " + balance);
        }

        }else {
            System.out.println("Please enter valid withdraw Amount");
        }
    
    }
}

/*  Q9  Create an abstract class Game with a method play(). Implement it in classes Chess and Football with specific rules for each game.*/

abstract class Game{
    abstract void play(int players);
}
class Chess extends Game{
    public void play(int players){
        if(players==2){
            System.out.println("Chess can be played");
        }else {
            System.out.println("Not the correct amount to play chess professionally");
        }
    }
}
class Football extends Game{
    public void play(int players){
        if(players==22){
            System.out.println("Football can be played professionally");
        }else {
            System.out.println("Not correct numbers of players to play football professionally");
        }
    }
}

/*  Q9  Implement an abstract class Payment with methods processPayment() and generateReceipt(). Create subclasses CreditCardPayment and PaypalPayment.*/

abstract class Payment{
    abstract void processPayment(int payment);
    abstract void generateReceipt();
}
class CreditCardPayment extends Payment{
    int CreditCardLimit;
    int payment;
    CreditCardPayment(int CreditCardLimit){
        this.CreditCardLimit = CreditCardLimit;
    }
    public void processPayment(int payment){
        this.payment= payment;
        if(CreditCardLimit>=payment){
            System.out.println("Payment is processed and here is your recipt");
            CreditCardLimit-=payment;
           
            generateReceipt();
        }else {
            System.out.println("Payment is not processed : cant not process payment more then credit card limit : " + CreditCardLimit);
        }
    }
    public void generateReceipt(){
        System.out.println("Recipt : ");
        System.out.println(
            "Payment made of : " + payment
        );
    }
}

class PaypalPayment extends Payment{
    int paypalBalance;
    int payment;
    PaypalPayment(int paypalBalance){
        this.paypalBalance = paypalBalance;
    }
    public void processPayment(int payment){
        this.payment= payment;
        if(this.paypalBalance>=payment){
            System.out.println("Payment is being processed");
            generateReceipt();
        }else {
            System.out.println("Insufficient Balance on Paypal, Can not process Payment");
        }
    }
    public void generateReceipt(){
        System.out.println("Reciept : ");
        System.out.println("Reciept generated for : " + payment);
    }
}

/*Q10   Design a real-world application where an abstract class Employee has methods for calculating benefits and deductions, with subclasses PartTimeEmployee and FullTimeEmployee.*/

abstract class Employee1{
    abstract void calculatingBenifits(int salary);
}

class PartTimeEmployee extends Employee1{
    public void calculatingBenifits(int salary){
        System.out.println("Part Time Employee benifits : " + salary*0.1);
    }
}
class FullTimeEmployee extends Employee1{
    public void calculatingBenifits(int salary){
        System.out.println("Full Time Employee benifits : " + salary*0.2);
    }
}

/*Q11 Create an abstract class Device with an abstract method operate(). Implement it in classes Laptop, Smartphone, and Tablet*/

    abstract class Device{
        public abstract void operate();
    }
    class Laptop extends Device{
        public void operate(){
            System.out.println("Laptop is being used and irs OS is Mac OS");
        }
    }
    class Smartphone extends Device{
        public void operate(){
            System.out.println("Smartphone is being used and its OS is Android");
        }
    }
    class Tablet extends Device{
        public void operate(){
            System.out.println("Tablet is being used and its OS is Windows");
        }
    }

/*Q12   Write a program to demonstrate runtime polymorphism using an abstract class Shape with subclasses like Triangle, Square, and Pentagon.*/

abstract class Shape1 {
  
    abstract void calculateArea();
}


class Triangle extends Shape1 {
    private double base, height;

 
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

  
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}


class Square extends Shape1 {
    private double side;

    Square(double side) {
        this.side = side;
    }

    void calculateArea() {
        double area = side * side;
        System.out.println("Square Area: " + area);
    }
}

// Pentagon subclass
class Pentagon extends Shape1 {
    private double side, apothem;

    
    Pentagon(double side, double apothem) {
        this.side = side;
        this.apothem = apothem;
    }

    
    void calculateArea() {
        double area = (5 * side * apothem) / 2;
        System.out.println("Pentagon Area: " + area);
    }
}


/* Q13 : Implement an abstract class Transport with a method calculateFare(). Subclasses Bus, Train, and Taxi should have different fare calculation methods.*/


abstract class Transport {
    abstract void calculateFare(int distance);
}

class Bus extends Transport {
    private static final double RATE_PER_KM = 5.0;

    void calculateFare(int distance) {
        double fare = distance * RATE_PER_KM;
        System.out.println("Bus Fare for " + distance + " km: ₹" + fare);
    }
}

class Train extends Transport {
    private static final double RATE_PER_KM = 3.0;

    void calculateFare(int distance) {
        double fare = distance * RATE_PER_KM;
        System.out.println("Train Fare for " + distance + " km: ₹" + fare);
    }
}

class Taxi extends Transport {
    private static final double BASE_FARE = 50.0;
    private static final double RATE_PER_KM = 10.0;


    void calculateFare(int distance) {
        double fare = BASE_FARE + (distance * RATE_PER_KM);
        System.out.println("Taxi Fare for " + distance + " km: ₹" + fare);
    }
}


/*Q14   Write a program using an abstract class Meal with methods prepareIngredients() and cook(). Implement these methods in Pizza and Pasta classes.*/

abstract class Meal {
    abstract void prepareIngredients();
    abstract void cook();
}

class Pizza extends Meal {
    
    public void prepareIngredients() {
        System.out.println("Preparing ingredients for Pizza: Dough, Sauce, Cheese, and Toppings.");
    }

   
    public void cook() {
        System.out.println("Cooking Pizza: Baking in the oven at 200°C for 15 minutes.");
    }
}

class Pasta extends Meal {

    public void prepareIngredients() {
        System.out.println("Preparing ingredients for Pasta: Pasta, Sauce, Vegetables, and Cheese.");
    }

    public void cook() {
        System.out.println("Cooking Pasta: Boiling pasta and sautéing ingredients for 10 minutes.");
    }
}

//Q15 Create an abstract class MobilePhone with methods call() and sendMessage(). Implement it in subclasses Android and iPhone.

abstract class MobilePhone{
    abstract void call();
    abstract void sendMessage();
}
class Android extends MobilePhone{
    public void call(){
        System.out.println("Calling using Android Phone");
    }
    public void sendMessage(){
        System.out.println("Sending message using Android Phone");
    }
}
class Iphone extends MobilePhone{
    public void call(){
        System.out.println("Calling using Iphone");
    }
    public void sendMessage(){
        System.out.println("Sending message using Iphone");
    }
} 

//Q16   Write a program using an abstract class Loan with abstract methods calculateInterest() and approveLoan(). Implement it in subclasses HomeLoan and CarLoan.

abstract class Loan {
    abstract void calculateInterest(int amount, int year, int interestRate);
    abstract void approveLoan();
}
class HomeLoan extends Loan{
    float LoanInterest;
    float interestLimit;
    public void calculateInterest(int amount, int year, int interestRate){
        float interest = (amount*year*interestRate)/100;
        this.LoanInterest = interest;
        System.out.println("The Interest would be : " + interest);
    }
    public void approveLoan(){
        interestLimit = 10000;
        if(LoanInterest>interestLimit){
            System.out.println("Sorry, Loan Can not be approved : loan interest limit is : " + interestLimit);
        }else {
            System.out.println("Congratulations, Loan Approved");
        }
    } 
}
class CarLoan extends Loan{
     float LoanInterest;
    float interestLimit;
    public void calculateInterest(int amount, int year, int interestRate){
        float interest = (amount*year*interestRate)/100;
        this.LoanInterest = interest;
        System.out.println("The Interest would be : " + interest);
    }
    public void approveLoan(){
        interestLimit = 170000;
        if(LoanInterest>interestLimit){
            System.out.println("Sorry, Loan Can not be approved : loan interest limit is : " + interestLimit);
        }else {
            System.out.println("Congratulations, Loan Approved");
        }
    }
}

//Q17   Create an abstract class Report with methods generateReport() and saveReport(). Subclasses like PDFReport and ExcelReport should have their implementations

abstract class Report {
    abstract void generateReport();
    abstract void saveReport();
}
class PDFReport extends Report{
    public void generateReport(){
        System.out.println("Generating PDF Report");
    }
    public void saveReport(){
        System.out.println("Saving PDF Report");
    }
}
class ExcelReport extends Report{
    public void generateReport(){
        System.out.println("Generating Excel Report");
    }
    public void saveReport(){
        System.out.println("Saving Excel Report");
    }
}

//Q18   Develop a file system application where an abstract class File has methods like open() and close(). Implement TextFile and ImageFile.

// Abstract Class: File
abstract class File {
    protected String filename;
    protected double fileSize; // in KB

    public File(String filename, double fileSize) {
        this.filename = filename;
        this.fileSize = fileSize;
    }

    // Abstract methods to be implemented by subclasses
    abstract void open();
    abstract void close();

    // Common methods
    public void renameFile(String newFilename) {
        System.out.println("Renaming " + filename + " to " + newFilename);
        this.filename = newFilename;
    }

    public void deleteFile() {
        System.out.println("Deleting file: " + filename);
    }
}

// TextFile Class
class TextFile extends File {
    private String content;

    public TextFile(String filename, double fileSize, String content) {
        super(filename, fileSize);
        this.content = content;
    }

  
    public void open() {
        System.out.println("Opening Text File: " + filename);
        System.out.println("Content: " + content);
    }

    public void close() {
        System.out.println("Closing Text File: " + filename);
    }

    public void writeContent(String newContent) {
        this.content = newContent;
        System.out.println("Updated content in " + filename);
    }
}

// ImageFile Class
class ImageFile extends File {
    private String resolution;

    public ImageFile(String filename, double fileSize, String resolution) {
        super(filename, fileSize);
        this.resolution = resolution;
    }

   
    public void open() {
        System.out.println("Opening Image File: " + filename);
        System.out.println("Resolution: " + resolution);
    }


    public void close() {
        System.out.println("Closing Image File: " + filename);
    }
}

//Q19  Implement a program demonstrating an abstract class with a constructor, where the constructor sets a value shared by subclasses.


abstract class Vikram {
    protected String changedName; 

    Vikram(String name) {
        this.changedName = "New Name"; 
        System.out.println("Original Name: " + name);
        System.out.println("The Changed Name is: " + this.changedName);
    }
}
class Boy extends Vikram{
    Boy(String name){
        super(name);
    }
}

//Q20   Create an abstract class Ticket with methods bookTicket() and cancelTicket(). Implement these in FlightTicket and TrainTicket
// Abstract Class: Ticket
abstract class Ticket {
    protected String passengerName;
    protected int ticketNumber;
    protected boolean isBooked;

    // Constructor
    public Ticket(String passengerName, int ticketNumber) {
        this.passengerName = passengerName;
        this.ticketNumber = ticketNumber;
        this.isBooked = false; // Default status is not booked
    }

    // Abstract Methods
    abstract void bookTicket();
    abstract void cancelTicket();

    // Common Method
    public void showTicketDetails() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Status: " + (isBooked ? "Booked" : "Not Booked"));
    }
}

// FlightTicket Class
class FlightTicket extends Ticket {
    private String flightNumber;
    
    public FlightTicket(String passengerName, int ticketNumber, String flightNumber) {
        super(passengerName, ticketNumber);
        this.flightNumber = flightNumber;
    }

    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Flight ticket booked for " + passengerName + " on flight " + flightNumber);
        } else {
            System.out.println("Flight ticket already booked.");
        }
    }

    public void cancelTicket() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Flight ticket for " + passengerName + " has been canceled.");
        } else {
            System.out.println("No flight ticket to cancel.");
        }
    }
}

// TrainTicket Class
class TrainTicket extends Ticket {
    private String trainNumber;
    
    public TrainTicket(String passengerName, int ticketNumber, String trainNumber) {
        super(passengerName, ticketNumber);
        this.trainNumber = trainNumber;
    }

  
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Train ticket booked for " + passengerName + " on train " + trainNumber);
        } else {
            System.out.println("Train ticket already booked.");
        }
    }


    public void cancelTicket() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Train ticket for " + passengerName + " has been canceled.");
        } else {
            System.out.println("No train ticket to cancel.");
        }
    }
}

public class Abstraction_Sheet{
    public static void main(String [] args){
            //Q.1
                int radius = 7;
                Circle cr = new Circle(radius);
                cr.calculateArea();
                cr.displayDetails();

                Rectangle rt = new Rectangle(5,10);
                rt.calculateArea();
                rt.displayDetails();
            //Q.2
                Dog dg = new Dog();
                dg.makeSound();
                Cat ct = new Cat();
                ct.makeSound();
                Cow cw = new Cow();
                cw.makeSound();

            //Q3
                Bike b = new Bike();
                b.startEngine();
                Car c = new Car();
                c.startEngine();

            //Q4
                Fan f = new Fan();
                f.turnOn();
                f.turnOff();
                WashingMachine wm = new WashingMachine();
                wm.turnOn();
                wm.turnOff();

            //Q5
                Manager mg = new Manager(50000,1000);
                mg.calculateSalary();
                Engineer en = new Engineer(50000,1000);
                en.calculateSalary();

            //Q6
                SavingsAccount sa = new SavingsAccount(1000);
                sa.deposit(5000);
                sa.withdraw(1000);

                CurrentAccount ca = new CurrentAccount(1000);
                ca.deposit(5000);
                ca.withdraw(10000);

            //Q7
                Chess ch = new Chess();
                ch.play(2);
                Football fb = new Football();
                fb.play(22);

            //Q9 

                CreditCardPayment ccp = new CreditCardPayment(50000);
                ccp.processPayment(5000);

                PaypalPayment pp = new PaypalPayment(5000);
                pp.processPayment(2000);

            //Q10
                PartTimeEmployee pe = new PartTimeEmployee();
                pe.calculatingBenifits(50000);
                FullTimeEmployee fe = new FullTimeEmployee();
                fe.calculatingBenifits(50000);

            //Q11

                Laptop lp = new Laptop();
                lp.operate();
                Smartphone dt = new Smartphone();
                dt.operate();
                Tablet tb = new Tablet();
                tb.operate();

            //Q12

                    Shape1 shape;

                    shape = new Triangle(10, 5);
                    shape.calculateArea();  

                    shape = new Square(4);
                    shape.calculateArea();

                    shape = new Pentagon(6, 4);
                    shape.calculateArea();  


            //Q13
                    Transport transport;

                        transport = new Bus();
                        transport.calculateFare(10);

                        transport = new Train();
                        transport.calculateFare(10);

                        transport = new Taxi();
                        transport.calculateFare(10);


            //Q14

                        Meal meal;

                        meal = new Pizza();
                        meal.prepareIngredients();
                        meal.cook();

                        System.out.println();

                        meal = new Pasta();
                        meal.prepareIngredients();
                        meal.cook();

            //Q15

                    Android ad = new Android();
                    ad.sendMessage();
                    ad.call();
                    Iphone i = new Iphone();
                    i.sendMessage();
                    i.call();


            //Q16  

                    HomeLoan hl = new HomeLoan();
                    hl.calculateInterest(100,2,10);
                    hl.approveLoan();

                    CarLoan cl = new CarLoan();
                    cl.calculateInterest(500000,7,12);
                    cl.approveLoan();


            //Q17
                    ExcelReport er = new ExcelReport();
                    er.generateReport();
                    er.saveReport();
                    PDFReport pd = new PDFReport();
                    pd.generateReport();
                    pd.saveReport();


            //Q18   

                    File textFile = new TextFile("document.txt", 15.2, "Hello, this is a sample text file.");
                    File imageFile = new ImageFile("photo.jpg", 1024.5, "1920x1080");

                    // Opening files
                    textFile.open();
                    imageFile.open();

                    System.out.println("------------------------------");

                    // Rename and delete operations
                    textFile.renameFile("notes.txt");
                    imageFile.renameFile("new_photo.jpg");

                    textFile.deleteFile();
                    imageFile.deleteFile();

                    System.out.println("------------------------------");

                    // Closing files
                    textFile.close();
                    imageFile.close();

            //Q19
                    Boy boy = new Boy("Richie");


            //Q20   
                    Ticket flight = new FlightTicket("John Doe", 101, "AI202");
                    Ticket train = new TrainTicket("Alice Smith", 202, "EXP123");

                    // Booking Tickets
                    flight.bookTicket();
                    train.bookTicket();

                    System.out.println("--------------------");

                    // Show Ticket Details
                    flight.showTicketDetails();
                    train.showTicketDetails();

                    System.out.println("--------------------");

                    // Canceling Tickets
                    flight.cancelTicket();
                    train.cancelTicket();

                    System.out.println("--------------------");

                    // Show Ticket Details Again
                    flight.showTicketDetails();
                    train.showTicketDetails();
                  




    }
}