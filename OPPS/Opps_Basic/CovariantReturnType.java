class A{
    A show(int a){
        System.out.println(a);
        return this;
    }
} 
public class CovariantReturnType{
    public static void main(String [] args){
        A obj = new A();
        A nv = obj.show(4);
        System.out.println(nv);
    }
}