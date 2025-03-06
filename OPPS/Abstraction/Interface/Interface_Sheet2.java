//Assignment - Interface Sheet - 31/01/25

/*  static :
        1)
        Write a Java program to demonstrate the use of a static variable to count the number of objects created for a class.    */

class A{
    static int count = 1;
    public A(){
        System.out.println(count);
        count++;
        
    }
}


    //4) Write a program to compare the behavior of static and non-static variables
    class B{
        static int a = 1;
         B(){
            int b =1;
            System.out.println("Static Int -> "+ a);
            System.out.println("Normal Int -> " + b);
            a++;
            b++;
        }
    }

public class Interface_Sheet2{
        //2)    Create a program to calculate the area of a rectangle using a static method.
        static void rectangleArea(int length, int width){
            int area = length * width;
            System.out.println("Area of rectangle is: "+area);
        }

        //3) Write a program that uses a static method to convert temperatures from Celsius to Fahrenheit.
            static void temperatures(float Celsius){
                float Fahrenheit = ((9/5)*Celsius)+32;
                System.out.println(Celsius+" degree Celsius is equal to "+Fahrenheit+" degree Fahrenheit");
            }


    //5   Write a Java program to demonstrate the use of a static block for initializing static variables.
    static int a;
    static{
      a = 34;
    }

    static void p(){
        System.out.println(a);
    }


        
    public static void main(String[] args) {
        //1
                A obj1 = new A();
                A obj2 = new A();
                A obj3 = new A();

        //2
                rectangleArea(4,5);

        //3
                temperatures(7);


        //4

                B ob = new B();
                B ob1 = new B();
                B ob2 = new B();
                B ob3 = new B();

        //5

               p();
                

    }
}