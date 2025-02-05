/*  file A :
->no return and no argument 
->no return and  argument 
-> return and no argument 
-> return and  argument 
->covariant return type 

file B :access  */

public class Third{
    public static void main(String [] args){
        A3 obj = new A3();
        obj.m1();
       obj.m2(34);
        System.out.println(obj.m3());
        System.out.println(obj.m4("Return and argument"));
        System.out.println(obj.m5());
        A3 ob = obj.m5();
        ob.m1();
    }
}