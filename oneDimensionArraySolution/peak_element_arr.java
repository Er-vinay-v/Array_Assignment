
//Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
//its just left and just right neighbor.
public class peak_element_arr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 23, 45, 67, 89, 900 };
        int n=arr.length;

        int first_peak=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                first_peak=arr[i];
                break;
            }
        }
           System.out.println("===============================");
        System.out.println("first peak element of arr is :"+first_peak);
    }
}
