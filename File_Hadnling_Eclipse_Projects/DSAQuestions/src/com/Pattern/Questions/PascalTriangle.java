package com.Pattern.Questions;

public class PascalTriangle {
	// function for Pascal's Triangle
    static void printPascal(int n) {
        for (int row = 1; row <= n; row++) {
          
        	for(int k = n-1;k>=row;k--) {
        		System.out.print(" ");
        	}
            // nC0 = 1
            int c = 1; 
            for (int i = 1; i <= row; i++) {

                // The first value in a row is always 1
                System.out.print(c + " ");
                c = c * (row - i) / i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
       
        printPascal(n);
    }
}


