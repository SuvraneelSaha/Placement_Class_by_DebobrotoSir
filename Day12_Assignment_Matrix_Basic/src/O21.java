import java.util.Arrays;
import java.util.Scanner;

public class O21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row ");
        int n = in.nextInt();
        System.out.println("Please enter the size of the column ");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Please enter the elements in the 1st Array ");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0 ; col < m ; col++)
            {
                arr[row][col] = in.nextInt();

            }
        }
        int[][] brr = new int[n][m];
        System.out.println("Please enter the elements in the 2nd Array ");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0 ; col < m ; col++)
            {
                brr[row][col] = in.nextInt();

            }
        }
        // printing out the 1st array
        System.out.println("1st Array is :");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
        // printing out the 2nd Array
        System.out.println("2nd Array is :");
        for (int[] row : brr)
        {
            System.out.println(Arrays.toString(row));
        }

        // bhalo chele theorem - always treat a person as a good person
        // then if that person does something bad - then it will be
        // treated as a bad person
        int f=1;
        for (int row = 0; row < n; row++)
        {
            for (int col = 0 ; col < m ; col++)
            {
                if(arr[row][col] != brr[row][col])
                {
                    f=0;
                }

            }
        }

        if(f==1)
        {
            System.out.println("Equal Matrix ");

        }
        else
        {
            System.out.println("Not Equal Matrix ");
        }



    }
}
