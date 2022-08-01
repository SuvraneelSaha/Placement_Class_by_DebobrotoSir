import java.util.Scanner;

public class O5 {
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
        System.out.println("The elements are ");
        for (int i = 0; i<arr.length ; i++)
        {
            for (int j = 0; j <arr[i].length ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int f = 0 ;
        int val = 50 ;

        for (int i = 0; i<arr.length ; i++)
        {
            for (int j = 0; j <arr[i].length ; j++)
            {
               if(val == arr[i][j])
               {
                   f=1;
               }
            }


        }

        if(f==1)
        {
            System.out.println("element found ");
        }
        else
        {
            System.out.println("not found");
        }

    }
}
