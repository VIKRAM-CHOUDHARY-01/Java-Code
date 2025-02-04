interface A{
    static{
        System.out.println("Static block in interface");
    }
}
class B implements A{
    static{
        System.out.println("Static block in class");
    }
}
public class Static_Block5{
    public static void main(String [] args){
        new B();


// interface does not have constructor and we know static method is always executed when the constructor is called thus, in interface static block is not allowed.
        /* Output :

                            Static_Block5.java:2: error: initializers not allowed in interfaces
                        static{
                            ^
                    1 error */
    }
}