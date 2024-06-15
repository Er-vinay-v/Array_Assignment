package twoDimensional_arr;

import java.util.Scanner;

/*Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0. */

public class InputFromUser {

    public static void display(int[][]arr,int m,int n){
           System.out.println("user input arr elements :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void positiveNumber(int[][]arr,int m,int n){

        int positiveEle=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]>=0)
                  positiveEle++;
            }
           
        }
       System.out.println("Total number of positive elements is :"+positiveEle);
    }

    public static void negativeNumber(int[][]arr,int m,int n){

        int negativeEle=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               if(arr[i][j]<0) negativeEle++;
            }
           
        }
       System.out.println("Total number of negative elements is :"+negativeEle);
    }

    public static void evenNumber(int[][] arr, int m, int n) {

        int evenEle = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]%2== 0)
                    evenEle++;
            }
        }
        System.out.println("Total number of positive elements is :" + evenEle);
    }

    public static void oddNumber(int[][] arr, int m, int n) {

        int oddEle = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 != 0)
                    oddEle++;
            }
        }
        System.out.println("Total number of odd elements is :" + oddEle);
    }

    public static void zeroesElements(int[][] arr, int m, int n) {

        int zeroEle = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0)
                    zeroEle++;
            }
        }
        System.out.println("Total number of zero elements is :" + zeroEle);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println("Enter number of row of a matrix :");
        int m=sc.nextInt();
        System.out.println("Enter number of column of a matrix :");
        int n=sc.nextInt();
        System.out.println("_____________________________________");
        int [][]arr=new int[m][n];

       //for user input of arr
       System.out.println("Enter (" + n * m + ") elements with space ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("____________________________________________");
       display(arr, m, n);

       System.out.println("____________________________________________");
       System.out.println("positive number of elements is :");
       positiveNumber(arr,m,n);

       System.out.println("____________________________________________");
       System.out.println("negative number of elements is :");
       negativeNumber(arr, m, n);
       
       System.out.println("____________________________________________");
       System.out.println("even number of elements is :");
       evenNumber(arr, m, n);

       System.out.println("____________________________________________");
       System.out.println("odd number of elements is :");
       oddNumber(arr,m,n);

       System.out.println("____________________________________________");
       System.out.println("zero elements of arr is :");
       zeroesElements(arr, m, n);
       
        sc.close();
    }

}
