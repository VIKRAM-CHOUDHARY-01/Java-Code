interface A{
    //method : by default : public and abstract
    void show();
    //at the time of compile : public abstract void show();
}
class B implements A{
        public void show(){
            System.out.println("Hello!");
        }
}

public class InterfaceBasic{
    public static void main(String [] args){
        B obj = new B();
        obj.show();
    }
}