public class O8 {
    public static void main(String[] args) {
        Pattern8(4);
    }
    public static void Pattern8(int n)
    {
        for (int row = 1; row <=n ; row++)
        {

            for (int col = row; col <=n ; col++)
            {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}
