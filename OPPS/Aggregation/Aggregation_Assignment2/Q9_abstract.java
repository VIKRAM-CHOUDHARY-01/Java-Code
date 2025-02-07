/*  Q9
file :
abstract class :
	methods :

another class :
anonymous inner class
*/

class Q9_abstract{
    public static void main(String [] args){
        Q9_file obj = new Q9_file(){
            public void m1(){
                System.out.println("Nice Way");
            }
        };
        obj.m1();
    }
}