class AccessOverrideClass extends MethodOverriding{
    String m1(String name){
        System.out.println(super.m1(name));
        return "Hello mf " + name;
    }
}
public class RuntimePoly{
    public static void main(String [] args){
        AccessOverrideClass OBJ = new AccessOverrideClass();
        System.out.println(OBJ.m1("Vikram Kumar Choudhary"));

        Pangat ob = new Pangat();
        ob.methodHidden();

    }
}