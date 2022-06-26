public class O23 {
    public static void main(String[] args) {
        Pattern23(4);
    }
    static void Pattern23(int n)
    {
        for (int row = n; row >=1 ; row--)
        {
            for (int i = row; i <=n ; i++)
            {
                System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
