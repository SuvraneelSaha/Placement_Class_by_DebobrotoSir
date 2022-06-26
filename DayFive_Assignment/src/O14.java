public class O14 {
    public static void main(String[] args) {
        Pattern14(4);

    }
    static void Pattern14(int n)
    {
        for (int row = 1; row <=n ; row++)
        {

            for (int col = row; col <=n ; col++)
            {
                System.out.print( "*" + " ");
            }
            System.out.println();
        }
    }
}
