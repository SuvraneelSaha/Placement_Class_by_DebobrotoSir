import java.util.Scanner;

public class O8 {
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
        int[] res = linearSearch(arr,target);
        if(res[0]!=-1 && res[1] != -1)
        {
            System.out.printf("%d is found at row %d and column %d",target,res[0],res[1]);
        }
        else
        {
            System.out.printf("%d is found at row %d and column %d",target,res[0],res[1]);
        }
    }
    static int[] linearSearch(int[][] arr,int target)
    {
        int[] ans = {-1,-1} ;
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                if(arr[row][col] == target)
                {
                    ans[0] = row;
                    ans[1] = col;
                    return ans;
                }
            }
        }
        return ans;
    }
}
