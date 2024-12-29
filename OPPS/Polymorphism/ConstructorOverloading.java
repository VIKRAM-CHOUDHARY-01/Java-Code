// class A{
//     //Constructor will be overloaded
//     A(){
//         System.out.println("Hello from 1st");
//     }
//     A(){
//         System.out.println("Hello from 2nd");
//     }
// }

class A{
    //Constructor will be overloaded
    A(int a){
        System.out.println("Hello from 1st");
    }
    A(){
        System.out.println("Hello from 2nd");
    }
}
public class ConstructorOverloading{
    public static void main(String [] args){
        // new A();

        newA(7);
        new A();
    }
}