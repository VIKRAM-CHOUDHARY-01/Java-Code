//Assignment - 12/02/25


public class Array_Assign3_deep_shallow{
    /* Q.1 int a[]={34,65,243,544,643,232,543,322};

        ->243 greater element find 
        ->total count 
        ->which index   */

        public static void greaterEle(int a[], int greater){
            int count=0;
            String indices ="";
            for(int i = 0;i<a.length;i++){
                if(a[i]>greater){
                    count++;
                    indices += ", " + i;
                }
            }
            System.out.println(
                "Greater element then: " + greater + " are at these indices : " + indices + " and their count is : " + count);
        }

        public static void printArray(int a[]){
            for(int i =0;i<a.length;i++){
                System.out.print(a[i] + "\t");
            }
            System.out.println();
        }
        
                        public static int anonymousArraySum(int a[]){
                            int sum = 0;
                            for(int i =0;i<a.length;i++){
                                sum+=a[i];
                            }
                            return sum;
                        }


    public static void main(String [] args){
        int a[] ={34,65,243,544,643,232,543,322};
        greaterEle(a, 243);

        /*  Q2 shallow copy 
                a[]
                b[]=a
                c[]=b 
                a[] :change check c update  */

                int []a1 = {2,4,5,6,7,8,6,3};
                int b[] = a1;
                int c[] = b;
                System.out.println("Original array a1: ");
                printArray(a1);
                System.out.println("Shallow copy b: ");
                printArray(b);
                System.out.println("Shallow copy c: ");
                printArray(c);
                //changes in a and checking it in c
                a1[0] = 100;
                System.out.println("After changing a1[0] = 100");
                System.out.println("Original array a1: ");
                printArray(a1);
                System.out.println("Shallow copy b: ");
                printArray(b);

                /*  Q3 deep copy 
                        a[]
                        b[]=a
                        c[]=b 
                        a[] :change check c update */

                        int a2[] = {2,5,6,8,5,4,6};
                        int b2 [] = a2.clone();
                        int c2[] = b2.clone();
                        System.out.println("Original array a2: ");
                        printArray(a2);
                        System.out.println("Deep copy b2: ");
                        printArray(b2);
                        System.out.println("Deep copy c2: ");
                        printArray(c2);
                        //changes in a and checking it in c
                        a2[0] = 500;
                        System.out.println("After changin a2[0]");
                        System.out.println("Original array a2: ");
                        printArray(a2);
                        System.out.println("C2 array : ");
                        printArray(c2);


                /*  Q4  anonymous array :
                        addition all array  */


                        System.out.println(anonymousArraySum(new int[]{3,4,56,7,8,4}));


                /*  Q5  wrapper classes :array              */

                    //All wrapper classes in array :
                    //1)
                    System.out.println("---------------------------------------------------");
                    Integer arr[] = {2,4,5,23,7};
                    for(int i =0;i<arr.length;i++){
                        System.out.print(arr[i] + "\t");
                    }
                    System.out.println();
                     System.out.println("---------------------------------------------------");
                    //2)
                    Boolean []arr2 = {true, false};
                        for(int i =0;i<arr2.length;i++){
                        System.out.print(arr2[i] + "\t");
                    }
                    System.out.println();

                    System.out.println("---------------------------------------------------");
                    //3)
                    Character []arr3 = {'g', 'f', '3', 'h'};
                        for(int i =0;i<arr3.length;i++){
                        System.out.print(arr3[i] + "\t");
                    }
                    System.out.println();
                    System.out.println("---------------------------------------------------");
                    //4)
                    Byte []arr4 = {3, 5, 6, 3};
                        for(int i =0;i<arr4.length;i++){
                        System.out.print(arr4[i] + "\t");
                    }
                    System.out.println();
                     System.out.println("---------------------------------------------------");
                    //5)
                    Short []arr5 = {3, 5, 6, 3};
                        for(int i =0;i<arr5.length;i++){
                        System.out.print(arr5[i] + "\t");
                    }
                    System.out.println();
                      System.out.println("---------------------------------------------------");
                    //6)
                    Long []arr6 = {3l, 5l, 6l, 3l};
                        for(int i =0;i<arr6.length;i++){
                        System.out.print(arr6[i] + "\t");
                    }
                    System.out.println();
                     System.out.println("---------------------------------------------------");
                    //7)
                    Float []arr7 = {3.4f, 5.6f, 6.64f, 3.7f};
                        for(int i =0;i<arr7.length;i++){
                        System.out.print(arr7[i] + "\t");
                    }
                    System.out.println();
                          System.out.println("---------------------------------------------------");
                    //8)
                    Double []arr8 = {3.4, 5.6, 6.64, 3.7};
                        for(int i =0;i<arr8.length;i++){
                        System.out.print(arr8[i] + "\t");
                    }
                    System.out.println();

                    







    }
}