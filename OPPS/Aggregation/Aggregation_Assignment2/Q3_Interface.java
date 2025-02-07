/*  Q3
four files :interface 
first file :return and argument :declare 
second file :define :default 
third file :method :define :private 
fourth file :method :static 

another file :interface access
*/


public class Q3_Interface implements Q3_file, Q3_file_2, Q3_file_3, Q3_file_4{
    public String name(String na){
        return na;
    }
    public static void main(String [] args){
        Q3_Interface obj = new Q3_Interface();
        System.out.println(obj.name("Vikram Kumar Choudhary"));
        obj.age();
        obj.accessAddress();
        Q3_file_4.university();
    }
}