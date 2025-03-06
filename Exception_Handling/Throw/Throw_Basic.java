public class Throw_Basic{
    void show(){
        throw new ArithmeticException();
    }

    public static void main(String [] args){
        Throw_Basic obj = new Throw_Basic();
        obj.show();
    }
}