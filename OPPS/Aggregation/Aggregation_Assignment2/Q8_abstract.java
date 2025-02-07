/*  Q8
abstract : 
file :
method1 : abstract method 
method2 :non abstract method 

another file :access */
public class Q8_abstract extends Q8_file{
    public void m1(){
        System.out.println("this is abstract method");
    }
    public static void main(String [] args){
        Q8_abstract obj = new Q8_abstract();
        obj.m1();
        obj.m2();
    }
}