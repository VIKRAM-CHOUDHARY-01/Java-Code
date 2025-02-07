class MethodOverload{
    void methodLoad(){
        System.out.println("Hello From No Argument");
    }
    void methodLoad(String s){
        System.out.println(s);
    }
    void methodLoad(int a, int b){
        System.out.println(a+b);
    }
}