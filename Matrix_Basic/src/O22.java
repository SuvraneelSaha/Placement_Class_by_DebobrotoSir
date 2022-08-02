import java.util.Scanner;

public class O22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Please enter the elements in the Array ");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0 ; col < n ; col++)
            {
                arr[row][col] = in.nextInt();

            }
        }
        // identity matrix logic
       if(isIndentityMatrix(arr))
       {
           System.out.println("Identity Matrix ");
       }
       else
       {
           System.out.println("Not");
       }

    }
    static boolean isIndentityMatrix(int[][] arr)
    {
        int f=1;
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0 ; col < arr[0].length ; col++)
            {
                if((row==col && arr[row][col]!=1 ) || (row!=col && arr[row][col]!=0))
                {
                    f=0;
                }

            }
        }
        if(f==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
