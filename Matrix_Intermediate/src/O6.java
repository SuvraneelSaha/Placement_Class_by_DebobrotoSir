import java.util.Arrays;
import java.util.Scanner;
// upper right part of an Array :
public class O6 {
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
               //if((row == 0 && col==k) || (row == col && col ==k))
                // this is what i constructed :)
                // needs many many practice
                

                if(row<=col)
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
