class Con {
    // Public default constructor
    public Con() {
        System.out.println("Hello from Public Default Constructor");
    }

    // Public parameterized constructor
    public Con(String message) {
        System.out.println("Hello from Public Parameterized Constructor: " + message);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Creating an object using the public default constructor
        Con obj1 = new Con();

        // Creating an object using the public parameterized constructor
        Con obj2 = new Con("Welcome to Java!");
    }
}
