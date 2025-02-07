class Q1_file{
    void method(){
        System.out.println("Normal Method");
    }
    void method2(String s){
        System.out.println(s);
    }
    void method3(String name, int age){
        System.out.println(name + " is " + age + " years old");
    }
    void method4(String name){
        this.method3(name, 34);
    }
}