public class ZeroOne{
    public static void sortZeroAndOne(int a[]){
        int ans[] = new int[a.length];
        int count = 0;
        for(int i =0;i<a.length;i++){
            if(a[i] == 0){
                count++;
            }
        }
        for(int j = 0; j<ans.length;j++){
            if(j<count){
                ans[j] = 0;
            } else {
                ans[j] = 1;
            }
        }
        for(int i = 0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static void main(String [] args){
        int a[] = {0,1,0,1,1,0,0,1,1};
        sortZeroAndOne(a);
    }
}