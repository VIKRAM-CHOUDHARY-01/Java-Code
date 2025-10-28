public class TwoD_Transpose{
      public static void printTwoD(int a[][]){
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String []args){

        /// 1st way to transpose 2d array 
         int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
         int ans [][] = new int[3][3];
         for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                ans[i][j] = a[j][i];
            }
         }
         printTwoD(ans);

         //2nd way
    }
}