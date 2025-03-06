public class Example3{
    public static void main(String [] args){
        //Q.3 Example using try, catch and finally blocks?

        try{
            int result = 10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("Program End");
        }
    }
}