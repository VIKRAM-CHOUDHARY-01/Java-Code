class A{
    void show() throws Example9_Custom{
        throw new Example9_Custom("Its error");
    }
}
public class Example9{
    public static void main(String []args){
        //Q9 Example using user defined exception and throw and throws?
        try{

        A obj = new A();
        obj.show();
        }catch(Example9_Custom e){
            System.out.println(e.getMessage());
        }
    }
}