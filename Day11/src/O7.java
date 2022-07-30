import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        // 2D matrix
        // row and column
        // row - arrow
        // column - building
        // row always first then column
        // as in spelling r and c
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of Rows ");

        int r = in.nextInt();
        System.out.println("enter the number of cols ");
        int c  = in.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j <c ; j++)
            {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }



    }
}
