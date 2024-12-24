//Assignment - 23/12/24


    // 1)Basic Getter and Setter
        // Create a class Person with two fields: name (String) and age (int). Write getter and setter methods for both fields.

        class Person{
            private String name;
            private int age;

            public void setPerson(String name, int age){
                this.name = name;
                this.age=age;
            }

            public int getPersonAge(){
                return age;
            }

            public String getPersonName(){
                return name;
            }
        }
    //2 Constructor with Getter and Setter
        // Create a class Student with fields id (int) and name (String). Initialize these fields using a constructor and then write getter and setter methods.
        
        class Student{
            private int studentAge;
            private String studentName;
            
            Student(int studentAge, String studentName){
                this.studentAge = studentAge;
                this.studentName = studentName;
            }
            // Getter method for studentAge
            public String getStudentName(){
                return studentName;
            }
            public int getStudentAge(){
                return studentAge;
            }
        }
    //3 Using Getter and Setter
        // Write a class Book with a private field price (double). Use a setter method to set the price and a getter method to retrieve the price.

        class Book{
            private double price;
            public void setPrice(double price){
                this.price=price;
            }
            public double getPrice(){
                return price;
            }
        }

    //4 Validation in Setter
        // In the Employee class, create a setter for the salary field (double). Ensure that the salary cannot be set to a negative value. If the value is invalid, set it to 0.
        
        class Employee{
            private double salary;
            public void setSalary(double salary){
                if(salary>=0){
                    this.salary=salary;
                } else{
                    this.salary=0;
                }   
            }

            public double getSalary(){
                return salary;
            }
        }

    //5 Getter for Calculated Value
        // Create a Rectangle class with private fields length (double) and width (double). Write getter methods for length and width, and add a getter for area that calculates the area (length * width).


        class Rectangle{
            private double length;
            private double width;

            public void setLength(double length){
                this.length = length;
                this.width = width;
            }
            public void setWidth(double width){
                this.width = width;
            }

            public double getlenght(){
                return length;
            }
            public double getwidth(){
                return width;
            }
            public double rectangleArea(){
                return length*width;
            }
        }

    //6 Getter and Setter for Array
        // Create a class Marks with a private field grades (int array). Write setter and getter methods for the grades array.

        class Marks{    
            private int[] grades;

            public void setGrade(int [] grades){
                 // Initialize the array to match the input size
                 this.grades = new int[grades.length];
                for(int i =0;i<grades.length;i++){
                    this.grades[i] = grades[i];
                }
                
            }

            public int[] getGrade(){
                return this.grades;
            }
        }

    //Q7 Access Modifiers for Getter and Setter
            // Write a class Account with private fields balance (double) and accountNumber (String). Implement getter and setter methods with public visibility and test them from outside the class.
            class Account{
                private double balance;
                private String accountNumber;

                public void setBalance(double balance){
                    this.balance=balance;
                }
                public void setAccountNumber(String accountNumber){
                    this.accountNumber = accountNumber;
                }

                public double getBalance(){
                    return balance;
                }
                public String getAccountNumber(){
                    return accountNumber;
                }
            }

    //Q8 Getter and Setter with Validation
            // Create a class Student with fields name (String) and marks (double). Write setter methods with validation to ensure that marks cannot be set to values less than 0 or greater than 100.

            class Student1{
                private String stuName;
                private double stuMarks;

                public void setStuName(String name){
                    this.stuName = name;
                }
                public void setStuMarks(double stuMarks){
                    if(stuMarks>=0 && stuMarks<=100){
                        this.stuMarks = stuMarks;
                    } else {
                        System.out.println("Invalid Marks");
                    }
                }

                public double getstuMarks(){
                    return stuMarks;
                }
                public String getstuName(){
                    return stuName;
                }
            }

    //Q9 Setter with Argument Validation
            // Create a class Person with a private field age (int). Write a setter that ensures the age is greater than 0 and less than 130, throwing an exception if invalid.

            class Person1{
                private int perAge;
                public void setPerAge(int perAge){
                    if(perAge>0 && perAge<=130){
                        this.perAge = perAge; 
                    } else {
                         throw new IllegalArgumentException("Age must be between 1 and 130.");
                    }
                    }

                    public int getPerAge(){
                        return perAge;
                    }
                
            }
    //Q10 Default Values with Getter and Setter
            // Create a class Student with a private field marks (int). Write a setter method that sets the value and a getter that returns the value, ensuring the default marks value is 0.
            
            class Student2{
                private int mark2;

                public void setMark2(int mark2){
                    this.mark2 = mark2;
                }
                public int getMark2(){
                    return mark2;
                }
            }

public class GetterSetterAssign1{
    public static void main(String []args){
        //Q.1
        Person per = new Person();
        per.setPerson("Santa Clause", 69);
        System.out.println("The name : " + per.getPersonName() + " and age is : " + per.getPersonAge());
        
        //Q.2
        Student st = new Student(21, "Vikram Choudhary");
        System.out.println("The Student name is : " + st.getStudentName() + " and age is : " + st.getStudentAge());

        //Q3
        Book b = new Book();
        b.setPrice(800);
        System.out.println("The book price is : " + b.getPrice());

        //Q4
        Employee emp = new Employee();
        emp.setSalary(500);
        System.out.println("The Salary is : " + emp.getSalary());

        //Q5
        Rectangle rt = new Rectangle();
        rt.setLength(50);
        rt.setWidth(5);
        System.out.println("The Length : " + rt.getlenght() + " and width : " + rt.getwidth() + " Area is : " + rt.rectangleArea());

        //Q6
        Marks mk = new Marks();
         // Set grades using an array
        int[] gradesArray = {80, 100, 70, 60};
        mk.setGrade(gradesArray);

        // Get grades and display them
        int[] retrievedGrades = mk.getGrade();
        System.out.print("Grades: ");
        for (int i =0;i<4;i++) {
            System.out.println(retrievedGrades[i]);
        }

        //Q7

        Account act = new Account();
        act.setBalance(1000);
        act.setAccountNumber("ZeroZeroSeven");
        System.out.println("The Balance is : " + act.getBalance() + " the account number : " + act.getAccountNumber());

        //Q8
        Student1 stu1 = new Student1();
        stu1.setStuName("Vikram Choudhary");
        stu1.setStuMarks(89);
        System.out.println("Thr Student name is : " + stu1.getstuName() + " and marks are : " + stu1.getstuMarks());

        //Q9
        Person1 pr1 = new Person1();
        pr1.setPerAge(56);
        System.out.println("The age is : " + pr1.getPerAge());

        //Q10
        Student2 studen1 = new Student2();
        System.out.println("The Student Mark is : " + studen1.getMark2());


    }
}