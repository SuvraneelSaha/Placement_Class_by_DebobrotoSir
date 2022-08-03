import java.util.Scanner;
// search an element in a 2D array using linear search
public class O7 {
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
        if(linearSearch(arr, target))
        {
            System.out.printf("%d target found ",target);
        }
        else
        {
            System.out.printf("%d target not found ",target);
        }
    }
    static boolean linearSearch(int[][] arr,int target)
    {
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                if(arr[row][col] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
