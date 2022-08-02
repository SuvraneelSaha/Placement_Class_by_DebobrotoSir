import java.util.Arrays;
import java.util.Scanner;

public class O19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the row");
        int r = in.nextInt();
        System.out.println("enter the size of the Column");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Please enter the elements in the  2D array or matrix");
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        // original array
        System.out.println("1st original Array");
        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));

        }
        // sum of each column
        for (int row = 0; row <c ; row++)
        {
           int sum = 0 ;
            for (int col = 0; col <r ; col++)
            {

                sum = sum +  arr[col][row] ;

            }


                System.out.printf("The sum of the %d column is %d ",row+1,sum);
            System.out.println();


        }


    }
}
