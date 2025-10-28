public class CloneMethod_Deep_Copy{
    static void printArray(int a[]){
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String [] args){
        int a[] = {1,2,3,4,5};
        //deep copy
        int b[] = a.clone();
        a[0] = 0;
        a[1] = 0;
        printArray(a);
        System.out.println("------------------------------");
        printArray(b);
        
    }
}