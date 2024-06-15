package twoDimensional_arr;

import java.util.Scanner;

//Q3: write a program to print the elements of both the diagonals in a user inputted square matrix in any order.
public class DigonalElement {

    public static void printDiagonal(int[][]arr,int n){
        System.out.println("digonal elements of arr is :");
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j)==(n-1)){
                    System.out.print(arr[i][j]+" ");
                }
            }
         }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter NxN matrinx Number :");
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        
        System.out.println("Enter ("+n*n+") elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        printDiagonal(arr, n);
        sc.close();
    }
}
