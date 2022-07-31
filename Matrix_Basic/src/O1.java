import java.util.Arrays;
import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Please enter the elements in the 2D array or matrix");
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr.length ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println("the 2D array or matrix is ");
        for (int[] row : arr )
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
