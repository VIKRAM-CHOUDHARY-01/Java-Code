interface A{
    void show();
}

public class AnonymousInnerClass{
    public static void main(String [] args){
        A a = new A() {
            public void show(){
                System.out.println("In Anonymous Inner Class");
            }
        };
        a.show();
    }
}