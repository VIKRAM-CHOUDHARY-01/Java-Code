public class Array_swap{
    //print array
    public static void printArray(int []a ){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
System.out.println();
    }        
    // public static void FirstLastSwap(int a[]){
    //     int temp = a[0];
    //     a[0] = a[a.length-1];
    //     a[a.length-1] = temp;
    // }

    public static void swap(int a[],int end){
        int start = 0;
        while(start<end){
                    int temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                    start++;
                    end--;
        }
     
    }
    public static void main(String[]args){
        int a[] = {1,2,3,4,5};
        swap(a, a.length-1);
        printArray(a);

    }
}