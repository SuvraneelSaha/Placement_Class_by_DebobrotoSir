import java.util.Arrays;
import java.util.Scanner;

public class O16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the row");
        while (!in.hasNext("[1-9]+"))
        {
            System.out.println("enter a number");
            in.nextInt();
        }
        int r = in.nextInt();
        if(r%2==0) // ex - r = 4
            // here we are manually decreasing the size of the row if the row is an even integer
        {
            r=r-1;
        }
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

        // printing the middle row
        // arr[r/2][i]
        for (int i = 0; i < arr[0].length ; i++)
        {
            System.out.print(arr[r/2][i] + " ");
        }
    }

}
