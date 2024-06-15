package twoDimensional_arr;

import java.util.Scanner;

//Q4: Write a program to find the largest element of a given 2D array of integers.
public class LargestElement {
    public static void largeElement(int[][]arr,int n){
        int maxEle=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>maxEle)maxEle=arr[i][j];
            }
        }
        System.out.println("largest element of arr is :"+maxEle);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter NxN matrinx Number :");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter (" + n * n + ") elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        largeElement(arr, n);
        sc.close();
    }
}
