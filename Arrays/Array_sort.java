import java.util.Arrays;
// with help of predefined method : sort
public class Array_sort{
      public static void printArray(int []a ){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
            System.out.println();
    }
    public static void main(String [] args){
        int []a = {24,5,7,8,4,3};
        Arrays.sort(a);
        printArray(a);
    }
}