
// total no. of vehicles - 200
// total wheels - 540 -
//360 + 180 = 540
// TCS mock interview question

import java.io.*;
        import java.util.*;
public class New
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[][] matrix = new int[n][m];
        // for taking input
        for (int row = 0; row <matrix.length ; row++) // outer for loop its iterating each row
        // for every for we are iterating every column using another for loop
        {
            // for each col of each row
            for (int col = 0; col <matrix[row].length ; col++)
            {
                // individual size of the rows only we need that many amount of columns
                // that is the reason why we dont need to define the size of the columns as
                // it is totally dependent on the size of the rows


                matrix[row][col] = in.nextInt();

            }
        }


        Object[] arr = spiralOrder(matrix).toArray();

        System.out.println(Arrays.toString(arr)); // this is printing the Array into Array.toString format
        // ie ex - [1, 3, 5, 4]


        List<Integer> l = spiralOrder(matrix);
        for(int i:l){
            System.out.print(i+" ");
        }
        // this now prints it in a simple format
        // like 1 2 3 4
        // the problem was in the approach
        // i was making the mistake of creating an array and assigning the list in it
        // the thing to be done was
        // make an integer list List<Integer>
        // and use for each loop and print it 

    }
    static List<Integer> spiralOrder(int[][] matrix) {
        int rowS = 0;
        int rowE = matrix.length - 1;
        int colS = 0;
        int colE = matrix[0].length - 1;
        List<Integer> spiral = new ArrayList<>();

        while(rowS <= rowE && colS <= colE) {
            // covering one row, traversing from left to right in latest row...
            for(int i=colS; i<=colE; i++) {
                spiral.add(matrix[rowS][i]);
            }
            // updating starring row...
            rowS++;

            // covering one column, traversing from top to bottom in latest colum...
            for(int i=rowS; i<=rowE; i++) {
                spiral.add(matrix[i][colE]);
            }
            // updating ending colum...
            colE--;

            if(rowS <= rowE) {
                // covering one row, traversing from right to left in latest ending row...
                for(int i=colE; i>=colS; i--) {
                    spiral.add(matrix[rowE][i]);
                }
                // updating ending row...
                rowE--;
            }

            if(colS <= colE) {
                // convering one colum, trabersing from bottom to top in starting colum...
                for(int i=rowE; i>=rowS; i--) {
                    spiral.add(matrix[i][colS]);
                }
                // updating starting colum...
                colS++;
            }
        }
        return spiral;
    }
}
// copied from leetcode