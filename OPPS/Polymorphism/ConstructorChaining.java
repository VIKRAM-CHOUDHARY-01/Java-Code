class A{
    A(){
        //Default -- int two parameter
        this(2,4);
        System.out.println("Hello1");
    }
    A(int a, int b){
        //two parameter --- string
        this("Hello");
        System.out.println(a +  " " + b);
        
    }
    A(float c){
        System.out.println(c);
    }
    A(String n){
        
        this(3.4f);
        // new A(3.4f); Constructor is always called with new keyword : write it why?
        System.out.println(n);
    }
}

public class ConstructorChaining{
    public static void main(String [] args){
        new A();
    }
}