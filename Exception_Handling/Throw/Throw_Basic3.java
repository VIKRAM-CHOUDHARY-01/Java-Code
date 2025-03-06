public class Throw_Basic3{
    void show() throws ArithmeticException{
        throw new ArithmeticException();
    }
    void display(){
        show();
    }

    public static void main(String [] args){
    
        Throw_Basic3 d = new Throw_Basic3();
        try{
            d.display();
        }catch(Exception e){
            System.out.println("Exception Caught");
     

        }
        
        
      
    }
}