public class RegexTest_19July{
    /* Q1. Check Valid Mathematical Expression

        Problem: Given three integers a, b, and c, return true if any of the following operations between a and b can give c:
            a + b == c, a - b == c, a * b == c, or a / b == c (if divisible)

        Input: a = 4, b = 2, c = 2
        Output: true    */

        public static boolean MathExpression(int a, int b, int c){
            if((a+b==c) || (a-b==c) || (a*b==c) || (a/b==c)){
                return true;
            }else{
                return false;
            }
        }

    
    /* Q2. Rearrange Array by Sign

        Problem: Given an array nums of even length, rearrange the elements so that:

        The first element is positive,
        The second is negative,
        The third is positive, and so on…

        Input: nums = [3,1,-2,-5,2,-4]
        Output: [3,-2,1,-5,2,-4]  */  

        public static void rearrangeByExp(int arr[]){
            int temp[] = new int[arr.length];
            int pos = 0;
            int neg = 1;
            for(int i =0;i<arr.length;i++){
                if(arr[i]>=0){
                    temp[pos] = arr[i];
                    pos= pos + 2;

                }else if(arr[i]<0){
                    temp[neg] = arr[i];
                    neg = neg +2;
                }
            }
            for(int i =0;i<temp.length;i++){
                System.out.print(temp[i] + "\t");
            }
        }

    /* Q3. Product of Array Except Self

            Problem: Given an integer array nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i]`, and without using division operator.

            Input: nums = [1, 2, 3, 4]
            Output: [24, 12, 8, 6]

            Explanation:

            For index 0: 2 × 3 × 4 = 24

            For index 1: 1 × 3 × 4 = 12

            For index 2: 1 × 2 × 4 = 8

            For index 3: 1 × 2 × 3 = 6 */

            public static void product(int arr[]){
              
                int temp[] = new int[arr.length];
                for(int i =0;i<arr.length;i++){
                    int multiplication = 1;
                    for(int j =0;j<arr.length;j++){
                        if(i==j){
                            continue;
                        }else{
                            multiplication = multiplication * arr[j];
                        }
                    }
                    temp[i] = multiplication;
                }
                 for(int i =0;i<temp.length;i++){
                System.out.print(temp[i] + "\t");
            }
            }

    /* Q4. Longest Subarray with Sum Exactly K

        Problem: Given an array and integer k, find the length of the longest subarray whose elements add up to k.

        Input: arr = [1, 2, 3, 1, 1, 1, 1], k = 3
        Output: 3  // [1, 1, 1] */

        public static int Subarray(int arr[], int target){
            int start = 0;
            int end = arr.length;
            
        }



    public static void main(String[]args){

       int a = 4;
       int b=  2;
       int c = 2;
       System.out.println(MathExpression(a,b,c));

       int arr[] = {3,1,-2,-5,2,-4};
       rearrangeByExp(arr);
       System.out.println();

       int arr2[] = {1,2,3,4};
       product(arr2);



    }
}