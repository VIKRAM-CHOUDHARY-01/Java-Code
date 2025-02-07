class MethodOverHide{
    static void methodHidden(){
        System.out.println("Hello I am Hidden");
    }
}
class Pangat extends MethodOverHide{
    static void methodHidden(){
        System.out.println("Hello I am not Hidden");
    }
}