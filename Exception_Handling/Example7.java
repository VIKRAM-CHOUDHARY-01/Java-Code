public class Example7{
    public static void show(){
        System.out.println("hELLO");
        throw new Example7_Custom("Its a Error");
        
    }
    public static void main(String []args) throws Example7_Custom{
        //Q.7 Example using user defined exception and throw?
        show();
    }
}