/*  Q7
four files :interface 
first file :return and argument :declare 
second file :define :default 
third file :method :define :private 
fourth file :method :static 

another file :interface :create anonymous inner class  
*/
public class Q7_interface implements Q7_file, Q7_file2, Q7_file3, Q7_file4{
    public String good(String g){
        return g;
    }
 
    public static void main(String [] args){
        Q7_interface obj = new Q7_interface();
        System.out.println(obj.good("Perfect Days"));
        obj.m2();
        obj.accessM3();
        Q7_file4.m4();
    }
}