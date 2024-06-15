//Q4: Write a program to find out the second largest element in a given array.

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 23, 34, 66, 67, 345, 78, 122, 234 };

        //first method are use to solve this problem
     /*
      * int max=Integer.MIN_VALUE;
      * int second_max = Integer.MIN_VALUE;
      * for(var i:arr){
      * if(i>max)
      * max = i;
      * 
      * }
      * 
      * for (var i : arr) {
      * if(i==max)continue;
      * else second_max=i;
      * 
      * }
      * 
      * System.out.println("----------------------------------------");
      * System.out.println("First max element of arr is :"+max);
      * System.out.println("second max element is :"+second_max);
      */

      // second method are use to solve this problem
      Arrays.sort(arr);
      System.out.println("Second max element of arr is :"+arr[arr.length-2]);


    }
}
