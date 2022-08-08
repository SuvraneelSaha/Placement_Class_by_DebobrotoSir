import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    // spiral matrix
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int r =in.nextInt();
        System.out.println("Please enter the size of the col :");
        int c = in.nextInt();



        int[][] arr = new int[r][c];

        System.out.println("Please enter the elements in the Array:");
        for (int row = 0; row < r; row++)
        {
            for (int col = 0; col < c; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("Original Array : ");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

       // int fr =0,fc=0,lr=

    }
}
