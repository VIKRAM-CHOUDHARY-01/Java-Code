//Normal class, non-static instacne variable, static method :  access -> no
class A{
    int a =34;
    static void show(){
        System.out.println(a);
    }
}
public class Static_Basic5{
    public static void main(String [] args){
        A objj = new A();
        objj.show();

        /*  Output :

                        Static_Basic5.java:5: error: non-static variable a cannot be referenced from a static context
                                    System.out.println(a);
                                                    ^
                            1 error 

                                                        */
    }
}