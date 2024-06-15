package twoDimensional_arr;

//Q2: write a program to print the elements above the secondary diagonal in a user inputted square matrix.
public class Primary_and_secondary_diagonal {
    public static void main(String[] args) {
        
        int[][]arr={
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 } 
             
        };

        System.out.print("Secondary Diagonal: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               if((i+j)==(4-1)){
                 System.out.print(arr[i][j]+" ");
               }
            }
        }
    }
       
}
