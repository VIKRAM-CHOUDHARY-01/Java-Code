    class A{
        private A(){
            System.out.println("Hello from Private Constructor");
        }
        //First Way
        static void show(){
            new A();
        }
        //Second Way
        public A(int a){
            this();
                //or
                    // new A();
        }

        //third way

            static A show1(){
                return new A();
            }

    
    }

    public class Private_Constructor{
        public static void main(String [] args){
            A.show();
            new A(3);
            A obj = A.show1();

        }
    }