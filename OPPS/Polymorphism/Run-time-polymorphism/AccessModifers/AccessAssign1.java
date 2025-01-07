// Assignment - 07/01/25

/*  Q.1 single level inheritance : 
        method :
        first method :public 
        second method :public       */

        class A{
            public void show(){
                System.out.println("Hello! Golden Globe");
            }
        }

        class B extends A{
            public void display(){
                System.out.println("Bye! Golden Globe");
            }
        }

/*  Q.2 single level inheritance : 
        method :
        first method :protected 
        second method :protected        */

        class A1{
            protected void golden(){
                System.out.println("Best Picture : The Wicked");
            }
        }
        class B1 extends A1{
            protected void globe(){
                System.out.println("Best Limited Series : Shogun");
            }
        }


/*  Q.3 single level inheritance : 
        method :
        first method :public 
        second method :protected    */

        class A2{
            public void naveen(){
                System.out.println("He is Intelligent Guy!");
            }
        }

        class B2 extends A2{
            protected void sain(){
                System.out.println("They don't know how to stay clean.");
            }
        }


/*  Q.4 single level inheritance : 
        method :
        first method :protected 
        second method :public   */

        class A3{
            protected void acadamy(){
                System.out.println("Best Picture : Oppenhiemer");
            }
        }
        class B3 extends A3{
            public void awards(){
                System.out.println("Best Actor : Cilian Murphy");

            } 

         }

/*  Q.5 single level inheritance : 
        method :
        first method :private 
        second method :private      */

        class A4{
            private void critics(){
                System.out.println("Best Limited Series : Kohrra");
            }
            public void access(){
                critics();
            }
        }

        class B4 extends A4{
            private void awards(){
                System.out.println("Best Actor :  Vikrant Massey");
            }
            public void access1(){
                awards();
            }
        }

/*  Q.6 single level inheritance : 
        method :
        first method :private 
        second method :protected        */

        class A5{
            private void nikhil(){
                System.out.println("He is sharma");
            }
                public void access(){
                nikhil();
            }
        }

        class B5 extends A5{
            protected void sharma(){
                System.out.println("Which is nikhil");
            }
        
        }

/*  Q.7 single level inheritance : 
        method :
        first method :protected 
        second method :private      */

        class A6{
            protected void green(){
                System.out.println("Metthew");
            }
        }

        class B6 extends A6 {
            private void lights(){
                System.out.println("McConaughey");
            }
            public void access(){
                lights();
            }
        }


/*  Q.8 multilevel inheritance 
        A
        method1 :private 
        method2 :protected 

        B
        method3 :protected
        method4 :private


        C
        method5 :public 
        method6 :protected


        D
        method7 :private
        method8 :public 


        E 
        method9 :protected 
        method10 :public 

        child k through access  */

        class A7 {
           private void m1(){
                System.out.println("Hello M1 from A7");
            }
            public void accessM1(){
                m1();
            }
            protected void m2(){
                System.out.println("Hello M2 from A7");
            }
        }

        class B7 extends A7{

            protected void m3(){
                System.out.println("Hello M3 from B7");
            }
            private void m4(){
                System.out.println("Hello M4 from B7");
            }
             public void accessM4(){
                m4();
            }
            
        }

        class C extends B7{

            public void m5(){
                System.out.println("Hello M5 from C");
            }
            protected void m6(){
                System.out.println("Hello M6 from C");
            }

        }

        class D extends C{
            private void m7(){
                System.out.println("Hello M7 from D");
            }
             public void accessM7(){
                m7();
            }
            public void m8(){
                System.out.println("Hello M8 from D");
            }
        }
        class E extends D{
            protected void m9(){
                System.out.println("Hello M9 from E");
            }
            public void m10(){
                System.out.println("Hello M10 from E");
            }

        }


/*  Q9  single level inheritance :
        method overriding :  both methods are public    */

        class A8{
            public void display(){
                System.out.println("Hello from A8");
            }
        }
        class B8 extends A8{
            public void display(){
                System.out.println("Hello from B8");
            }
        }

