// OPPS Assignment - 18/12/24

/*  Q.1
    			no return and argument 
                A :
                    method one 
                B:
                    method one 
                C:
                    method three
                D:
                    method four  */

        class A1{
            void m1(String name){
                System.out.println("Person Name : " + name);
            }
        }
        class B1{
            void m2(int age){
                System.out.println("Person Age : " + age);
            }
        }
        class C1{
            void m3(String address){
                System.out.println("Person Address : " + address);
            }
        }

        class D1{
            void m4(int mob){
                System.out.println("Person Moblie Number : " + mob);
            }
        }

/*  Q2
        user input : 

            class A:
                add()
                sub()
                div()
                multi() 

            class B
                even()

            class C 
                odd ()
                */

            class A3{
            int add(int a, int b){
                return (a+b);
            }
            int sub(int a, int b){
                return (a-b);
            }
            int multi(int a, int b){
                return (a*b);
            }
            double div(int a, int b){
                if(b==0){
                    System.out.println("Error");
                    return 0;
                } else {
                    return (a/b);
                }
            }
        }

        class B3{
            String even(int a){
                if(a%2==0){
                   return "It's Even";
                }
                else {
                    return "It's Odd";
                }
            }
        }

        class C3{
            String odd(int a){
                if(a%2!=0){
                   return "It's Odd";
                } else {
                    return "It's even";
                }
            }
        }

/* Q.3
        		return and no argument :
            A :
                primtiive data type 
                */

               class A4{
                int returnPrimitiveData(){
                    return 10;
                }
               }

/*  Q4
            A class 
            string 

            B class
                covariant return type 
                welcome to india 


                        */


        class A5{
            String show(){
                return"Hello String";
            }
        }

        class B5 {
            B5 m1(){
                System.out.println("Welcome to india");
                return this;
            }
        }

/*  Q5
            A :
                method one 
            B:
                method one 
            C:
                method three
            D:
                method four 
            */

        class A6{
            void m1(){
                System.out.println("Class AMethod 1");
            }
        }
        class B6{
            void m2(){
                System.out.println("Class B Method 2");
            }
        }
        class C6{
            void m3(){
                System.out.println("Class C Method 3");
            }
        }

        class D6{
            void m4(){
                System.out.println("Class D Method 4");
            }
        }

/*  Q6
        user input : 

                class A:
                    add()
                    sub()
                    div()
                    multi() 

                class B
                    even()

                class C 
                    odd ()


            */

         class A7{
            int add(int a, int b){
                return (a+b);
            }
            int sub(int a, int b){
                return (a-b);
            }
            int multi(int a, int b){
                return (a*b);
            }
            double div(int a, int b){
                if(b==0){
                    System.out.println("Error");
                    return 0;
                } else {
                    return (a/b);
                }
            }
        }

        class B7{
            String even(int a){
                if(a%2==0){
                   return "It's Even";
                }
                else {
                    return "It's Odd";
                }
            }
        }

        class C7{
            String odd(int a){
                if(a%2!=0){
                   return "It's Odd";
                } else {
                    return "It's even";
                }
            }
        }





        public class MethodsAssign{
            public static void main(String []args){

            //Q/1
                A1 o = new A1();
                o.m1("Virkam");
                B1 o1 = new B1();
                o1.m2(25);
                C1 o2 = new C1();
                o2.m3("Lahore");
                D1 o3 = new D1();
                o3.m4(23);

            //Q2
                A3 open = new A3();
                System.out.println("The add : " + open.add(5,6));
                System.out.println("The sub : " + open.sub(15,6));
                System.out.println("The multi : " + open.multi(5,6));
                System.out.println("The div : " + open.div(25,5));

                B3 hiem = new B3();
                System.out.println(hiem.even(10));

                C3 er = new C3();
                System.out.println(er.odd(11));
            
            //Q.3
                A4 a = new A4();
                System.out.println(a.returnPrimitiveData());

            ///Q4
                A5 baribe = new A5();
                System.out.println(baribe.show());

                B5 br = new B5();
                br.m1();

            //Q5

                A6 opp = new A6();
                opp.m1();
                B6 obj2 = new B6();
                obj2.m2();
                C6 obj3 = new C6();
                obj3.m3();
                D6 obj4 = new D6();
                obj4.m4();

            //Q6   

                A7 last = new A7();
                System.out.println("The add : " + last.add(5,6));
                System.out.println("The sub : " + last.sub(15,6));
                System.out.println("The multi : " + last.multi(5,6));
                System.out.println("The div : " + last.div(25,5));

                B7 last1 = new B7();
                System.out.println(last1.even(10));

                C7 last2 = new C7();
                System.out.println(last2.odd(11));
                

                           
             }
        }
