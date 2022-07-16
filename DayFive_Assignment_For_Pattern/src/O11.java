public class O11 {
    public static void main(String[] args) {

        Pattern11(4);
    }
    static void Pattern11(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            for (int col = n; col >=row ; col--)
            {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
