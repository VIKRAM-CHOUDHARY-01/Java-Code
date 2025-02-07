class ConstructorOverload{
    private int a;
    private String name;
    private int age;
    ConstructorOverload(){
        System.out.println("Default Constructor Overload");
    }
    ConstructorOverload(int a){
        this.a = a;
        System.out.println(this.a);
    }
    ConstructorOverload(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("Hello " + this.name + " Your age is : " + this.age);
    }
    ConstructorOverload(String name){
        this(name, 21);
    }
}