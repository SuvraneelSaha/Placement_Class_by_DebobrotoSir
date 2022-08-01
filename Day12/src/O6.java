import java.util.Arrays;
import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the row ");
        int r = in.nextInt();
        System.out.println("enter the column");
        int c = in.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the number of elements ");
        for (int i = 0; i<arr.length ; i++)
        {
            for (int j = 0; j <arr[i].length ; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        // printing the matrix

        for(int[] row:arr)
        {
            System.out.println(Arrays.toString(row));
        }

        for (int i = 0 ; i<arr[0].length;i++)
        {
            int temp = arr[0][i];
            arr[0][i] = arr[r-1][i];
            arr[r-1][i]=temp;
        }

        System.out.println("the elements are ");
        for(int[] row:arr)
        {
            System.out.println(Arrays.toString(row));
        }

    }
}
