public class Throw_Eg{
    public static void validateAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be above 18");
        }else {
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String []args){
        try{
        validateAge(15);
        }catch(IllegalArgumentException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        System.out.println("Program Continues");
    }
}