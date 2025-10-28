package com.oop.remaining;

//Main class to test all three
public class Dependency {
 public static void main(String[] args) {

     System.out.println("=== Parameter Time Dependency ===");
     Printer sharedPrinter = new Printer();
     StudentPTD student1 = new StudentPTD();
     student1.submitProject(sharedPrinter);

     System.out.println("\n=== Constructor Time Dependency ===");
     StudentCTD student2 = new StudentCTD(sharedPrinter);
     student2.submitProject();

     System.out.println("\n=== Runtime Dependency ===");
     StudentRTD student3 = new StudentRTD();
     student3.submitProject();
 }
}
//Common dependency class (Printer)
class Printer {
 void print(String message) {
     System.out.println("Printing: " + message);
 }	
}

//1️⃣ Parameter Time Dependency (PTD)
class StudentPTD {
 void submitProject(Printer printer) {
     System.out.println("StudentPTD is submitting project...");
     printer.print("PTD Project Report");
 }
}

//2️⃣ Constructor Time Dependency (CTD)
class StudentCTD {
 private Printer printer;

 // Dependency injected at constructor time
 StudentCTD(Printer printer) {
     this.printer = printer;
 }

 void submitProject() {
     System.out.println("StudentCTD is submitting project...");
     printer.print("CTD Project Report");
 }
}

//3️⃣ Runtime Dependency (RTD)
class StudentRTD {
 void submitProject() {
     System.out.println("StudentRTD is submitting project...");
     Printer printer = new Printer(); // dependency created at runtime
     printer.print("RTD Project Report");
 }
}


