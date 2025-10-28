public class TwoD_Sum{
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
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum[][] = new int[3][3];
        for(int i =0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                sum [i][j] = a[i][j] + b[i][j];
            }
        }
        printTwoD(sum);
    }
}