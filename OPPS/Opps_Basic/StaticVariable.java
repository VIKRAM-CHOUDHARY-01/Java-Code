class StaticVariable {
    static int count = 0;  // Static variable

    // Constructor to increment the count each time an object is created
    StaticVariable() {
        count++;
    }

    // Method to display the count
    void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        // Creating objects of Counter
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();

        // Display the count using one object
        obj1.displayCount();  // Count: 3
        obj2.displayCount();  // Count: 3
        obj3.displayCount();  // Count: 3
    }
}
