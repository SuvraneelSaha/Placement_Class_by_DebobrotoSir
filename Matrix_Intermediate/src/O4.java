import java.util.Arrays;
import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int n =in.nextInt();
        System.out.println("Please enter the size of the column :");
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Please enter the elements in the Array:");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < m; col++)
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
            for (int col = 0; col < m ; col++)
            {
                if(row==0|| row==n-1 || col ==0||col ==m-1)
                {

                    System.out.print(arr[row][col] +"\t");
                }
                else
                {

                    System.out.print("\t");
                }

            }
            System.out.println();
        }

    }
}
