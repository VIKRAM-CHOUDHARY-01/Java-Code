/*  Q4.
file :
interface :two method  
interface :two method 

another file :access */

public class Q4_interface implements Q4_file, Q4_file2{
    public String name(){
        return "Jon Doe";
    }
    public int age(){
        return 34;
    }
    public void method2(){
        System.out.println("This is method 2");
    }
    public static void main(String [] args){
        Q4_interface obj = new Q4_interface();
        System.out.println(obj.name());
        System.out.println(obj.age());
        obj.method2();
        obj.m1();
        }
}