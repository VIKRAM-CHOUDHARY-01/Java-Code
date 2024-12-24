class Acc{
    private int a =34;
    //setter method - > to give the value to instance variable
    void setA(int a){
        this.a = a;
    }
    //getter method -> used to get the value of private instance variable
    int getA(){
        return a;
    }
}

class Addition{
    private int a;
    private int b;
    void setValues(int a,int b){
        this.a = a;
        this.b=b;
    }
    int getA(){
        return a;
    }
    int getB(){
        return b;
    }
    void add(){
        int c = a+b;
        System.out.println("The Sum is : " + c);
    }
}
public class AccessModifier{
    public static void main(String [] args){
        Acc obj = new Acc();
        obj.setA(4);
        Addition obj2 = new Addition();
        obj2.setValues(50,25);
        System.out.println(obj2.getA() + " and " + obj2.getB() + " equals : ");
        obj2.add();

    }
}