import java.util.Scanner;

public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the row");
        int r = in.nextInt();
        System.out.println("enter the size of the Column");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Please enter the elements in the 2D array or matrix");
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println("please enter the target element:");
        int target = in.nextInt();

        if(frequency(arr,target) == 0)
        {
            System.out.printf("%d is not found",target);
        }
        else
        {
            System.out.printf("frequency of %d is %d",target,frequency(arr,target));
        }

    }
    static int frequency(int[][] arr,int target)
    {
        int count = 0 ;
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                if(arr[row][col] == target)
                {
                    count +=1;
                }
            }
        }
        return count;
    }
}
