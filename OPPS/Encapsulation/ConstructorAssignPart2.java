//Assignment - Constructor Part 1 20/12/24

/* Q1   class A
	    parameterised constructor :two number addition 

        class B
            parameterised constructor :two number subs

        class C
            parameterised constructor :two number div

        class D
            parameterised constructor :two number multi
                                                            */

            //    class A{
            //     A(int a, int b){
            //         int sum = a + b;
            //         System.out.println("The Sum is : " + sum);
            //     }
            //    }
            //    class B{
            //     B(int a, int b){
            //         int sub = a - b;
            //         System.out.println("The Sub is : " + sub);
            //     }
            //    }

            // class C{
            //      C(int a, int b){
            //         int div = a / b;
            //         System.out.println("The Div is : " + div);
            //     }
            //    }

            // class D{
            //      D(int a, int b){
            //         int multi = a * b;
            //         System.out.println("The Div is : " + multi);
            //     }
            //    }

/*  Q.2 
        class A
            constructor 
            method :
            no return and no argument 
            return and argument 
            return and no argument 

            call two ways : 

        */

    // class A{
    //     A(){
    //         System.out.println("In Constructor");
    //     }

    //     void show(){
    //         System.out.println("In show method");
    //     }
    //     int age(int age){
    //        return age;
    //     }
    //     String name(){
    //         return "Hello Mf";
            
    //     }
    // }


/*  Q3
        two number addition through instance variable way :constant 
        */

    //    class A{
    //     int a = 23;
    //     int b= 23;
    //     A(){
    //         System.out.println("The add : "+  (a+b));
    //     }
    //    }


/*  Q4
        user input of instance variable through method and parameter name is also different : 
        add()
        sub()
        div()
        multi() 
        no third variable allow 
        */

    //    class A{
    //     int a;
    //     int b;
    //     int add(int a1, int b1){
    //         a = a1;
    //         b = b1;
    //         return (a+b);
    //     }
    //     int sub(int a1, int b1){
    //         a = a1;
    //         b = b1;
    //         return(a-b);
    //     }
    //     double div(int a1, int b1){
    //         a = a1;
    //         b = b1;
    //         return (a/b);
    //     }
    //     int multi(int a1, int b1){
    //         a = a1;
    //         b = b1;
    //         return a*b;
    //    }
    // }

/*  Q5
        /user input of instance variable through parameterised constructor and parameter name is also different 
        A :addition

        B :sub

        C :multi

        D:div
        */

        // class A{
        //     int a;
        //     int b;
        //     A(int a1,int b1){
        //         a = a1;
        //         b = b1;
        //         System.out.println("The Add is : " + (a+b));
        //     }
        // }
        // class B{
        //     int a;
        //     int b;
        //     B(int a1,int b1){
        //         a = a1;
        //         b = b1;
        //         System.out.println("The Sub is : " + (a-b));
        //     }
        // }

        // class C{
        //     int a;
        //     int b;
        //     C(int a1,int b1){
        //         a = a1;
        //         b = b1;
        //         System.out.println("The Multi is : " + (a*b));
        //     }
        // }
        // class D{
        //     int a;
        //     int b;
        //     D(int a1,int b1){
        //         a = a1;
        //         b = b1;
        //         System.out.println("The Sub is : " + (a/b));
        //     }
        // }

/*  Q6
        user input of instance variable through method and parameter name is same 
        add()
        sub()
        div()
        multi() 
        no third variable allow 

        */

        //    class A{
        //     int a;
        //     int b;
        //     void add(int a, int b){
        //         this.a = a;
        //         this.b = b;
        //         System.out.println("The Sum is : " + (a+b));
        //     }
        //      void sub(int a, int b){
        //         this.a = a;
        //         this.b = b;
        //         System.out.println("The Sub is : " + (a-b));
        //     }

        //      void multi(int a, int b){
        //         this.a = a;
        //         this.b = b;
        //         System.out.println("The Multi is : " + (a*b));
        //     }

        //      void div(int a, int b){
        //         this.a = a;
        //         this.b = b;
        //         if(b==0){
        //             System.out.println("Error");
        //         } else {
        //             System.out.println("The Sub is : " + (a/b));
        //         }  
        //     }
        //    }

/*  Q7
        user input of instance variable through parameterised constructor and parameter name same : 

        A :addition

        B :sub

        C :multi

        D:div
        */  

       class A{
        int a;
        int b;
        A(int a, int b){
            this.a = a;
            this.b= b;
            System.out.println("The Sum is : " + (this.a+this.b));
        }
       }
       
           class B{
        int a;
        int b;
        B(int a, int b){
            this.a = a;
            this.b= b;
            System.out.println("The Sub is : " + (this.a-this.b));
        }
       }

           class C{
        int a;
        int b;
        C(int a, int b){
            this.a = a;
            this.b= b;
            System.out.println("The Multi is : " + (this.a*this.b));
        }
       }

           class D{
        int a;
        int b;
        D(int a, int b){
            this.a = a;
            this.b= b;
            System.out.println("The Div is : " + (this.a/this.b));
        }
       }


    public class ConstructorAssignPart2{
        public static void main(String [] args){
            //Q.1
            // A o = new A(5,6);
            // B ob = new B(5,10);
            // C obj = new C(100,5);
            // D obb = new D(50,5);

            //Q.2

            // A obj = new A();
            // obj.show();
            // System.out.println(obj.age(34));
            // System.out.println(obj.name());


            // Q3
                // A ob = new A();

            //Q4
                // A obj = new A();
                // System.out.println(obj.add(5, 6));
                // System.out.println(obj.sub(5, 6));
                // System.out.println(obj.div(5, 6));
                // System.out.println(obj.multi(5, 6));

            //Q5

                // A obj = new A(2,4);
                // B ob = new B(10,2);
                // C o = new C(2,4);
                // D obb = new D(4,2);

            //Q6

                // A obj = new A();
                // obj.add(4,5);
                // obj.sub(14,5);
                // obj.div(40,5);
                // obj.multi(4,5);

            //Q7

                A obj = new A(2,4);
                B ob = new B(10,2);
                C o = new C(2,4);
                D obb = new D(4,2);





        }
    }