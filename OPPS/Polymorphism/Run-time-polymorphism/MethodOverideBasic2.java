class A{
    void show(){
        System.out.println("Class A METHOD");
    }
}
class B extends A{
    void show(){
        //to call parent method
        super.show();
        System.out.println("Class B method");
    }
}

/*  •	Class name different and method name same different parameters      */

class A1{
    void show(int a){
        System.out.println("Class A1 METHOD " + a);
        }
}
class B1 extends A1{
    void show(){
        System.out.println("Class B1 Method");
    }
}

/*  •	Class name different and method name same but return type of method change. -> case not possible will give error    */

class A3{
    void show(){
        System.out.println("Hello");
    }
}
class B3 extends A3{
    int show(){
        System.out.println("Bye");
        return 0;
    }
}
public class MethodOverideBasic2{
    public static void main(String [] args){
        //method overiding with super keyword
        B obj = new B();
        obj.show();

        /* first solution*/
    
        B1 ob = new B1();
        ob.show(3);
        ob.show();

        /* not a solution thus will give error */
        /*  Output -  int show(){
                    ^
            return type int is not compatible with void
            1 error*/
        B3 o = new B3();
        o.show();

    }
}