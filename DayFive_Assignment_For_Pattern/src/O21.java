public class O21 {
    public static void main(String[] args) {
    Pattern21(4);
    }
    static void Pattern21(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            // for spaces
            for (int i = n; i >=row ; i--)
            {
                System.out.print(" ");
            }
            // for printing the stars
            for (int col = 1; col <=row ; col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
