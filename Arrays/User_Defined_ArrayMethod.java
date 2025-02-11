public class User_Defined_ArrayMethod{
    public static void printArray(int a[]){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        System.out.println("---------------------------------------------");
    }
    public static void main(String [] args){
        int []arr = {24,56,6,8,89,5,8};
        printArray(arr);
        System.out.println();
        int []arr2 = {2,45,6,75,5};
        printArray(arr2);


    }
}