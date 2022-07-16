public class O3 {
    public static void main(String[] args) {
            Pattern3(4);
    }
    public static void Pattern3(int n)
    {
        for (int row = n; row >=1 ; row--)
        {
            for (int col = n; col >=row ; col--)
            {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}
