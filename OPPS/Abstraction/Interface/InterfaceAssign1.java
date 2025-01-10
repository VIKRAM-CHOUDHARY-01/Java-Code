//Assignment 10/01/25

/*  Q.1 interface : 
                method1 :no return and no argument 
                method2:no return and  argument 
                method3: return and no argument 
                method4 : return and  argument 

            another class access    */

    interface A{
        void method1();
        void method2(String name);
        String method3();
        int method4(int a);
    }

    class B implements A{
        @Override
        public void method1(){
            System.out.println("Interface A first Abstract Method");
        }
        @Override
        public void method2(String name){
            System.out.println("Interface A second Abstract Method with name : " + name);
        }
        @Override
        public String method3(){
            return "Interface A second Abstract Method with String return";
        }
        @Override
        public int method4(int a){
            return a;
        }
    }

/*  Q.2 multiple inheritance

            interface : 
                method1 :no return and no argument 

            interface : 
                method2:no return and  argument 

            interface : 
                method3: return and no argument 

            interface : 
                method4 : return and  argument 

            another class access        */

            interface A1{
                void method1();
            }
            interface B1{
                void method2(String name);
            }
            interface C1{
                String method3();
            }
            interface D1{
                int method4(int a);
            }

            class B2 implements A1,B1,C1,D1{
                @Override
                public void method1(){
                    System.out.println("Interface A1 first Abstract Method");
                }

                @Override
                public void method2(String name){
                    System.out.println("Interface B1 second Abstract Method with name : " + name);
                }

                @Override
                public String method3(){
                    return "Interface C1 third Abstract Method";
                }

                @Override
                public int method4(int a){
                    return a*a;
                }

            }

/*  Q.3 interface : 
                method1 :no return and no argument 
                method2:default no return and  argument 
                method3:private return and no argument 
                method4 :private return and argument 

            another class access    */

            interface C{
                void m1();
                // default void m2();
                // private void m3();
                // private void m4(int a);

                /*  We can only declare public absrtact method in interface */
            }
            class A3 implements C{
                @Override
                public void m1(){
                    System.out.println("Interface A3 first Abstract Method");
                    }
                 
            }


/*  Q.4 interface 
                method3:private return and no argument 

            interface 
                method4 : return and argument 

            class :first inter

            class :Second inter

            class :first and second 
            access      */

        interface A4{
            private String m3(){
                return "Since we can not declare private abstract method in interface so I am declaring it as non abstract and using an another default non abstract method";
            }
            default void accessM3(){
                System.out.println(m3());
            }
        }
        interface A5{
            String m4(String a);
        }
        class A6 implements A4{};
        class A7 implements A5{
            @Override
            public String m4(String a){
                return a;
            }
        }


    public class InterfaceAssign1{
        public static void main(String [] args){

            //Q.1
                    B obj  = new B();
                    obj.method1();
                    obj.method2("Fateh");
                    System.out.println(obj.method3());
                    System.out.println(obj.method4(45));


            //Q.2
                    B2 obj2 = new B2();
                    obj2.method1();
                    obj2.method2("Methew");
                    System.out.println(obj2.method3());
                    System.out.println(obj2.method4(2));

            //Q.3
                    A3 obj3 = new A3();
                    obj3.m1();

            //Q.4
                    A6 obj4 = new A6();
                    obj4.accessM3();

                    A7 obj5 = new A7();
                    System.out.println(obj5.m4("Hello"));
        }
    }