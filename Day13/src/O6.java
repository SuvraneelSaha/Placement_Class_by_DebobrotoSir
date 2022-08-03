import java.util.Arrays;
import java.util.Scanner;
// border elements
public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int r = in.nextInt();

        System.out.println("Please enter the number of column:");
        int c = in.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the elements : ");
        for (int i = 0; i <r ; i++)
        {
            for (int j = 0; j <c ; j++)
            {
                arr[i][j] = in.nextInt();

            }
        }

        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        for (int i = 0; i <r ; i++)
        {
            for (int j = 0; j <c ; j++)
            {
                if(i==0 || i==r-1 || j==0 || j==c-1)
                {
                    System.out.print(arr[i][j] + "\t");
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
