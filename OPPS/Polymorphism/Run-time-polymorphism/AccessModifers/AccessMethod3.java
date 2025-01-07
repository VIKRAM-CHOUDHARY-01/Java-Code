class A{
    private void show1(){
        System.out.println("a class");
    }
    void another1(){
        //show1();

            //or

        // A obj = new A();
        // obj.show1();

            //Or


        this.show1();
    }
}
class B extends A{
    private void show2(){
        System.out.println("B class");
    }
    void another2(){
        //show2();
            //or
        //B obj = new B();
        //obj.show1();

            //Or
            
        this.show2();
    }
}

public class AccessMethod3{
    public static void main(String [] args){
        B obj = new B();
        obj.another1();
        obj.another2();
    }
}