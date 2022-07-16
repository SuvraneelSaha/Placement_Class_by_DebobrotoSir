public class O24 {
    public static void main(String[] args) {
        Pattern24(4);
    }
    static void Pattern24(int n)
    {
        for (int row = n; row >=1 ; row--)
        {
            for (int i = 1; i <=row ; i++)
            {
                System.out.print("  ");
            }
            for (int col = n; col >=row ; col--)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
