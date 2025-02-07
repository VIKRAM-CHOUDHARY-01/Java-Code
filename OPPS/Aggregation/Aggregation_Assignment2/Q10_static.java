/*  Q10
static :
file 
inner class 

another access */

public class Q10_static{
    public static void main(String [] args){
        Q10_file obj = new Q10_file();
        Q10_file.B obj2 = obj.new B();
        obj2.show();
    }
}