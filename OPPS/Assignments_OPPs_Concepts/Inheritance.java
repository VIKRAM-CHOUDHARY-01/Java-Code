//OPPS CONCPET - INHERITANCE ASSIGNMNET SHEET

    /*  1)  Write a Java program to demonstrate single-level inheritance where a Student class inherits from a Person class.    */

        class Person{
            String name;
            Person(String name){
                this.name = name;
                System.out.println("Person constructor called and its name is " + this.name);
            }
            void Work(){
                System.out.println("Vikram");
            }
        }
        class Student extends Person{
            Student(String s){
                super(s);
            }
            void Work(){
                System.out.println("He works at what not");
            }
        }

    /*  2) Create a Java program where a Dog class inherits a Mammal class, and call a method to display their characteristics. */
        class Mammal{
            String s;
            Mammal(String s){
                this.s = s;
                System.out.println(this.s);
            }

            void sound(){
                System.out.println("This method will not be called");
            }

        }
        class Dog extends Mammal{
            Dog(String s){
                super(s);
            }
            void sound(){
                System.out.println("Bhow");
            }
        
        }


    /*  3)  Implement a program where a Car class inherits from a Vehicle class, and call the inherited method in the subclass. */

        class Vehicle{
            String vech;
            Vehicle(String vech){
                this.vech = vech;
                System.out.println("Hello All" + this.vech);
            }
            void engine(){
                
                System.out.println("Every car has engine");
            }
        }

        class Car extends Vehicle{
            Car(String s){
                super(s);
            }
            void engine(){
                super.engine();
                System.out.println("V8"+ super.vech);
            }
        }

    /*  4)  Write a Java program where a Rectangle class inherits a Shape class and calculates the area using a method in the superclass.   */

        class Shape{
            void area(){}
        }

    
            public class Inheritance{
                public static void main(String [] args){

                    //Q.1
                            Student st = new Student("Vikram");
                            st.Work();

                    //Q.2
                            Dog dg = new Dog("Mammels");
                            dg.sound();

                    //Q3
                            Car cr = new Car("Vehicals");
                            cr.engine();
                            


                }
            }