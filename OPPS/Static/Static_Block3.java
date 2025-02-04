//Static blocks will be executed first then anonymoous block
class A{
    {
        System.out.println("Anonymous Block");
    }
    static{
        System.out.println("Static Block 1");
    }
    static{
        System.out.println("Static Block 2");
    }
}
public class Static_Block3{
    public static void main(String [] args){
        new A();
        /*  Output :
                        Static Block 1
                        Static Block 2
                        Anonymous Block         */
    }
}