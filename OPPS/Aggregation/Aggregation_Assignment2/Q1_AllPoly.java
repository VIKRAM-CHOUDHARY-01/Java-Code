//Assignment - 06/02/25

/* Q.1 aggregation :
->compile time :all concepts implement  */

public class Q1_AllPoly{
    public static void main(String [] args){
        Q1_file obj1 = new Q1_file();
        obj1.method();
        obj1.method2("Goli");
        obj1.method3("Vikram Kumar Choudhary", 21);
        obj1.method4("Jon Doe");

        new Q1_file2();
        new Q1_file2(3,23);
        new Q1_file2(21);
        new Q1_file2(21, "Vikram Choudhary");
    }
}