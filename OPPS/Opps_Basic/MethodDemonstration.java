
/*
     * return : keyword
     * it is used to store specific type of data in memory(block)
     * it is used to terminate method
     * 
     * retrun and no argument -> */
    // char sh(){
    //     char c='h';
    //     return c;
    // }


// Base class definition
class Parent {
    // Method returning a primitive data type (int)
    int getNumber() {
        return 100; // Returns a primitive int value
    }

    // Method returning a String (reference type)
    String getMessage() {
        return "Hello from Parent!"; // Returns a String object
    }

    // Method with a covariant return type (returning an object of Parent)
    Parent getInstance() {
        return this; // Returns the current instance of Parent
    }
}

// Child class that extends Parent
// Demonstrates overriding and covariant return types
class Child extends Parent {
    // Overriding method with a covariant return type
    // Instead of returning a Parent instance, it returns a Child instance
    @Override
    Child getInstance() {
        return this; // Returns the current instance of Child
    }

    // Method to demonstrate unique behavior in Child class
    String childMessage() {
        return "This is a message from Child class!";
    }
}

// Main class definition
public class MethodDemonstration {
    public static void main(String[] args) {
        // Primitive Data Type Return
        Parent parent = new Parent();
        int number = parent.getNumber(); // Calls getNumber method
        System.out.println("Primitive return value: " + number); // Output: 100

        // String Class Return
        String message = parent.getMessage(); // Calls getMessage method
        System.out.println("String return value: " + message); // Output: Hello from Parent!

        // Covariant Return Type
        Parent parentInstance = parent.getInstance(); // Returns a Parent object
        System.out.println("Covariant return (Parent): " + parentInstance.getClass().getSimpleName());

        // Using Child Class for Covariant Return Type
        Child child = new Child();
        Child childInstance = child.getInstance(); // Returns a Child object
        System.out.println("Covariant return (Child): " + childInstance.getClass().getSimpleName());

        // Demonstrating unique behavior of Child
        System.out.println("Message from Child: " + child.childMessage());
    }
}
