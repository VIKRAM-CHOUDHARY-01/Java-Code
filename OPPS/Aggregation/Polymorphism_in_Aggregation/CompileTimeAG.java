public class CompileTimeAG{
    public static void main(String [] args){
        MethodOverload obj = new MethodOverload();
        obj.methodLoad();
        obj.methodLoad("Hello from argument method");
        obj.methodLoad(3,5);

        new ConstructorOverload();
        new ConstructorOverload(3);
        new ConstructorOverload("Vikram Choudhary");
        new ConstructorOverload("Jon Doe", 23);
    }
}