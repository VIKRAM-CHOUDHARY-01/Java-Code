//Assignment - Constructor Part 1 21/12/24
/*  Q1
        	return and argument 
            A :
	        primtiive data type 

        */

    class A{
        int age(int age){
            return age;
        }
    }

/* Q2

        A class 
        string 

        B class
        covariant return type 
        welcome to india */

        class A1{
            String show(){
                return"Hello String";
            }
        }

        class B {
            B m1(){
                System.out.println("Welcome to india");
                return this;
            }
        }

/*  Q3
        
        A :
            method one 
        B:
            method one 
        C:
            method three
        D:
            method four  */

        class A2{
            void m1(){
                System.out.println("Class AMethod 1");
            }
        }
        class B1{
            void m2(){
                System.out.println("Class B Method 2");
            }
        }
        class C1{
            void m3(){
                System.out.println("Class C Method 3");
            }
        }

        class D1{
            void m4(){
                System.out.println("Class D Method 4");
            }
        }

/*  Q4 
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


    public class ConstructorAssignPart3{
        public static void main(String []args){
            //Q1
                A obj = new A();
                System.out.println("The Age is : " + obj.age(23));

            //Q2

                A1 ob = new A1();
                System.out.println(ob.show());
                B obj1 = new B();
                obj1.m1();


            //Q3    
                A2 opp = new A2();
                opp.m1();
                B1 obj2 = new B1();
                obj2.m2();
                C1 obj3 = new C1();
                obj3.m3();
                D1 obj4 = new D1();
                obj4.m4();

            //Q4
                A3 open = new A3();
                System.out.println("The add : " + open.add(5,6));
                System.out.println("The sub : " + open.sub(15,6));
                System.out.println("The multi : " + open.multi(5,6));
                System.out.println("The div : " + open.div(25,5));

                B3 hiem = new B3();
                System.out.println(hiem.even(10));

                C3 er = new C3();
                System.out.println(er.odd(11));



            }
    }