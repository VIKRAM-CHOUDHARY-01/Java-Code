/*
file A :
	single level inheritance 

file B :
	multilevel inheritance 

file C :
	heirarichal inheritance 

file D :access 
*/

public class Fifth{
    public static void main(String [] args){
        ChildA5 obj = new ChildA5();
        obj.show();
        obj.show1();

        ChildTwoB5 obj1 = new ChildTwoB5();
        obj1.m1();
        obj1.m2();
        obj1.m3();

        ChildC5 obj2 = new ChildC5();
        obj2.one();
        obj2.two();

        TchildC5 obj3 = new TchildC5();
        obj3.one();
        obj3.three();

        
    }
}