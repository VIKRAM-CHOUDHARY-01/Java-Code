class A{
    void show(){
        System.out.println("A class");
    }

}
class B extends A{
    void show2(){
        System.out.println("B class");
    }
}

public class Ref_Var{
    public static void main(String [] args){
        //reference variable
        //A  class referene variable - only works if class is inherit and the prority is given to reference variable over object, thus we can access all properties of A class and only able to call constructor of B and nothing could be acccessed of B class.
        A ob = new B();
        ob.show();
    }
}