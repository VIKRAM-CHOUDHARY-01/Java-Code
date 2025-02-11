public class Basic3_Array{
    public static void main(String [] args){
        int a[] = new int[5];
        a[2] = 34;
        System.out.println(a[2] + " " + a[4]);
        // When an array is created in Java, its elements are automatically initialized with default values based on the array type:

        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(a[5]); //error : array index out of bound exception
    }
}