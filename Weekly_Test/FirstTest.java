import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of tickets you want: ");
        int ticket = sc.nextInt();
        System.out.println("Enter Your age to check your age group and ticket price (80/ticket for child, 100/ticket for adult, 120/ticket for senoir) : ");
        int age = sc.nextInt();
        if(age>0 && age<=18){
            System.out.println("You are Child");
            int ticketPrice = 80*ticket;
            System.out.println("Your Total Ticket Price is : " + ticketPrice);
        }
        else if(age>18 && age<=60){

            System.out.println("You are Adult");
            int ticketPrice = 100*ticket;
            System.out.println("Your Total Ticket Price is : " + ticketPrice);

        } else if(age>60){
              System.out.println("You are Senoir");
            int ticketPrice = 120*ticket;
            System.out.println("Your Total Ticket Price is : " + ticketPrice);
        }

        
      
        
    }
}





