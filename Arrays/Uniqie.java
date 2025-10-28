public class Uniqie{
    public static void main(String [] args){
        int a[] = {1,2,3,4,6,6,4,8};
        int cout = 0;
        for(int i =0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    a[j] = -1;
                }
            }
            if(a[i]!=-1){
                System.out.println(a[i]);
            }
        }
    }
}