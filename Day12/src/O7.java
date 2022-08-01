import java.util.Scanner;

public class O7 {
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
        int[][] brr = new int[r][c];
        System.out.println("Enter the number of elements ");
        for (int i = 0; i<arr.length ; i++)
        {
            for (int j = 0; j <arr[i].length ; j++)
            {
                brr[i][j] = in.nextInt();
            }
        }

        int f = 1 ;
        for (int i = 0; i<arr.length ; i++)
        {
            for (int j = 0; j <arr[i].length ; j++)
            {
                if(arr[i][j] != brr[i][j])
                {
                    f=0;
                }
            }
        }

        if(f==1)
        {
            System.out.println("equal matrix ");

        }
        else
        {
            System.out.println("Not equal matrix ");
        }



    }
}
