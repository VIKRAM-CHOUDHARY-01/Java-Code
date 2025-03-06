public class NestedTry{
    public static void main(String []args){
        try{
            System.out.println("Outer Try Block Started");
            int a[] = {1,2,3};
            try{
                System.out.println("Inner Try Block Started");
                int result = 10/0;
            }catch(ArithmeticException e){
                System.out.println("Inner catch: ArithmeticException caught - " + e.getMessage());
            }
            System.out.println(a[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught - " + e.getMessage());
        }
        System.out.println("Program Continues...");
    }
}