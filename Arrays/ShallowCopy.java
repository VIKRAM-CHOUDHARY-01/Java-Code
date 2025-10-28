public class ShallowCopy{
    //print array
    static void printArray(int a[]){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        System.out.println("------------------------------------");
        //Shallow Copy
        int arr2[] = arr;
        printArray(arr2);
        System.out.println("---------------------------------------");
        arr[0] = 0;
        arr[1] = 0;
        printArray(arr);
        System.out.println("----------------------------------------");
        printArray(arr2);

    }
}