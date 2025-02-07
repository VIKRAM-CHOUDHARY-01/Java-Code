/*  Q6
file :
class 
	interface 

another file access
*/
public class Q6_interface implements Q6_file.A{
    public void m(){
        System.out.println("Nice");
    }
    public static void main(String [] args){
        Q6_interface obj = new Q6_interface();
        obj.m();
        obj.m2();
    }
}