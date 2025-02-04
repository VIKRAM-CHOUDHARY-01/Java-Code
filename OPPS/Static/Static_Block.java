class A{
    //static block
    static{
        System.out.println("Staic Block 1");
    }
}

public class Static_Block{
    public static void main(String [] args){
        new A();
        //static block is only execute when we call the constructor
    }
}