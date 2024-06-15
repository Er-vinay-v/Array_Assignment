//Q3: Write a program to calculate the maximum element in the array.
public class Find_max_ele {
    public static void main(String[] args) {
        int[]arr={23 ,34,66,67,345,78,122,234};
        int max=Integer.MIN_VALUE;
        for(var i:arr){
            if(i>max)max=i;
        }
        System.out.println("______________________________________");
        System.out.println("max elements of this arr is :"+max);
        System.out.println("______________________________________");
    }
}
