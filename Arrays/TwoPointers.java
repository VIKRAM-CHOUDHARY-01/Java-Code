public class TwoPointers{
      public static void printArray(int []a ){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
            System.out.println();
    }
    public static void twoPointers(int a[], int left, int right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    public static void main(String [] args){
        int a [] = {0,1,1,0,1,0,0,1};
        twoPointers(a,0,a.length-1);
        printArray(a);
    }
}