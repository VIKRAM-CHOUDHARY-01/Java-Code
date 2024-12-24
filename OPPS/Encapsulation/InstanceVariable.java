class A {
    //instance variable : make inside the class and outside the method
    int a;
    void show(){
        a = 2;
        int b = 89; // local variable : inside the method
        System.out.println(a + " " + b);
    }
      void show1(){
        a = 35;
        int b = 89; // local variable : inside the method
        System.out.println(a + " " + b);
    }
}

public class InstanceVariable{
    public static void main(String [] args){
        A obj = new A();
        obj.show();
        obj.show1();

    }
}