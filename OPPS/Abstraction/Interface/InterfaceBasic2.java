//Multiple inheritance constructor Ambiguity problem solved because interface can not create constructor
interface animal{
    void dog();
}
interface mammels{
    void human();
}

class Whole implements animal, mammels{
    public void dog() {
        System.out.println("Dog");
    }
    public void human() {
        System.out.println("Human");
    }
}
public class InterfaceBasic2{
    public static void main(String[] args) {
        Whole wh = new Whole();
        wh.human();
        wh.dog();
    }
}