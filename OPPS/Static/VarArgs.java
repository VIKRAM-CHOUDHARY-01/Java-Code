class A{
    void show(int ...a){
        for(int ele : a){
            System.out.print(ele +  "  ");
        }
    }
}
public class VarArgs{
    public static void main(String [] args){
        A obj = new A();
        obj.show(3,4,65,3,4);
    }
}