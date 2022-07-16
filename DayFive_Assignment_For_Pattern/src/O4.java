public class O4 {
    public static void main(String[] args) {
        Pattern4(4);
    }
    public static void Pattern4(int n)
    {
        for (int row = n; row >=1 ; row--)
        {
            for (int col = row; col <=n ; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
