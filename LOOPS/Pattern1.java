public class Pattern1{
    public static void main(String [] args){
        //Assignment Patterns : 13/12/24
                // 1) 
                    // ****
                    // ****
                    // ****
                    // ****

                    for(int i =1;i<=4;i++){
                        for(int j = 1;j<=4;j++){
                            System.out.print("*");
                    }
                    System.out.println();
                }

                    System.out.println("\n------------------------------------------------------------------------------\n");
                //2) 
                    // *
                    // **
                    // ***

                    for(int i =1;i<=3;i++){
                        for(int j =1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //3)
                    // ***
                    // **
                    // * 

                    for(int i=3;i>=1;i--){
                        for(int j =1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");
                //4)
                    // *
                    // **
                    // ***
                    // ***
                    // **
                    // *

                    for(int i = 1;i<=3;i++){
                        for(int j =1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                      for(int i = 3;i>=1;i--){
                        for(int j =1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");
                //5)   *
                    // **
                    // ***
                    // **
                    // *
                    for(int i = 1;i<=3;i++){
                        for(int j =1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                      for(int i = 2;i>=1;i--){
                        for(int j =1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //6)
                    // 12345
                    // 12345
                    // 12345
                    // 12345 
                    // 12345 
                    for(int i = 1;i<=5;i++){
                        for(int j =1;j<=5;j++){
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");
                //7)  
                    // 1111
                    // 2222
                    // 3333
                    // 4444 

                    for(int i =1;i<=4;i++){
                        for(int j=1;j<=4;j++){
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");
                //8) 
                    // 1
                    // 12
                    // 123
                    // 1234 
                
                for(int i =1;i<=4;i++){
                    for(int j = 1;j<=i;j++){
                        System.out.print(j);
                    }
                    System.out.println();
                }
                System.out.println("\n------------------------------------------------------------------------------\n");
                //9) 
                    // 1
                    // 22
                    // 333
                    // 4444
                    for(int i =1;i<=4;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");
                //10)
                    // 54321
                    // 54321
                    // 54321
                    // 54321
                    // 54321 

                    for(int i =1;i<=5;i++){
                        for(int j =5;j>=1;j--){
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //11)  
                    // 55555
                    // 44444
                    // 33333
                    // 22222
                    // 11111 

                    for(int i =5;i>=1;i--){
                        for(int j =1;j<=5;j++){
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //12)   
                    //   * 
                    //  **
                    // ***

                    for(int i =1;i<=3;i++){
                        for(int j =2;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k =1;k<=i;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //13) 
                    // *** 
                    //  ** 
                    //   * 

                    for(int i =1;i<=3;i++){
                        for(int j =1;j<=i;j++){
                            System.out.print(" ");
                        } for(int k =3; k>=i;k--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //14) 

                    //   *
                    //  **
                    // ***
                    // ***
                    //  **
                    //   * 

                    for(int i =1;i<=3;i++){
                        for(int j =2;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k = 1;k<=i;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for(int i =3;i>=1;i--){
                        for(int j =2;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k = 1;k<=i;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //15)
                            //   *
                            //  **
                            // ***
                            //  **
                            //   *
                    
                    for(int i =1;i<=3;i++){
                        for(int j =2;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k = 1;k<=i;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for(int i =2;i>=1;i--){
                        for(int j =2;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k = 1;k<=i;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //16)  
                    //     *   
                    //    * *
                    //   * * * 
                    //  * * * *
                    // * * * * * 

                    for(int i =1;i<=5;i++){
                        for(int j=4;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k =1;k<=i;k++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //17)  
                    // ###*
                    // ##**
                    // #***
                    // ****

                    for(int i =1;i<=4;i++){
                        for(int j =3;j>=i;j--){
                            System.out.print("#");
                        }
                        for(int k =1;k<=i;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //18) 
                    // ****
                    // #***
                    // ##**
                    // ###* 

                    for(int i =4;i>=1;i--){
                        for(int j = 3;j>=i;j--){
                            System.out.print("#");
                        }
                        for(int k =1;k<=i;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //19) 
                    // 1 2 3 4 
                    // 5 6 7 8 
                    // 9 10 11 12 
                    // 13 14 15 16 
                    int count=1;

                    for(int i =1;i<=4;i++){
                        for(int j=1;j<=4;j++){
                            System.out.print(count + " ");
                            count++;
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                    //20) 
                        // 2 4 6 8 10 
                        // 12 14 16 18 20 
                        // 22 24 26 28 30 
                        // 32 34 36 38 40 
                        // 42 44 46 48 50 
                        
                        int count1=2;
                    for(int i =1;i<=5;i++){
                        for(int j=1;j<=5;j++){
                            System.out.print(count1 + " ");
                            count1 = count1+2;
                        
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");
                //21) 
                    // 1 2 3 4 5
                    // 2 4 6 8 10 
                    // 3 6 9 12 15
                    // 4 8 12 16 20 
                    // 5 10 15 20  25 

                    int count2=1;
                    for(int i =1;i<=5;i++){
                        for(int j=1;j<=5;j++){
                            System.out.print(j*count2 + " ");
                            
                        }
                        count2++;
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");
                //22) 
                    // 01010
                    // 10101
                    // 01010
                    // 10101

                    for(int i =1;i<=5;i++){
                        for(int j =1;j<=5;j++){
                         if((i+j)%2==0){
                            System.out.print("0");
                         } else {
                            System.out.print("1");
                         }
                        }
                        System.out.println();
                    }
                     System.out.println("\n------------------------------------------------------------------------------\n");
                //23) 
                    // 1 0 1 0 1
                    // 0 1 0 1 0 
                    // 1 0 1 0 1
                    // 0 1 0 1 0
                
                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=5;j++){
                            if((i+j)%2==0){
                                System.out.print("1 ");
                            } else {
                                System.out.print("0 ");
                            }
                        }
                        System.out.println();
                    }
                     System.out.println("\n------------------------------------------------------------------------------\n");
                
                //24)
                    // 0 0 0 0 
                    // 1 1 1 1 
                    // 0 0 0 0 
                    // 1 1 1 1  

                    for(int i =1;i<=4;i++){
                        for(int j =1;j<=4;j++){
                            if(i%2==0){
                                System.out.print("1 ");
                            } else {
                                System.out.print("0 ");
                            }
                        }
                        System.out.println();
                    }

                     System.out.println("\n------------------------------------------------------------------------------\n");
                
                //25) 
                    // 1 1 1 1 
                    // 0 0 0 0 
                    // 1 1 1 1 
                    // 0 0 0 0 

                    for(int i =1;i<=4;i++){
                        for(int j =1;j<=4;j++){
                            if(j%2==0){
                                System.out.print("0 ");
                            } else {
                                System.out.print("1 ");
                            }
                        }
                        System.out.println();
                    }
                     System.out.println("\n------------------------------------------------------------------------------\n");

                //26) 
                    // * * * *
                    //  * * * 
                    //   * * 
                    //    * 

                    for(int i =4;i>=1;i--){
                        for(int j =4;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k =1;k<=i;k++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                     System.out.println("\n------------------------------------------------------------------------------\n");

                //27) 
                        //    *
                        //   * *
                        //  * * *
                        // * * * * 
                        // * * * *
                        //  * * * 
                        //   * * 
                        //    * 

                        for(int i =1;i<=4;i++){
                            for(int j =4;j>=i;j--){
                                System.out.print(" ");
                            }
                            for(int k =1;k<=i;k++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        for(int i =4;i>=1;i--){
                            for(int j =4;j>=i;j--){
                                System.out.print(" ");
                            }
                            for(int k =1;k<=i;k++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                         System.out.println("\n------------------------------------------------------------------------------\n");

                //28)
                    // *
                    // * * 
                    // *   *
                    // * * * *
                    
                    int line=1;
                    for(int i =1;i<=4;i++){
                        for(int j=1;j<=4;j++){
                            if(j==1 || i==4 || j==line){
                                System.out.print("* ");
                            }
                            else {
                                System.out.print("  ");
                            }
                        }
                        line++;
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //29) 
                    // 1****
                    // 22***
                    // 333**
                    // 4444*
                    // 55555
                    for(int i =1;i<=5;i++){
                    for(int j =1;j<=i;j++){
                        System.out.print(i);
                    }
                    for(int k = 4;k>=i;k--){
                        System.out.print("*");
                    }
                    System.out.println();
                    }

                    System.out.println("\n------------------------------------------------------------------------------\n");

                //30) 
                    // 1****
                    // 12***
                    // 123**
                    // 1234*
                    // 12345

                    for(int i =1;i<=5;i++){
                        for(int j = 1;j<=i;j++){
                            System.out.print(j);
                        }
                        for(int k=4;k>=i;k--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                     System.out.println("\n------------------------------------------------------------------------------\n");

                //31) 
                        // *
                        //  *
                        //   *
                        //    *

                     int dig=1;
                    for(int i=1;i<=4;i++){
                    for(int j =1;j<=4;j++){
                        if(dig == j){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                     System.out.println();
                    dig++;
                }

                    System.out.println("\n------------------------------------------------------------------------------\n");

                //32) 
                    // * * * *
                    // *      *
                    // *      *
                    // * * * *

                    for(int i =1;i<=4;i++){
                        for(int j =1;j<=4;j++){
                            if(i==1 || i == 4 || j == 4 || j==1){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                System.out.println("\n------------------------------------------------------------------------------\n");

                //33)
                    // * * * *  *
                    // *  *      *
                    // *     *   *
                    // *       * *
                    // * * * *  *

                    int lego = 1;
                    for(int i =1;i<=5;i++){
                        for(int j =1;j<=5;j++){
                            if(i==1 || i==5 || j==1 || j==5 ||  lego==j){
                                System.out.print("* "); 
                            }
                            else {
                                System.out.print("  ");
                            }
                        }
                        lego++;
                        System.out.println();
                    }
                      System.out.println("\n------------------------------------------------------------------------------\n");

                //34)
                    // 1 
                    // 4 9 
                    // 16 25 36 

                    int multi=1;
                    int tb=1;
                    for(int i =1;i<=3;i++){
                       
                        for(int j =1;j<=i;j++){
                        tb = multi*multi;
                        System.out.print(tb + " ");
                        multi++;
                        }
                                         
                        System.out.println();
                    }
                      System.out.println("\n------------------------------------------------------------------------------\n");

                //35) 
                    // 1 
                    // 4 4 
                    // 9 9 9 
                    // 16 16 16 16
                    int m = 1; 
                    for(int i =1;i<=4;i++){
                         m = i*i;
                        for(int j=1;j<=i;j++){
                            System.out.print(m + " ");
                        }
                         
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");
                //36)
                    // 1 
                    // 8 27 
                    // 64 125 216 
                    int james = 1;
                    int gunn = 1;
                    for(int i =1;i<=3;i++){
                        for(int j =1;j<=i;j++){
                            james = gunn*gunn*gunn;
                            System.out.print(james + " ");
                            gunn++;
                        }
                    

                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //37)
                    // * * * * 
                    // * 
                    // *
                    // *

                    for(int i =1;i<=4;i++){
                        for(int j =1;j<=4;j++){
                            if(i==1 || j==1){
                                System.out.print("* ");
                            }
                            else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");
                //38)
                    // * * * * * 
                    //        *  *
                    //    *      * 
                    //  *        *
                    // *         *

                    int pat=5;
                    for(int i =1;i<=5;i++){
                        for(int j =1;j<=5;j++){
                            if(i==1 || j==5 || pat==j){
                                System.out.print("* ");
                            }
                            else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                        pat--;
                    }

                    System.out.println("\n------------------------------------------------------------------------------\n");
                //39)
                    //     *
                    //    *
                    //   *
                    // *
                    int digo=4;
                    for(int i =1;i<=4;i++){
                        for(int j =1;j<=4;j++){
                            if(digo==j){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        digo--;
                        System.out.println();
                    }

                    System.out.println("\n------------------------------------------------------------------------------\n");

                //40)
                    // 1 3 5 7 9 
                    // 3 5 7 9 11 
                    // 5 7 9 11 13 
                    // 7 9 11 13 15  
                    // 9 11 13 15 17 
                    
                    int forty;
                   
                    for(int i=0;i<5;i++){
                        forty= 2 * i + 1;;
                        for(int j=1;j<=5;j++){
                            System.out.print(forty + " ");
                            forty = forty+2;
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //41)
                    // 1 0 1 0 1 
                    // 0 0 0 0 0 
                    // 1 0 1 0 1 
                    // 0 0 0 0 0 
                    // 1 0 1 0 1 

                    for(int i =1;i<=5;i++){
                        for(int j=1;j<=5;j++){
                            if(i%2==0){
                            System.out.print("0 ");
                            }
                            else {
                                if(j%2==0){
                                System.out.print("0 ");
                                 } else {
                                System.out.print("1 ");
                            }
                        }
                    }
                    System.out.println();
                }
                     System.out.println("\n------------------------------------------------------------------------------\n");
                //42)
                    // 0 1 0 1 0 
                    // 0 0 0 0 0 
                    // 0 1 0 1 0 
                    // 0 0 0 0 0 
                    // 0 1 0 1 0 

                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=5;j++){
                            if(i%2==0){
                                System.out.print("0 ");
                            } else{
                                if(j%2==0){
                                    System.out.print("1 ");
                                } else {
                                    System.out.print("0 ");
                                }
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //43) 
                        // 0 1 0 1 0
                        // 0 1 0 1 0
                        // 0 1 0 1 0
                        // 0 1 0 1 0
                        // 0 1 0 1 0 
                        for(int i =1;i<=5;i++){
                            for(int j=1;j<=5;j++){
                                if(j%2==0){
                                    System.out.print("1 ");
                                } else {
                                    System.out.print("0 ");
                                }
                            }
                            System.out.println();
                        }
                        System.out.println("\n------------------------------------------------------------------------------\n");

                //44)
                        // 1 0 1 0 1 
                        // 1 0 1 0 1 
                        // 1 0 1 0 1 
                        // 1 0 1 0 1 
                        // 1 0 1 0 1 

                        for(int i=1;i<=5;i++){
                            for(int j =1;j<=5;j++){
                                if(j%2==0){
                                    System.out.print("0 ");
                                } else {
                                    System.out.print("1 ");
                                }
                            }
                            System.out.println();
                        }
                          System.out.println("\n------------------------------------------------------------------------------\n");

                //45) 
                        // 1 
                        // 2 4 
                        // 3 6 9 
                        // 4 8 12 16 
                        // 5 10 15 20 25
                        int five=1;
                        for(int i =1;i<=5;i++){
                            for(int j=1;j<=i;j++){
                                five=i*j;
                                System.out.print(five + " ");
                            }
                            System.out.println();
                        }
                          System.out.println("\n------------------------------------------------------------------------------\n");
                //46)
                    // 1 
                    // 0 0 
                    // 1 1 1 
                    // 0 0 0 0 
                    // 1 1 1 1 1 

                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=i;j++){
                            if(i%2==0){
                                System.out.print("0 ");
                            }
                            else {
                                System.out.print("1 ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

                //47) 
                        // 1
                        // 1 0 
                        // 1 0 1 
                        // 1 0 1 0 
                        // 1 0 1 0 1 

                        for(int i=1;i<=5;i++){
                            for(int j=1;j<=i;j++){
                                if(j%2==0){
                                    System.out.print("0 ");
                                } else {
                                    System.out.print("1 ");
                                }
                            }
                            System.out.println();
                        }

                    System.out.println("\n------------------------------------------------------------------------------\n");

                //48)      
                        //       *
                        //     * * *
                        //   * * * * *
                        // * * * * * * *

                        for(int i=1;i<=5;i++){
                            for(int j=4;j>=i;j--){
                                System.out.print(" ");
                            }
                            for(int k =1;k<=i;k++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }

                    System.out.println("\n------------------------------------------------------------------------------\n");

                //49)
                    // * * * * * * *
                    //  * * * * *
                    //    * * *
                    //      * 

                    for(int i=5;i>=1;i--){
                        for(int j=4;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k=1;k<=i;k++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\n------------------------------------------------------------------------------\n");

                //50) 
                        //       *
                        //     * * *
                        //   * * * * *
                        // * * * * * * *
                        // * * * * * * *
                        //   * * * * *
                        //     * * *
                        //       * 

                        for(int i=1;i<=5;i++){
                            for(int j=4;j>=i;j--){
                                System.out.print(" ");
                            } for(int k=1;k<=i;k++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        for(int i=5;i>=1;i--){
                            for(int j=4;j>=i;j--){
                                System.out.print(" ");
                            }
                            for(int k=1;k<=i;k++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        System.out.println("\n------------------------------------------------------------------------------\n");

                //51)
                            // a
                            // bb
                            // ccc
                            // dddd
                            // eeeee

                            char alp = 'a';
                            for(int i=1;i<=5;i++){
                                for(int j=1;j<=i;j++){
                                    System.out.print(alp);
                                   
                                }
                                alp++;
                                System.out.println();
                            }
                        System.out.println("\n------------------------------------------------------------------------------\n");
                      
                //52)

                        // a 
                        // ab
                        // abc
                        // abcd
                        // abcde
                        char alph;
                        for(int i=1;i<=5;i++){
                            alph='a';
                            for(int j=1;j<=i;j++){
                                System.out.print(alph);
                                alph++;
                            }
                            System.out.println();
                        }

                         System.out.println("\n------------------------------------------------------------------------------\n");

                //53)
                        // A
                        // BB
                        // CCC
                        // DDDD
                        // EEEEE

                        char alpha = 'A';
                         for(int i=1;i<=5;i++){
                                for(int j=1;j<=i;j++){
                                    System.out.print(alpha);  
                                }
                                alpha++;
                                System.out.println();
                            }
                        System.out.println("\n------------------------------------------------------------------------------\n");

                //54)

                        // A
                        // AB
                        // ABC
                        // ABCD
                        // ABCDE
                        char alphab = 'A';
                        for(int i=1;i<=5;i++){
                            alphab = 'A';
                            for(int j=1;j<=i;j++){
                                System.out.print(alphab);
                                alphab++;
                            }
                            System.out.println();
                        }

                        System.out.println("\n------------------------------------------------------------------------------\n");

                //55)
                        // a
                        // bb
                        // ccc
                        // dddd
                        // eeeee
                        char alphaba = 'a';
                        for(int i =1;i<=5;i++){
                            for(int j=1;j<=i;j++){
                                System.out.print(alphaba);
                            }
                            alphaba++;
                            System.out.println();
                        }
                        System.out.println("\n------------------------------------------------------------------------------\n");
                //56) 
                            // a****
                            // ab***
                            // abc**
                            // abcd*
                            // abcde
                            char alphabat;
                            for(int i=1;i<=5;i++){
                             alphabat = 'a';
                                for(int j=1;j<=i;j++){
                                    System.out.print(alphabat);
                                    alphabat++;
                                    }
                                    for(int k=4;k>=i;k--){
                                         System.out.print("*");
                                         }
                                        System.out.println();
                                     }

                         System.out.println("\n------------------------------------------------------------------------------\n");
                

            //57)
                    // A****
                    // BB***
                    // CCC**
                    // DDDD*
                    // EEEEE


                     System.out.println("\n------------------------------------------------------------------------------\n");

            //58)
                    // A****
                    // AB***
                    // ABC**
                    // ABCD*
                    // ABCDE

                    char con;
                    for(int i=1;i<=5;i++){
                        con='A';
                        for(int j=1;j<=i;j++){
                            System.out.print(con);
                            con++;
                        }
                        for(int k =4;k>=i;k--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                     System.out.println("\n------------------------------------------------------------------------------\n");

            //59)

                    // abcde
                    // abcd*
                    // abc**
                    // ab***
                    // a****
                    
                    char cons;
                    for(int i =5;i>=1;i--){
                        cons = 'a';
                        for(int j =1;j<=i;j++){
                            System.out.print(cons);
                            cons++;
                        }
                        for(int k=4;k>=i;k--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                     System.out.println("\n------------------------------------------------------------------------------\n");

            //60) 
                    // ABCDE
                    // ABCD*
                    // ABC**
                    // AB***
                    // A****

                    char consta;
                    for(int i =5;i>=1;i--){
                        consta = 'A';
                        for(int j =1;j<=i;j++){
                            System.out.print(consta);
                            consta++;
                        }
                        for(int k =4;k>=i;k--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                      System.out.println("\n------------------------------------------------------------------------------\n");

            //61) 
                    // eeeee
                    //  dddd
                    //    ccc
                    //     bb
                    //       a

                    char ch1 = 'e';
                    for(int i =5;i>=1;i--){
                        for(int j =1;j<=i;j++){
                            System.out.print(ch1);
                        }
                        ch1--;
                        for(int k =4;k>=1;k--){
                            System.out.print(" ");
                        }
                        System.out.println(); 
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

            //62)
                    // e e e e e
                    // * d d d d 
                    // * * c c c 
                    // * * * b b 
                    // * * * * a
                    char ch2 = 'e';
                    for(int i =5;i>=1;i--){
                         for(int k =4;k>=i;k--){
                            System.out.print("*");
                        }
                        for(int j =1;j<=i;j++){
                            System.out.print(ch2);
                        }
                        ch2--;
                       
                        System.out.println();
                    }

                    System.out.println("\n------------------------------------------------------------------------------\n");

            //63)
                    // EEEEE
                    //  DDDD
                    //    CCC
                    //       BB
                    //         A

                    char ch3 = 'E';
                    for(int i =5;i>=1;i--){
                        for(int j=4;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k =1;k<=i;k++){
                            System.out.print(ch3);
                        }
                        ch3--;
                        System.out.println();
                    }

                    System.out.println("\n------------------------------------------------------------------------------\n");

            //64)
                    // E E E E E
                    // * D D D D
                    // * * C C C
                    // * * * B B
                    // * * * * A

                    char ch5 = 'E';
                    for(int i =5;i>=1;i--){
                        for(int j =4;j>=i;j--){
                            System.out.print("*");
                        }
                        for(int k =1;k<=i;k++){
                            System.out.print(ch5);
                        }
                        System.out.println();
                        ch5--;
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

            //65)
                    // 1 2 3 4 *
                    // 1 2 3 * 5 
                    // 1 2 * 4 5 
                    // 1 * 3 4 5 
                    // * 2 3 4 5 

                    int christ = 5;
                    for(int i =1;i<=5;i++){
                        for(int j =1;j<=5;j++){
                            if(j==christ){
                                System.out.print("*");
                            }
                            else {
                                System.out.print(j);
                            }
                        }
                        christ--;
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

            //66)
                    // * 1 * 2 * 
                    // 3 * 4 * 5
                    // * 6 * 7 *
                    // 8 * 9 * 10 
                    // * 11 * 12 * 

                    int reeve = 5;
                    int pushpa =1;
                    for(int i =1;i<=5;i++){
                        for(int j =1;j<=5;j++){
                            if(j==reeve || i==j){
                                System.out.print("* ");
                            }
                            else {
                                System.out.print(pushpa +  " ");
                                pushpa++;
                            }
                        }
                        reeve--;
                        System.out.println();
                    }
                    System.out.println("\n------------------------------------------------------------------------------\n");

            //67)
                    // 1 3 5 7 9 
                    // 11 13 15 17 19 
                    // 21 23 25 27 29 
                    // 31 33 35 37 39 
                    // 41 43 45 47 49 
                    int purpose = 1;
                    for(int i =1;i<=5;i++){
                        for(int j =1;j<=5;j++){
                            System.out.print(purpose + " ");
                            purpose= purpose+2;
                        }
                        System.out.println();
                    }

                    System.out.println("\n------------------------------------------------------------------------------\n");
            //69)
                // 1 6 11 16 21
                // 2 7 12 17 22
                // 3 8 13 18 23
                // 4 9 14 19 24
                // 5 10 15 20 25
                int after;
                for(int i =1;i<=5;i++){
                    after=i;
                    for(int j =1;j<=5;j++){
                        System.out.print(after + " ");
                        after = after+5;
                    }
                    System.out.println();
                }
                    System.out.println("\n------------------------------------------------------------------------------\n");

            //70)
                    //     1
                    //    12
                    //   123
                    //  1234
                    // 12345

                    for(int i =1;i<=5;i++){
                        for(int k = 4;k>=i;k--){
                            System.out.print(" ");
                        }
                        for(int j =1;j<=i;j++){
                            System.out.print(j);
                        }
                        System.out.println();
                    }

                    /** The End */



                    





                

                                                            
             
                
                                                            
    }
}
