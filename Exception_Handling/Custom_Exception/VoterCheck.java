import java.util.*;
class VoterClass{
    public void voterCheck(int age){
        if(age<18){
            throw new VoterEligibilty("Not Eligible to Vote");
        }else {
            System.out.println("Eligible to Vote");
        }
    }
}
public class VoterCheck{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();
        try{
        VoterClass vc = new VoterClass();
        vc.voterCheck(age);
        }catch(VoterEligibilty v){
            System.out.println(v.getMessage());
        }
        
    }
}