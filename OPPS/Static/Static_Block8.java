public class Static_Block8{
    static{
        System.out.println("Hello from Static block");
    }
    public static void main(String [] args){
        System.out.println("Hello from main method");

        // static block is executed even before main method is executed.

        //output :
                    // Hello from Static block
                    // Hello from main method

    }
}