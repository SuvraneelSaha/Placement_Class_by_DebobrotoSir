public class O5 {
    public static void main(String[] args) {
        Pattern5(4);
    }
    public static void Pattern5(int n)
    {
        for (int row = n; row >=1 ; row--)
        {
            for (int col = row; col >=1 ; col--)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
