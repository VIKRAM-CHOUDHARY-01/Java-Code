public class Exception_Handling1{
    public static void main(String[] args){
        //Exception
        int a = 10;
        System.out.println("Hello One");
        int b = 0;
        System.out.println("Hello Two");
        int c = a/b; //Exception -> abnormal condition
        /*  Exception : Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception_Handling1.main(Exception_Handling1.java:6) */
        System.out.println("Now will this would be printed");
     
        System.out.println(c);

    }
}