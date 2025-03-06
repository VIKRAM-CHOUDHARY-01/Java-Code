public class Throw_Basic2{
    void show(){
        throw new ArithmeticException();
    }

    public static void main(String [] args){
        try{
        Throw_Basic2 obj = new Throw_Basic2();
        obj.show();
        } catch(ArithmeticException e){
            System.out.println("Can't " + e.getMessage());
            System.out.println(e);
        }
      
    }
}