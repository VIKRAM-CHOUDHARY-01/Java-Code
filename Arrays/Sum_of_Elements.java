public class Sum_of_Elements{
    public static void main(String [] args){
        int a[] = {3,5,6,76,84,4};
        int sum = 0;
        for(int i= 0;i<a.length;i++){
            sum+=a[i];
         }
         System.out.println("Sum of the Array : " + sum);
    }
}