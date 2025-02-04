class A{
    //WE CAN HAVE MORE THAN 1 STATIC BLOCK, THE TOP - DOWN APPROACHED IS FOLLOWED IN EXECUETION THUS THE FIRST ONE WILL EXECUTE THEN OTHERS LINE BY LINE

    static{
        System.out.println("Static Block 1");
    }
    static{
        System.out.println("Static Block 2");
    }
    static{
        System.out.println("Static Block 3");
    }
}
public class Static_Block2{
    public static void main(String [] args){
        new A();
        //Output :
                    // Static Block 1
                    // Static Block 2
                    // Static Block 3
    }
}