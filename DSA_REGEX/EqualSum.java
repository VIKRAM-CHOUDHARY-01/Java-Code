/*Q.1Find Pair with Given Sum: Write a program to find pair in an array whose sum equals a given target sum.

        Input: arr = [1, 4, 5, 3, 2], target = 6

        Output:(1, 5) (4, 2)    */

public class EqualSum{

    static void eqSum(int []arr, int target){
        for(int i =0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i] +arr[j]==target && i!=j ){
                    System.out.println("( " + arr[i] + " , " + arr[j] + " )");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int arr[] = {1,4,5,3,2};
        int target = 6;
        eqSum(arr,target);


    }
}