/*  Q10 single level inheritance :
        method overriding :  both methods are protected     */

        class A9{
            protected void show(){
                System.out.println("Hello from A9");
            }
        }
        class B9 extends A9{
            protected void show(){
                System.out.println("Hello from B9");
            }
        }

/*  Q11 single level inheritance :
        method overriding :  both methods are private   */

        class A10{
            private void show(){
                System.out.println("Hello from A10");
            }
        }
        class B10 extends A10{
            private void show(){
                System.out.println("Hello from B10");
            }
        }

        /*  Output : AccessAssign1.java:327: error: show() has private access in B10
                        obj10.show();
                             ^
                        1 error*/


/*  Q12 single level inheritance :
        method overriding :  
        A public 
        B protected */

        // class A11{
        //     public void gold(){
        //         System.out.println("Gold A11");
        //     } 
        // }

        // class B11 extends A11{
        //     protected void gold(){
        //         System.out.println("Gold B11");
        //     }
        // }

        /*  Output : AccessAssign1.java:283: error: gold() in B11 cannot override gold() in A11
                    protected void gold(){
                           ^
                    attempting to assign weaker access privileges; was public
                    1 error*/

/*  Q14 single level inheritance :
        method overriding :  
        A private 
        B protected */

        class A12{
            private void gold(){
                System.out.println("Gold A12");
            } 
        }

        class B12 extends A12{
            
            protected void gold(){
                System.out.println("Gold B12");
            }
        }



/*  Q15 single level inheritance :
            method overriding :  
            A protected 
            B private   */

        // class A13{
        //     protected void gold(){
        //         System.out.println("Gold A13");
        //     } 
        // }

        // class B13 extends A13{
            
        //     private void gold(){
        //         System.out.println("Gold B13");
        //     }
        // }

        /*  Output :  AccessAssign1.java:327: error: gold() in B13 cannot override gold() in A13
        private void gold(){
                         ^
        attempting to assign weaker access privileges; was protected
        AccessAssign1.java:437: error: gold() has private access in B13
        obj13.gold();
                             ^
        2 errors
                                                ^
                    */

/*  Q16 single level inheritance :
            method overriding :  
            A protected  
            B public  */

            class A14{
                protected void gold(){
                    System.out.println("Gold A14");
                }
            }
            class B14 extends A14{
                public void gold(){
                    System.out.println("Gold B14");
                }
            }

            

        public class AccessAssign1{
            public static void main(String [] args){

                //Q.1
                        B obj = new B();
                        obj.show();
                        obj.display();

                //Q.2
                        B1 obj1 = new B1();
                        obj1.golden();
                        obj1.globe();

                //Q.3
                        B2 obj2 = new B2();
                        obj2.naveen();
                        obj2.sain();

                //Q.4
                        B3 obj3 = new B3();
                        obj3.acadamy();
                        obj3.awards();

                //Q.5
                        B4 obj4 = new B4();
                        obj4.access();
                        obj4.access1();

                //Q.6
                        B5 obj5 = new B5();
                        obj5.sharma();
                        obj5.access();

                //Q.7
                        B6 obj6 = new B6();
                        obj6.green();
                        obj6.access();

                //Q.8
                        E obj7 = new E();
                        obj7.accessM1();
                        obj7.m2();
                        obj7.m3();
                        obj7.accessM4();
                        obj7.m5();
                        obj7.m6();
                        obj7.accessM7();
                        obj7.m8();
                        obj7.m9();
                        obj7.m10();

                //Q.9 
                        B8 obj8 = new B8();
                        obj8.display();


                //Q.10
                        B9 obj9 = new B9();
                        obj9.show();

                //Q11
                        // B10 obj10 = new B10();
                        // obj10.show();

                //Q.12
                        // B11 obj11 = new B11();
                        // obj11.gold();

                //Q13
                        B12 obj12 = new B12();
                        obj12.gold();

                //Q.14
                        // B13 obj13 = new B13();
                        // obj13.gold();

                //Q15
                        B14 obj14 = new B14();
                        obj14.gold();
                        

                
            }
        }