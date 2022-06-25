public class O9 {
    public static void main(String[] args) {
        Pattern9(4);
    }
    static void Pattern9(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            for (int col = 1; col <=row ; col++)
            {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
