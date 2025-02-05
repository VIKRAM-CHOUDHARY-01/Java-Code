class B5{
    void m1(){
        System.out.println("Estral Form");
    }
}
class ChildOneB5 extends B5{
    void m2(){
        System.out.println("Child One");
    }
}
class ChildTwoB5 extends ChildOneB5{
    void m3(){
        System.out.println("Child Two");
    }
}