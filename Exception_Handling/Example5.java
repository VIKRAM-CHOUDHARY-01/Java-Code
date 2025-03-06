public class Example5 {
    public static void main(String[] args) {
        // Example using nested try, catch, and finally

        try {
            System.out.println("Outer try block starts.");

            try {
                // Inner try block - may cause an exception
                int num = 10 / 0; // ArithmeticException (Division by zero)
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage()); // Handle division by zero
            } 
            finally {
                System.out.println("Inner finally block executed.");
            }

            // This part will still execute unless an exception occurs before
            System.out.println("Outer try block continues.");

        } 
        catch (Exception e) {
            System.out.println("Outer catch: " + e);
        } 
        finally {
            System.out.println("Outer finally block executed.");
        }

        System.out.println("Program execution continues after try-catch-finally.");
    }
}
