public class TwoD_Arrays{
    public static void main(String[] args){
        int a[][] = {{1,2}, {1,2,4}, {6,7,8}, {6}};
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j] + ", \t");
            }
            System.out.println();
        }

    }
}