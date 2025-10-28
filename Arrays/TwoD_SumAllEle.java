public class TwoD_SumAllEle{
     public static void printTwoD(int a[][]){
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
      
        int sum = 0;
        for(int i =0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
}