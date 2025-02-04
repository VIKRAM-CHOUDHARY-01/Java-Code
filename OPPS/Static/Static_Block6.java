class A{
    int a = 34;
    void show(){
        System.out.println("Hello from non-static method of class A");
    }
    static{
        System.out.println(a);
        show();
    }
}
public class Static_Block6{

    public static void main(String [] args){
        new A();

        // we can not access non-static variables and method in static block

            /*  Output :
                            Static_Block6.java:7: error: non-static variable a cannot be referenced from a static context
                                    System.out.println(a);
                                                    ^
                            Static_Block6.java:8: error: non-static method show() cannot be referenced from a static context
                                    show();
                                                                ^
                            2 errors        */
    }   
}