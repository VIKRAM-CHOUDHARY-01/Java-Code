public class Priority{
    public static void main(String [] args){
        System.out.println("Hello" + 10 + 30); //Hello1030
        System.out.println(10+20+ "Hello");   // 30Hello

        System.out.println("Hello" + 10*30); // hello300
        System.out.println(10*30+"Hello"); //300Hello

        System.out.println("Hello" + 20/10); //Hello2
        System.out.println(20/10 + "Hello"); //2Hello

        // System.out.println("Hello" + 10-20); // error
        /*  Priority.java:12: error: bad operand types for binary operator '-'
            System.out.println("Hello" + 10-20); // error
                                       ^
            first type:  String
            second type: int
            1 error */

        System.out.println(10-20+"Hello"); //-10Hello
    }
}