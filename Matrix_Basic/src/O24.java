import java.util.Arrays;
import java.util.Scanner;

public class O24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 14 rows for 14 days
        // and 2 columns for 2 cities
        int[][] arr = new int[14][2];
        System.out.println("Please enter the temperature of the two cities over the 2 weeks ");
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col <arr[0].length ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        // printing the temp record in a matrix format
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
