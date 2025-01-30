interface A{
    class B{
        void show(){
            System.out.println("class in interface");
        }
    }
}

class C extends A.B{
    
}

public class ClassInInterface{
    public static void main(String [] args){
        // A.B = new B();
        // p.show()         : Not Possible, will give error

        C obj = new C(); 
        obj.show();
    }
}