class Q1_file2{
    private String name;
    private int age;
    Q1_file2(){
        System.out.println("Defualt Constructor");
    }
    Q1_file2(int a, int b){
        System.out.println(a +b);
    }
    Q1_file2(int age){
        this(23,"Jon Doe");
    }
    Q1_file2(int age, String name){
        this.name = name;
        this.age = age;
        System.out.println("Hello " + this.name + " your age is : " + this.age);
    }
}