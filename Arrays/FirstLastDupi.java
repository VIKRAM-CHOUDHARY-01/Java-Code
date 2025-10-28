public class FirstLastDupi{
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,2,6,7,8,2,9};
        int firstInd = -1;
        int lastInd=-1;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    if(firstInd == -1){
                        firstInd = i;
                    }
                    lastInd = j;  
                }
            }
        }
        System.out.println(firstInd);
        System.out.println(lastInd);
    }
}