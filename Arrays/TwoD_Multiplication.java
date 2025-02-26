public class TwoD_Multiplication{
    public static void printArray(int a[][]){
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void Multiplication(int a[][], int b[][], int rowA, int colA, int colB){
        int result[][] = new int[rowA][colB];
        for(int i = 0;i<rowA;i++){
            for(int j =0;j<colB;j++){
                for(int k = 0;k<colA;k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printArray(result);
    }
    public static void main(String[]args){
        int a[][] = {{1,2}, {5,6},{2,1}};
        int b[][] = {{8,2}, {3,7}};
        Multiplication(a,b,3,2,2);
        
    }
}