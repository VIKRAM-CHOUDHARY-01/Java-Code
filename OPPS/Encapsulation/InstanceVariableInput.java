class A{
    int a;
    void show(){
        a = 5; // constant - not user input
        System.out.println(a);
    }
}

class InsntInput{
    int num;
    //user input of instance variable throught method and parameter name is also different
    void meth(int x){
        num=x;
        System.out.println(num);
    }

}
class Inp{
    int y;
    Inp(int z){//user input of instance variable throught constructor and parameter name is also different
        y = z;
        System.out.println(y);
    }
}

class V{
    int c;
    void shw(int c){ //user input of instance variable throught method and parameter name is also same

        this.c = c;
        System.out.println(c);

    }
}

class InstanceConcept {
    int inte;
    InstanceConcept(int inte){
        this.inte = inte;
        System.out.println("in Constructor : " + inte);

    }
     void show(){
        System.out.println("in method : " + inte);
     }
}
public class InstanceVariableInput{
    public static void main(String [] args){
        A obj = new A();
        obj.show();

        InsntInput ob = new InsntInput();
        ob.meth(56);
        Inp o = new Inp(4);
        V objec = new V();
        objec.shw(3);
        InstanceConcept objec1 = new InstanceConcept(5);
        objec1.show();

    }
}