package twoDimensional_arr;

import java.util.Scanner;

/*Q5: Write a function which accepts a 2D array of integers and its size as arguments and
displays the elements of middle row and the elements of middle column. Printing can
be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...] */
public class MiddleElement_row_col {

    public static void middleElement(int[][]arr,int n){
        System.out.println("middle row and column of matrix arr is :");
        
        int mid = n / 2;
        for(int i=0;i<n;i++){
          
            for(int j=0;j<n;j++){
                
                if(i==mid || j==mid){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter NxN matrinx Number :");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter a odd integer for row and column of matrix");

       
        for (int i = 0; i < n; i++) {
           
            for (int j = 0; j < n; j++) {
                
                arr[i][j] = sc.nextInt();
            }
        }

        middleElement(arr,n);
        sc.close();
    }
    
}
