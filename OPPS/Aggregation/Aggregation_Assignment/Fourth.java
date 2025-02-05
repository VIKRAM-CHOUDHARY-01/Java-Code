/*  
file A
	getter and setter method :

file B
	getter and setter method :

file C :access 

*/

public class Fourth{
    public static void main(String [] args){
        A4 person = new A4();
        person.setName("Vikram Kumar Choudhary");
        person.setRollNum(34);
        System.out.println(person.getName());
        System.out.println(person.getRollNum());

        B4 employee = new B4();
        employee.setEmpName("Jon Doe");
        employee.setSalary(500000);
        System.out.println(employee.getEmpName());
        System.out.println(employee.getSalary());
    }
}