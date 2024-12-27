class Animal{
    void displalAni(){
        System.out.println("Hello All Humans");
    }
}
//Single level Inheritance
class Lion extends Animal{
    void displayLio(){
        System.out.println("Neh! Stay way Humans");
    }
}
public class singleInheritance{
    public static void main(String [] args){

        Lion ob = new Lion();
        
        ob.displalAni();

    }
}