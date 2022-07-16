public class O13 {
    public static void main(String[] args) {
        Pattern13(4);
    }
    static void Pattern13(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            for (int col = 1; col <=row ; col++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
