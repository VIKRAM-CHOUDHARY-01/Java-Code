// Class A definition
// This class contains a single method `show` that prints a message to the console.
class A {
    // Method `show` defined in class A
    // This is a non-static method, so it requires an object of class A to be called.
    void show() {
        System.out.println("Hello"); // Prints "Hello" to the console
    }
}

// Main class definition
// This class demonstrates the basics of methods and object creation in Java.
public class MethodBasics {
  

    // Main method - entry point of the Java program
    public static void main(String[] args) {
        // Demonstrating method basics:
        // To call the `show` method of class A, we need to create an object of class A.
        // Classes themselves do not consume memory until objects are created.

        // Step 1: Create an object of class A
        A sd = new A();
        System.out.println(sd);

        // Step 2: Call the `show` method using the object `sd`
        sd.show(); // Output: Hello

    }
}
