//Assignemnt -> Array MNC Qestions : 13/02/25
import java.util.*;
/*Q.1   Problem Statement –A chocolate factory is packing chocolates into the packets. The
        chocolate packets here represent an array of N number of integer values. The task is to find
        the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
        Example 1 :
        N=8 and arr = [4,5,0,1,9,0,5,0] There are 3 empty packets in the given set. These 3 empty
        packets represented as O should be pushed towards the end of the array
        Input :
        8 – Value of N
        [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by
        newline
        Output:
        4 5 1 9 5 0 0       */



        


public class Array_Mnc_Questions{
    public static void swap(int a[], int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
    public static void conveyorBelt(int a[]){
       for(int i =0;i<a.length;i++){
        for(int j = i+1;j<a.length;j++){
            if(a[i]==0 && a[j]!=0){
                swap(a,i,j);
            }
        }
       }
        printArray(a);
    }

    public static void conveyorBelt2(int a[]){
        int index=0;
        for(int i =0;i<a.length;i++){
            if(a[i]!=0){
                a[index++] = a[i];
            }
        }
        while(index<a.length){
            a[index++] = 0;
        }
        printArray(a);
    }



    /*Q2    Given an integer array Arr of size N the task is to find the count of elements whose value is
            greater than all of its prior elements.
            Note : 1st element of the array should be considered in the count of the result.
            For example,
            Arr[]={7,4,8,2,9}
            As 7 is the first element, it will consider in the result.
            8 and 9 are also the elements that are greater than all of its previous elements.
            Since total of 3 elements is present in the array that meets the condition.
            Hence the output = 3.
            Example 1:
            Input
            5 -> Value of N, represents size of Arr
            7-> Value of Arr[0]
            4 -> Value of Arr[1]
            8-> Value of Arr[2]
            2-> Value of Arr[3]

            9-> Value of Arr[4]
            Output :
            3
            Example 2:
            5 -> Value of N, represents size of Arr
            3 -> Value of Arr[0]
            4 -> Value of Arr[1]
            5 -> Value of Arr[2]
            8 -> Value of Arr[3]
            9 -> Value of Arr[4]
            Output :
            5   */



    public static void printArray(int a[]){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    public static void findGreat(int a[]){
        int count = 1;
       int maxfound = a[0];
        for(int i =0;i<a.length;i++){
          if(a[i]>maxfound){
            count++;
            maxfound = a[i];
          }
        }
        System.out.println("Total count is : " + count);
    }

    /*Q3    An international round table conference will be held in india. Presidents from all over the
            world representing their respective countries will be attending the conference. The task is to
            find the possible number of ways(P) to make the N members sit around the circular table
            such that.
            The president and prime minister of India will always sit next to each other.
            Example 1:
            Input :
            4 -> Value of N(No. of members)
            Output :
            12 -> Possible ways of seating the members
            Explanation:
            2 members should always be next to each other.
            So, 2 members can be in 2!ways

            Rest of the members can be arranged in (4-1)! ways.(1 is subtracted because the previously
            selected two members will be considered as single members now).
            So total possible ways 4 members can be seated around the circular table 2*6= 12.
            Hence, output is 12.
            Example 2:
            Input:
            10 -> Value of N(No. of members)
            Output :
            725760 -> Possible ways of seating the members
            Explanation:
            2 members should always be next to each other.
            So, 2 members can be in 2! ways
            Rest of the members can be arranged in (10-1)! Ways. (1 is subtracted because the
            previously selected two members will be considered as a single member now).

            So, total possible ways 10 members can be seated around a round table is
            2*362880 = 725760 ways.
            Hence, output is 725760.
            The input format for testing
            The candidate has to write the code to accept one input
            First input – Accept value of number of N(Positive integer number)
            The output format for testing
            The output should be a positive integer number or print the message(if any) given in the
            problem statement(Check the output in example 1, example2)
            Constraints :
            2<=N<=50    */

            public static void Members(int n){
                int pre = n-1;
                double fact = 1d;
                while(pre>0){
                    fact*=pre;
                    pre--;
                }
                double ans = fact*2;
                System.out.println("The total ways are : " + ans);
            }


    /*Q4    4)
                An intelligence agency has received reports about some threats. The reports consist of
                numbers in a mysterious method. There is a number 'n' and another number r. Those
                numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are
                summed up and this action is performed ‘R’ number of times. The resultant is also a single
                digit that is yet to be deciphered. The task here is to find the single-digit sum of the given
                number ‘N’ by repeating the action ‘R’ number of times.
                If the value of ‘R’ is 0, print the output as ‘0’.
                Example 1:
                Input :
                99 -> Value of N
                3 -> Value of R
                Output :
                9 -> Possible ways to fill the cistern.
                Explanation:
                Here, the number N=99
                1)Sum of the digits N: 9+9 = 18
                2)Repeat step 2 ‘R’ times i.e. 3 tims (9+9)+(9+9)+(9+9) = 18+18+18 =54
                3)Add digits of 54 as we need a single digit 5+4
                Hence , the output is 9.
                Example 2:
                Input :
                1234 -> Value of N
                2 -> Value of R
                Output :
                2 -> Possible ways to fill the cistern
                Explanation:
                Here, the number N=1234
                1)Sum of the digits of N: 1+2+3+4 =10
                2)Repeat step 2 ‘R’ times i.e. 2 times (1+2+3+4)+(1+2+3+4)= 10+10=20

                3)Add digits of 20 as we need a single digit. 2+0=2
                Hence, the output is 2.
                Constraints:
                0<N<=1000
                0<=R<=50
                The Input format for testing
                The candidate has to write the code to accept 2 input(s)
                First input- Accept value for N (positive integer number)
                Second input: Accept value for R(Positive integer number)
                The output format for testing
                The output should be a positive integer number or print the message (if any) given in the
                problem statement. (Check the output in Example 1, Example 2).*/

                public static void hackingCase(int n, int r){
                    if(r==0){
                        System.out.println("The output is : " + 0);
                    }
                    else {
                        int rem = 0;
                        int sum = 0;
                        while(n>0){
                            rem = n%10;
                            sum+=rem;
                            n = n/10;
                        }
                    
                        int newNum = sum*r;
                        int ans = 0;
                        while(newNum>0){
                            rem = newNum%10;
                            ans+=rem;
                            newNum = newNum/10;
                        }
                        System.out.println("The total ways are : " + ans);
                    }
                }

    /*  Q5
            Problem Statement
            Particulate matters are the biggest contributors to Delhi pollution. The main reason behind
            the increase in the concentration of PMs include vehicle emission by applying Odd Even
            concept for all types of vehicles. The vehicles with the odd last digit in the registration
            number will be allowed on roads on odd dates and those with even last digit will on even
            dates.
            Given an integer array a[], contains the last digit of the registration number of N vehicles
            traveling on date D(a positive integer). The task is to calculate the total fine collected by the
            traffic police department from the vehicles violating the rules.
            Note : For violating the rule, vehicles would be fined as X Rs.
            Example 1:
            Input :
            4 -> Value of N
            {5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line
            12 -> Value of D, i.e. date

            200 -> Value of x i.e. fine
            Output :
            600 -> total fine collected
            Explanation:
            Date D=12 means , only an even number of vehicles are allowed.
            Find will be collected from 5,3 and 7 with an amount of 200 each.
            Hence, the output = 600.
            Example 2:
            Input :
            5 -> Value of N
            {2,5,1,6,8} -> a[], elements a[0] to a[N-1], during input each element is separated by new
            line
            3 -> Value of D i.e. date
            300 -> Value of X i.e. fine
            Output :
            900 -> total fine collected
            Explanation:
            Date D=3 means only odd number vehicles with are allowed.
            Find will be collected from 2,6 and 8 with an amount of 300 each.
            Hence, the output = 900
            Constraints:
            ->0<N<=100
            ->1<=a[i]<=9
            ->1<=D <=30
            ->100<=x<=5000
            The input format for testing

            The candidate has to write the code to accept 4 input(s).
            First input – Accept for N(Positive integer) values (a[]), where each value is separated by a
            new line.
            Third input – Accept value for D(Positive integer)
            Fourth input – Accept value for X(Positive integer )
            The output format for testing
            The output should be a positive integer number (Check the output in Example 1, Example e)
            if no fine is collected then print '0'. */


            public static void fineCalculator(int a[], int date, int fine){
                int count = 0;
                if(date%2==0){
                    for(int i =0;i<a.length;i++){
                        if(a[i]%2!=0){
                            count++;
                        }
                    }
                    int totalFine = count*fine;
                    System.out.println("Total fine is : " + totalFine);
                }else {
                     for(int i =0;i<a.length;i++){
                        if(a[i]%2==0){
                            count++;
                        }
                    }
                    int totalFine = count*fine;
                    System.out.println("Total fine is : " + totalFine);

                }
            }


    /*Q6    
        Problem Statement – An automobile company manufactures both a two wheeler (TW) and a
        four wheeler (FW). A company manager wants to make the production of both types of
        vehicle according to the given data below:
        a)1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
        b)2nd data, Total number of wheels = W
        The task is to find how many two-wheelers as well as four-wheelers need to manufacture as
        per the given data.
        Example :
        Input :
        200 -> Value of V
        540 -> Value of W
        Output :
        TW =130 FW=70
        Explanation:
        130+70 = 200 vehicles
        (70*4)+(130*2)= 540 wheels
        Constraints :
        a)2<=W
        b)W%2=0
        c)V<W
        Print 'INVALID INPUT' , if inputs did not meet the constraints.
        The input format for testing
        The candidate has to write the code to accept two positive numbers separated by a new line.
        a)First Input line – Accept value of V.

        b)Second Input line- Accept value for W.        */

        public static void totalVehicals(int v, int w){
            int fourWheels = (w-2*v)/2;
            int twoWheels = v-fourWheels;
            System.out.println("Total  two wheeler vehicals to be mad e: " + twoWheels);
            System.out.println("Total  four wheeler vehicals to be mad e: " + fourWheels);
        }

    /*Q7
            A party has been organised on cruise. The party is organised for a limited time(T). The
        number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as
        elements of the array. The task is to find the maximum number of guests present on the
        cruise at any given instance within T hours.
        Example 1:
        Input :
        a)5 -> Value of T
        b)[7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by
        new line
        c)[1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by new
        line.
        Output :
        8 -> Maximum number of guests on cruise at an instance.
        Explanation:
        1st hour:
        Entry : 7 Exit: 1
        No. of guests on ship : 6
        2nd hour :
        Entry : 0 Exit : 2
        No. of guests on ship : 6-2=4
        Hour 3:
        Entry: 5 Exit: 1
        No. of guests on ship : 4+5-1=8
        Hour 4:
        Entry : 1 Exit : 3
        No. of guests on ship : 8+1-3=6
        Hour 5:
        Entry : 3 Exit: 4
        No. of guests on ship: 6+3-4=5
        Hence, the maximum number of guests within 5 hours is 8.
        Example 2:
        Input:
        4 -> Value of T
        [3,5,2,0] -> E[], Element of E[0] to E[N-1], where input each element is separated by new
        line.
        [0,2,4,4] -> L[], Element of L[0] to L[N-1], while input each element in separated by new line

        Output:
        6
        Cruise at an instance
        Explanation:
        Hour 1:
        Entry: 3 Exit: 0
        No. of guests on ship: 3
        Hour 2:
        Entry : 5 Exit : 2
        No. of guest on ship: 3+5-2=6
        Hour 3:
        Entry : 2 Exit: 4
        No. of guests on ship: 6+2-4= 4
        Hour 4:
        Entry: 0 Exit : 4
        No. of guests on ship : 4+0-4=0
        Hence, the maximum number of guests within 5 hours is 6.
        The input format for testing
        The candidate has to write the code to accept 3 input.
        First input- Accept value for number of T(Positive integer number)
        Second input- Accept T number of values, where each value is separated by a new line.
        Third input- Accept T number of values, where each value is separated by a new line.
        The output format for testing
        The output should be a positive integer number or a message as given in the problem
        statement(Check the output in Example 1 and Example 2)
        Constraints:
        a)1<=T<=25
        b)0<= E[i] <=500
        c)0<= L[i] <=500    */

        public static void findingMax(int a[], int b[]){
            int guest=0;
            int max = 0;
            for(int i =0;i<a.length;i++){
                guest += a[i]-b[i];
                if(max<guest){
                    max = guest;
                }
            }
            System.out.println("The max people at one instance was : " + max);
        }

    /*Q8
            8)
        There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR
        can contain maximum N candies when JAR is full. At any point of time. JAR can have M
        number of Candies where M<=N. Candies are served to the customers. JAR is never remain
        empty as when last k candies are left. JAR if refilled with new candies in such a way that
        JAR get full.
        Write a code to implement above scenario. Display JAR at counter with available number of
        candies. Input should be the number of candies one customer can order at point of time.
        Update the JAR after each purchase and display JAR at Counter.

        Output should give number of Candies sold and updated number of Candies in JAR.
        If Input is more than candies in JAR, return: 'INVALID INPUT'
        Given,
        N=10, where N is NUMBER OF CANDIES AVAILABLE
        K =< 5, where k is number of minimum candies that must be inside JAR ever.
        Example 1:(N = 10, k =< 5)
        Input Value
        3
        Output Value
        NUMBER OF CANDIES SOLD : 3
        NUMBER OF CANDIES AVAILABLE : 7
        Example : (N=10, k<=5)
        Input Value
        0
        Output Value
        INVALID INPUT NUMBER OF
        CANDIES LEFT : 10   */


    /* Q9
            Problem Statement
            We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per
            sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
            Take input as
            1. Number of Interior walls
            2. Number of Exterior walls
            3. Surface Area of each Interior 4. Wall in units of square feet
            Surface Area of each Exterior Wall in units of square feet
            If a user enters zero as the number of walls then skip Surface area values as User may
            don’t want to paint that wall.
            Calculate and display the total cost of painting the property
            Example 1:
            6
            3
            12.3
            15.2
            12.3
            15.2
            12.3
            15.2
            10.10

            10.10
            10.00
            Total estimated Cost : 1847.4 INR
            Note: Follow in input and output format as given in above example   */


    /*Q10
        Write a code to check whether no is prime or not. Condition use function check() to
        find whether entered no is positive or negative ,if negative then enter the no, And if yes pas
        no as a parameter to prime() and check whether no is prime or not?
        a)Whether the number is positive or not, if it is negative then print the message 'please enter
        the positive number'
        b)It is positive then call the function prime and check whether the take positive number is
        prime or not.   */

        public static void prime(int a){
          
            if(a<=1){
                System.out.println("Its not a Prime Number");
                return;
            } 
      
                for(int i =2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                   System.out.println("Its not a prime Number");
                   return;
                }
                
            }
            System.out.println("Its a prime Number");
            return;
          

        }
            

            


    public static void main(String [] args){
        int a[] = {4,5,0,1,9,0,5,0};
        conveyorBelt(a);
        conveyorBelt2(a);


        //Q2
            System.out.println("----------------------------------------");
            int arr[] = {2,4,15,11,7,3,8,9};
            findGreat(arr);


        //Q3    
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of memebers : (2<=n<=50)");
            int n1 = sc.nextInt();
            if(n1>=2 && n1<=50){
                Members(n1);
            } else {
                System.out.println("Please enter Number of members in given constrains");
            }


            System.out.println("-----------------------------------------------------");
        //Q4 
            
            System.out.println("Enter value of N :");
            int n  = sc.nextInt();
            System.out.println("Entet value of R : ");
            int r = sc.nextInt();
            hackingCase(n,r);


        //  Q5 

                int fine= 200;
                System.out.println("Enter Number of Vahicals: ");
                int size = sc.nextInt();
                int vehiclesArr[] = new int[size];
                for(int i =0;i<vehiclesArr.length;i++){
                    vehiclesArr[i] = sc.nextInt();
                }
                System.out.println("Enter date : ");
                int d = sc.nextInt();
                if(d>=1 && d<=30){
                    fineCalculator(vehiclesArr, d, fine);
                }else {
                    System.out.println("Enter correct date");
                }


        //Q6        

                System.out.println("Enter Number of Vehicals: ");
                int v = sc.nextInt();
                System.out.println("Enter Number of Wheels : ");
                int w = sc.nextInt();
                if(w>=2 && w%2==0 && v<w){
                    totalVehicals(v,w);
                } else {
                    System.out.println("Please enter valid and logical data");
                }


        //Q7    
                System.out.println("Enter time for which event is organized : ");
                int t = sc.nextInt();
                int e[] = new int[t];
                for(int i=0;i<e.length;i++){
                    e[i] = sc.nextInt();
                }
                int ex[] = new int [t];
                for(int i =0;i<ex.length;i++){
                    ex[i] = sc.nextInt();
                }
                findingMax(e, ex);

        //Q8    
              
        int jarCapacity = 10;
        int availableCandies = jarCapacity;
        int minCandiesBeforeRefill = 5;

        System.out.println("Enter the number of candies you want to buy: ");
        int candiesRequested = sc.nextInt();

        if (candiesRequested <= 0 || candiesRequested > availableCandies) {
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT : " + availableCandies);
        } else {
            availableCandies -= candiesRequested;
            System.out.println("NUMBER OF CANDIES SOLD : " + candiesRequested);

            if (availableCandies <= minCandiesBeforeRefill) {
                availableCandies = jarCapacity;
            }

            System.out.println("NUMBER OF CANDIES AVAILABLE : " + availableCandies);
        }


            //Q9        

                    System.out.println("Number of Interior Walls : " );
                    int InteriorWalls = sc.nextInt();
                    System.out.println("Number of Exterior Walls : ");
                    int ExteriorWalls = sc.nextInt();

                    if(InteriorWalls==0){
                        float ExteriorSurface[] = new float[ExteriorWalls];
                        float sum = 0;
                         System.out.println("Enter Surface area of Exterior Walls : ");
                        for(int i =0;i<ExteriorSurface.length;i++){
                        ExteriorSurface[i] = sc.nextFloat();
                        sum+=ExteriorSurface[i];
                        }
                        float cost = sum*12;
                        System.out.println("Total Estimeted Cost is : " + cost);

                        
                        
                    } else if(ExteriorWalls==0){
                    float InteriorSurface[] = new float[InteriorWalls];
                    float sum=0;
                    System.out.println("Enter Surface area of Interior Walls : ");
                    for(int i =0;i<InteriorSurface.length;i++){
                        InteriorSurface[i]= sc.nextFloat();
                        sum+=InteriorSurface[i];
                    }
                    float cost = sum*18;
                    System.out.println("Estimeted Cost is : " + cost);

                    } else {

                    float InteriorSurface[] = new float[InteriorWalls];
                    float ExteriorSurface[] = new float[ExteriorWalls];
                    float sum1= 0;
                    float sum2 = 0;
                    System.out.println("Enter Surface area of Interior Walls : ");
                    for(int i =0;i<InteriorSurface.length;i++){
                        InteriorSurface[i]= sc.nextFloat();
                        sum1+=InteriorSurface[i];
                    }

                    System.out.println("Enter Surface area of Exterior Walls : ");
                         for(int i =0;i<ExteriorSurface.length;i++){
                        ExteriorSurface[i] = sc.nextFloat();
                        sum2+=ExteriorSurface[i];
                    }
                    float cost = (sum1*18)+(sum2*12);
                    System.out.println("Total Estimeted Cost is : " + cost);
                        
                    }


            //Q10       

                    System.out.println("Enter a Number : ");
                    int number = sc.nextInt();
                    if(number<0){
                        System.out.println("Please enter Positive Number");
                    } else {
                        prime(number);
                    } 
                    
                   
                   




               
              
                


        
    }
}