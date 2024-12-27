// Class A definition
// This class demonstrates different types of methods based on their return types.
class A {
    // Method without a return type
    // This method performs an action but does not return any value.
    void method1() {
        System.out.println("This is a method with no return type (void).");
    }

    // Method with a return type (int in this case)
    // This method performs a calculation and returns an integer value.
    int method2() {
        int result = 10 + 20; // Perform a calculation
        return result;        // Return the calculated value
    }

    // Method with a return type (String in this case)
    // This method returns a message as a String.
    String method3() {
        return "This is a method with a String return type.";
    }
}

// Main class definition
// This class demonstrates how to call and work with different types of methods.
public class MethodBasics2 {
    public static void main(String[] args) {
        // Step 1: Create an object of class A to call its methods
        A obj = new A();

        // Step 2: Call method1 (no return type, just performs an action)
        obj.method1(); // Output: This is a method with no return type (void).

        // Step 3: Call method2 (returns an integer value)
        int value = obj.method2(); // Call the method and store the return value
        System.out.println("The returned value from method2 is: " + value); // Output: 30

        // Step 4: Call method3 (returns a String value)
        String message = obj.method3(); // Call the method and store the return value
        System.out.println("The returned value from method3 is: " + message);
        // Output: This is a method with a String return type.
    }
}
