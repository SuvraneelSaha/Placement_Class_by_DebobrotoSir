import java.util.Arrays;
import java.util.Scanner;

public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int n =in.nextInt();


        int[][] arr = new int[n][n];

        System.out.println("Please enter the elements in the Array:");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("Original Array : ");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                if(row<col)
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print(arr[row][col] + "\t");
                }
            }
            System.out.println();
        }
    }
}
