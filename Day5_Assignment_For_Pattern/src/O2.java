public class O2 {
    public static void main(String[] args) {
        Pattern2(4);
    }
    static void Pattern2(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            for (int col = row; col >=1 ; col--)
            {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }
}
