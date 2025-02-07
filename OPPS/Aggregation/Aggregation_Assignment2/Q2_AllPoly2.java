/*  Q2  
aggregation :
->run time :all concepts implement  
*/


public class Q2_AllPoly2 extends Q2_file{
    void m1(){
        super.m1();
        System.out.println("Bye");
    }
    public static void main(String [] args){
        Q2_AllPoly2 obj = new Q2_AllPoly2();
        obj.m1();
        Q2_file2 obj1 = new Q2_file2();
        obj1.m2();

        Army obj2 = new Army();
        obj2.m2();
    }
}