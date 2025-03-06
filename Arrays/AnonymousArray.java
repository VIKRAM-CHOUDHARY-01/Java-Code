public class AnonymousArray{
    static void printArray(int a[]){
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String [] args){
        printArray(new int[]{1,2,3,4,5});

    }
}