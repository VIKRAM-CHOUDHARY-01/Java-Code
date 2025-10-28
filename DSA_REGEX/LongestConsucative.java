import java.util.*;
public class LongestConsucative{
    public static void main(String []args){
        int arr[] = {100,4,300,1,2,3};
        Arrays.sort(arr);
        int count = 0;
        for(int i =0;i<arr.length-1;i++){
         
            if((arr[i+1] - arr[i]) == 1){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}