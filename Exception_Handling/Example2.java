
public class Example2{
    public static void main(String []args){
       // Q.2 Example using try and multiple catch blocks?

        try{
            
        int a = 10/0;
        }catch(NullPointerException n){
            System.out.println(n);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}