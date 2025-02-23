//Assignment - 13/02/25 

/*  Q.1 Q)array :1,2,3,4,5,6,7,8,9,10 

            target sum of two number pair 
            target :8 

            pair :find 
            ->count 
            ->which index   */


public class Array_Assign4{
    
            public static void twoSum(int a[], int target){
                int count=0;
                for(int i =0;i<a.length;i++){
                    for(int j = i+1;j<a.length;j++){
                        if(a[i] + a[j] == target){
                            System.out.println("Target pair at this index  : " + i + ", " + j);
                            count++;
                        }
                    }
                }
                System.out.println("Total pair are : " + count);
            }


                /*  Q)2 array :1,2,3,4,5,6,7,8,9,10 

    target sum of three number pair 
    target :12 

    pair :
    6 4 2 
    8 3 1 
    9 2 1 
    5 4 3 

    pair :find 
    ->count 
    ->which index 
    */

   public static void threeSum(int []a, int target){
    int count = 0;
    for(int i =0;i<a.length;i++){
        for(int j = i+1;j<a.length;j++){
            for(int k = j+1;k<a.length;k++){
                if(a[i] + a[j] + a[k] == target){
                System.out.println("Pair found at these indcies : " + i + ", " + j + ", " + k);
                count++;
                }
              
            }
        }
    }
    System.out.println("There are total pairs : " + count);
   }

   /*   Q)array :1,2,3,4,3,5,6 
            find duplicate element :repeated element 

            count 
            index*/

            public static void duplicateEle(int a[]){
                boolean checked[] = new boolean[a.length];
                int dupi = 0;
               System.out.println("Duplicate elements are: ");
                for(int i =0;i<a.length;i++){

                if(!checked[i]){
                String indcies = i + "";
                boolean found = false;
                found = false;
                checked[i] = true;
                    
                      for(int j =i+1;j<a.length;j++){
                        if(a[i] == a[j]){
                            indcies += ", " + j;
                            found = true;
                            checked[i] = true;
                          
                        }
                    }
                    if(found==true){
                        System.out.println("Duplicate elements at indices : " + indcies);
                        dupi++;
                    }
                   
                }
                  
                }
                System.out.println("Total duplicate elements are : " + dupi);
                
            }

            /*  Q)array :
                1,2,3,4,5,2,6,2,7,8,2,9 
                find duplicate element 
                first position :which  
                last position :which 

                position 2 is 5 and 10 
                            */

            public static void dupi(int a[]){
                boolean checked[] = new boolean[a.length];
               
                for(int i =0;i<a.length;i++){
                    if(!checked[i]){
                    checked[i] = true;
                    int first = -1;
                    int last = -1;
                    boolean found = false;
                    
                        for(int j = i+1;j<a.length;j++){
                            if(a[i] == a[j]){
                               
                                if(first == -1){
                                    first = j;
                                }
                                last = j;
                                found = true;
                                checked[j] = true;
                              
                            }
                        }
                          if(found==true){
                              System.out.println("This element " + a[i] + " has duplicate elements so first duplicate occurs at : " + first + " and last occurs at this index " + last);
                        }
                    }
                      
                }
            }


    /*  Q.Q)find frequency of every element :
                array :1,2,3,2,4,3,2,5,7,2,1 

                count :
                1 --- 2 
                2 ---4 
                3 ---2 
                4 ---1 
                5 ----1     */

                public static void frequency(int a[]){
                    boolean checked[] = new boolean[a.length];
                    for(int i =0;i<a.length;i++){
                        if(!checked[i]){
                            checked[i] =true;
                           
                            int freq = 0;
                            for(int j = i+1;j<a.length;j++){
                                if(a[i] == a[j]){
                                    freq++;
                                    checked[j] = true;
                                
                                    
                                }
                            }
                            
                                System.out.println("This element " + a[i] + " has come this much time : " + (freq +1));
                            
                        }
                    }
                }

    /*  Q)Q)find frequency of every element :
            array :1,2,3,2,4,3,2,5,7,2,1 

            which one number maximum times repeated */

            public static void freq2(int a[]){
                int max = 0;
                int index = 0;
                boolean checked [] = new boolean[a.length];
                for(int i =0;i<a.length;i++){
                    if(!checked[i]){
                        checked[i] = true;
                        int freq = 1;
                        for(int j = 1+i;j<a.length;j++){
                            if(a[i]== a[j]){
                                checked[j] = true;
                                freq++;
                            }
                        }
                        if(freq>max){
                            max = freq;
                            index = a[i];
                            
                        }
                    }
                }
                System.out.println("This element is most repeated in array : " + index);
            }

    /*  Q)array :
            1,2,3,4,3,2,1 :unique element find 
            ->remove duplicate element 
            ->index */

            public static void unquie(int a[]){
                for(int i =0;i<a.length;i++){
                    for(int j =i+1;j<a.length;j++){
                        if(a[i] == a[j]){
                            a[j] = -1;
                        }
                    }
                }
                for(int i =0;i<a.length;i++){
                    if(a[i]!=-1){
                        System.out.print(a[i] + "\t");
                    }
                }
            }

    /*  Q)array :0 1 0 1 1 0 0 1 1  
        0 0 0 0 1 1 1 1 */

            public static void sortZeroOne(int a[]){
                int count = 0;
                for(int i =0;i<a.length;i++){
                    if(a[i]==0){
                        count++;
                    }
                }
                for(int i =0;i<a.length;i++){
                    if(i<count){
                        a[i] = 0;
                    }else {
                        a[i] = 1;
                    }
                }
                for(int i =0;i<a.length;i++){
                    System.out.print(a[i] + "\t");
                }
            }

    public static void main(String [] args){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        twoSum(a, target);
        System.out.println("-----------------------------------------------");
        int b[] = {1,2,3,4,5,6,7,8,9,10};
        int target1 = 12;
        threeSum(b, target1);
        System.out.println("-----------------------------------------------");
        int c[] = {1,2,3,3,4,5,2,3,5,6,6};
        duplicateEle(c);
        System.out.println("-----------------------------------------------");
        int d[] =  {1,2,3,4,5,2,6,2,7,8,2,9};
        dupi(d);
        System.out.println("-----------------------------------------------");


        int e[] = {1,2,3,2,4,3,2,5,7,2,1};
        frequency(e);
        System.out.println("-----------------------------------------------");

        int f[] = {1,2,3,2,4,3,2,5,7,2,1};
        freq2(f);
        System.out.println("-----------------------------------------------");
        int g[] = {1,2,3,4,3,2,1};
        unquie(g);
        System.out.println("-----------------------------------------------");
        int h[] = {0, 1, 0, 1, 1, 0, 0, 1, 1};
        sortZeroOne(h);



        

    
    }
}



