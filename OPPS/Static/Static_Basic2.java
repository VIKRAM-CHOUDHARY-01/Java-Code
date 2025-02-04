class A{
    static class B{
        static void show(){
            System.out.println("Hello");
        }
   
    }
}
public class Static_Basic2{
    public static void main(String [] args){
       A.B.show();
        //or
       A.B ob = new A.B();
       ob.show();
      

    }
}