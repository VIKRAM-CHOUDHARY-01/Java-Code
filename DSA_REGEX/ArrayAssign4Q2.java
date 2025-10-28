/*  Find the Missing Number in Array: Given an array of size n-1 with numbers from 1 to n, find the missing number.

    Input:
    arr = [1, 2, 4, 6, 3, 7, 8]

    Output:
    Missing Number: 5   */

import java.util.*;
public class ArrayAssign4Q2{
    public static void main(String []args){
        int arr[] = {1,2,4,6,3,7,8};
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])!=1){
                System.out.println(arr[i]+1);
                break;
            }
        }
    }
}