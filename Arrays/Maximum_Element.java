public class Maximum_Element{
    public static void main(String [] args){
    int []a = {1,2,3,4,5};
    int max = a[0];
    for(int i=0;i<a.length;i++){
        if(a[i]>max){
            max = a[i];
        }
    }
    System.out.println("Maximum Number in array is : " + max);
    }
}