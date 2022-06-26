public class O22 {
    public static void main(String[] args) {
    Pattern22(4);
    }
    static void Pattern22(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            // for spaces
            for (int i = 1; i <row ; i++)
            {
                System.out.print(" ");
            }
            // for printing the stars
            for (int col = n; col >=row ; col--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
